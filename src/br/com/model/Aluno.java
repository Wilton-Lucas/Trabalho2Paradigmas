package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Aluno {
	@Id
	@GeneratedValue
	@Column(name="id_aluno")
	private int idAluno;
	
	private String nome;
	private String matricula;
	
	@OneToOne
	@JoinColumn(name="id_aluno")
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