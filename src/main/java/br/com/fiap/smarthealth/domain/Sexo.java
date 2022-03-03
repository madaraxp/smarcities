package br.com.fiap.smarthealth.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ht10_sexo")
public class Sexo {

	//Atributos ou colunas da tabela
	
	@Id
	@SequenceGenerator(name="sexo",sequenceName="sq_ht10_sexo",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sexo")
    @Column(name = "sx_id", nullable = false)
	private Integer id;
	
	@Column(name = "sx_identificacao", length = 50, nullable = false)
	private String identificacao;
	
	
	//Construtores

	public Sexo() {
		super();
	}

	public Sexo(String identificacao) {
		super();
		this.identificacao = identificacao;
	}

	public Sexo(Integer id, String identificacao) {
		super();
		this.id = id;
		this.identificacao = identificacao;
	}
	
	//Getters e Setters

	public Integer getId() {
		return id;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	
}
