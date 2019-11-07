package br.com.controller;

import java.util.List;
import br.com.model.Aluno;

import java.util.ArrayList;

public class AlunoService {

	public String addAluno(Aluno aluno) {

		AlunoDAO dao = new AlunoDAO();

		if (dao.inserir(aluno))
			return "Gravou";
		else
			return "Nao Gravou";

	}

	public String editAluno(Aluno aluno) {
		AlunoDAO dao = new AlunoDAO();
		dao.alterar(aluno);
		return "Aluno cod:"+aluno.getIdAluno()+" foi alterado.";
	}

	public String deleteAluno(Aluno aluno) {
		AlunoDAO dao = new AlunoDAO();
		dao.apagar(aluno);
		return "Aluno cod:"+aluno.getIdAluno()+" foi apagado.";
	}

	public String findByIdAluno(Integer idAluno) {

		AlunoDAO dao = new AlunoDAO();
		Aluno aluno = dao.buscar(idAluno);
		String ret = "";
		ret+="Nome: "+aluno.getNome();
		ret+="\nMatricula: "+aluno.getMatricula();
		return ret;

	}

	public String findAllAlunos() {
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
		
		return ret;

	}

}