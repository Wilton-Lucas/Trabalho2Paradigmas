package br.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Telefone {
	@Id
	@GeneratedValue
	private int idTelefone;
	private String numero;

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