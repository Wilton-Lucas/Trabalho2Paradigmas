package br.com.controller;

import java.util.List;

import br.com.hibernate.dao.IDAO;
import br.com.model.Aluno;

import java.util.ArrayList;

public class AlunoService implements IDAO {

	@Override
	public boolean inserir(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean apagar(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean alterar(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List buscarTodos(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List buscar(String filtro, Object value, boolean ifvalueString,
			Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object buscar(Object obj, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object validate(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}