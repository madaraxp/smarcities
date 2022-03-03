package br.com.fiap.smarthealth.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ht06_regvacin")
public class RegistroVacina {
	
	//Atributos ou colunas da tabela
	
	@Id
	@SequenceGenerator(name="vacina",sequenceName="sq_ht06_regvacin",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="vacina")
    @Column(name = "rv_id", nullable = false)
	private Integer id;
	
	@Column(name = "rv_nome", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "rv_data", nullable = false)
	private LocalDate data;
	
	@Column(name = "rv_vencimento")
	private LocalDate vencimento;

	
	//Construtores
	
	public RegistroVacina() {
		super();
	}

	public RegistroVacina(Integer id, String nome, LocalDate data, LocalDate vencimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.vencimento = vencimento;
	}
	
	
	//Getters e Setters

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getData() {
		return data;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}
	
	
}
