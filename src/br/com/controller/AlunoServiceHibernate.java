package br.com.controller;

import java.util.List;

import br.com.hibernate.dao.HDAO;
import br.com.model.Aluno;

import java.util.ArrayList;

public class AlunoServiceHibernate {

	public String addAluno(Aluno aluno) {

		HDAO hdao = new HDAO();

		if (hdao.inserir(aluno))
			return "Gravou";
		else
			return "Nao Gravou";

	}

	public String editAluno(Aluno aluno) {
		HDAO dao = new HDAO();
		dao.alterar(aluno);
		return "Aluno cod:"+aluno.getIdAluno()+" foi alterado.";
	}

	public String deleteAluno(Aluno aluno) {
		HDAO dao = new HDAO();
		dao.apagar(aluno);
		return "Aluno cod:"+aluno.getIdAluno()+" foi apagado.";
	}

	public String findByIdAluno(Integer idAluno) {

		HDAO dao = new HDAO();
		Aluno aluno =(Aluno) dao.buscar(new Aluno(),idAluno);
		String ret = "";
		ret+="Nome: "+aluno.getNome();
		ret+="\nMatricula: "+aluno.getMatricula();
		return ret;

	}

	public String findAllAlunos() {
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
		
		return ret;

	}

}