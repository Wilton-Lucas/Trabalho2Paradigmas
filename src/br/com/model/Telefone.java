package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="telefone")
public class Telefone {
	@Id
	@GeneratedValue
	@Column(name="codigo" )
	private int idTelefone;
	private String numero;
	
	@OneToOne(mappedBy="telefone",targetEntity=Aluno.class)
	Aluno aluno;
	

	public void setIdTelefone(int idTelefone) {
		this.idTelefone = idTelefone;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getIdTelefone() {
		return this.idTelefone;
	}

	public String getNumero() {
		return this.numero;
	}
}