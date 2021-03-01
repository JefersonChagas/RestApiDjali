package br.com.djali.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Profissional")
public class Profissional implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private long crm;
	private String nome;
	private String especialidade;
	
	
	public long getCrm() {
		return crm;
	}
	public void setCrm(long crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	
	

}
