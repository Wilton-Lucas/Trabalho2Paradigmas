package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;



@Entity
public class Aluno {
	
	@GeneratedValue()
	private int idAluno;
	@Column()
	private String nome;
	private String matricula;
	private Telefone fone;

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdAluno() {
		return this.idAluno;
	}

	public String getNome() {
		return this.nome;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setTelefone(Telefone fone) {
		this.fone = fone;
	}

	public Telefone getTelefone() {
		return this.fone;
	}

}