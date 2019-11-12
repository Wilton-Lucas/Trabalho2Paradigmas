package br.com.aspect;

import java.sql.DriverManager;
import java.util.regex.Pattern;

import br.com.controller.AlunoDAO;
import br.com.model.Aluno;

public aspect Aspect {

	pointcut setIdAluno() : set (* Aluno.idAluno);
	pointcut setNome() : set (* Aluno.nome);
	pointcut setMatricula() : set (* Aluno.matricula);
	pointcut setTelefone() : set (* Aluno.fone);
	pointcut getIdAluno() : get (* Aluno.idAluno);
	pointcut getNome() : get (* Aluno.nome);
	pointcut getMatricula() : get (* Aluno.matricula);
	pointcut getTelefone() : get (* Aluno.fone);
	pointcut inserir() : call (* AlunoDAO.inserir(..));
	pointcut apagar() : call (* AlunoDAO.apagar(..));
	pointcut buscar() : call (* AlunoDAO.buscar(..));
	pointcut buscarTodos() : call (* AlunoDAO.buscarTodos(..));
	pointcut alterar() : call (* AlunoDAO.alterar(..));

	after(Aluno a) : setMatricula() && target(a)
	{
		if (a.getMatricula().equals("")) {
			System.out.println("Valor para matricula n�o adequado");
		} else {
			System.out.println("Valor matricula adequado");
		}
	}

	after(Aluno a) : setNome() && target(a)
	{
		if (a.getNome().equals("") || Pattern.compile("[0-9]").matcher(a.getNome()).find()) {
			System.out.println("Valor para nome n�o adequado");
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

	/*
	 * before(AlunoDAO dao): inserir() && target(dao){ try { dao.setConn(
	 * DriverManager.getConnection("jdbc:mysql://172.17.0.2/pdp","root","admin"));
	 * dao.setStmt(dao.getConn().createStatement());
	 * System.out.println("conex�o criada com sucesso!");
	 * 
	 * }catch(Exception E){ E.printStackTrace(); } }
	 */

}
