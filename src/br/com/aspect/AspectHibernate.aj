package br.com.aspect;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import br.com.hibernate.dao.HDAO;
import br.com.model.Aluno;
import br.com.controller.AlunoService;;

public aspect AspectHibernate {

	pointcut setIdAluno() : set (* Aluno.idAluno);
	pointcut setNome() : set (* Aluno.nome);
	pointcut setMatricula() : set (* Aluno.matricula);
	pointcut setTelefone() : set (* Aluno.fone);
	
	pointcut inserir() : call (* AlunoService.inserir(..)) && args(Aluno);
	pointcut apagar() : call (* AlunoService.apagar(..)) && args(Aluno);
	pointcut buscar() : call (* AlunoService.buscar(..)) && args(Aluno, Integer);
	pointcut buscarTodos() : call (* AlunoService.buscarTodos(..));
	pointcut alterar() : call (* AlunoService.alterar(..)) && args(Aluno);

	
	
	
	after(Aluno a) : setMatricula() && target(a)
	{
		if (a.getMatricula().equals("")) {
			System.out.println("Valor para matricula nao adequado");
		} else {
			System.out.println("Valor matricula adequado");
		}
	}

	after(Aluno a) : setNome() && target(a)
	{
		if (a.getNome().equals("") || Pattern.compile("[0-9]").matcher(a.getNome()).find()) {
			System.out.println("Valor para nome nao adequado");
		} else {
			System.out.println("Valor nome adequado");
		}
	}

	after(Aluno a) : setTelefone() && target(a)
	{
		if (a.getTelefone().equals("") || Pattern.compile("[a-zA-Z]").matcher(a.getNome()).find()) {
			System.out.println("Valor para telefone n�o adequado");
		} else {
			System.out.println("Valor telefone adequado");
		}
	}

	after(Aluno a) : inserir() && args (a)
	{
		HDAO hdao = new HDAO();

		if (hdao.inserir(a))
			System.out.println("Gravou");
		else
			System.out.println("Nao Gravou");
	}
	
	after(Aluno a) : apagar() && args (a)
	{
		HDAO dao = new HDAO();
		dao.apagar(a);
		System.out.println("Aluno cod:"+a.getIdAluno()+" foi apagado.");
	}
	
	after(Aluno a, Integer i) : buscar() && args (a, i)
	{
		HDAO dao = new HDAO();
		Aluno aluno =(Aluno) dao.buscar(new Aluno(),i);
		String ret = "";
		ret+="Nome: "+aluno.getNome();
		ret+="\nMatricula: "+aluno.getMatricula();
		System.out.println(ret);
	}
	
	after() : buscarTodos()
	{
		List<Aluno> alunos = new ArrayList<Aluno>();
		HDAO dao = new HDAO();
		alunos = dao.buscarTodos(new Aluno());
		String ret = "";
		for (Aluno aluno : alunos) {
			ret+=aluno.getIdAluno();
			ret+=" - ";
			ret+=aluno.getNome();
			ret+=" - ";
			ret+=aluno.getMatricula();
			ret+="\n";
		}
		
		System.out.println(ret);
		
		
	}
	
	after(Aluno a) : alterar() && args (a)
	{
		HDAO dao = new HDAO();
		dao.alterar(a);
		System.out.println("Aluno cod:"+a.getIdAluno()+" foi alterado.");
	}
	

}
