package br.com.fiap.smarthealth.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ht09_especiali")
public class Especialidade {
	
	//Atributos ou colunas da tabela
	
	@Id
	@SequenceGenerator(name="especialidade",sequenceName="sq_ht09_especiali",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="especialidade")
    @Column(name = "es_id", nullable = false)
	private Integer id;
	
	@Column(name = "es_tipo", length = 150, nullable = false)
	private String tipo;
	

	//Construtores
	
	public Especialidade() {
		super();
	}

	
	public Especialidade(String tipo) {
		super();
		this.tipo = tipo;
	}


	public Especialidade(Integer id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}
	
	
	//Getters e Setters

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	
	
	
}
