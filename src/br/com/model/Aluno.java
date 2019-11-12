package br.com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="aluno")
public class Aluno {
	@Id
	@GeneratedValue
	@Column(name="codigo")
	private int idAluno;
	
	private String nome;
	private String matricula;
	
	@OneToOne	
	@JoinColumn(name="codigo")
	private Telefone telefone;

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

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	

	

	

}