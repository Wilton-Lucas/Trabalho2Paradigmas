package br.com.aspect;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import br.com.controller.AlunoDAO;
import br.com.model.Aluno;
import br.com.controller.AlunoService;;

public aspect Aspect {

	/*
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
		AlunoDAO dao = new AlunoDAO();

		if (dao.inserir(a))
			System.out.println("Gravou");
		else
			System.out.println("Nao Gravou");
	}
	
	after(Aluno a) : apagar() && args (a)
	{
		AlunoDAO dao = new AlunoDAO();
		dao.apagar(a);
		System.out.println("Aluno cod:"+a.getIdAluno()+" foi apagado.");
	}
	
	after(Aluno a, Integer i) : buscar() && args (a, i)
	{
		AlunoDAO dao = new AlunoDAO();
		Aluno aluno = dao.buscar(i);
		String ret = "";
		ret+="Nome: "+aluno.getNome();
		ret+="\nMatricula: "+aluno.getMatricula();
		System.out.print(ret);
	}
	
	after() : buscarTodos()
	{
		List<Aluno> alunos = new ArrayList<Aluno>();
		AlunoDAO dao = new AlunoDAO();
		alunos = dao.buscarTodos();
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
		AlunoDAO dao = new AlunoDAO();
		dao.alterar(a);
		System.out.println("Aluno cod:"+a.getIdAluno()+" foi alterado.");
	}
	*/

}
