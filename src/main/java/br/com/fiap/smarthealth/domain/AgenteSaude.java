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
@Table(name = "ht03_agsaude")
public class AgenteSaude {
	
	//Atributos ou colunas da tabela

	@Id
	@SequenceGenerator(name="agente",sequenceName="sq_ht03_agsaude",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="agente")
    @Column(name = "ag_id", nullable = false)
	private Integer id;
	
	@Column(name = "ag_nome", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "ag_cpf", length = 11, nullable = false)
	private String cpf;
	
	@Column(name = "ag_cpf_emissor", length = 5, nullable = false)
	private String cpfEmissor;
	
	@Column(name = "ag_cpf_uf", length = 2, nullable = false)
	private String cpfUf;
	
	@Column(name = "ag_telefone", length = 14, nullable = false)
	private String telefone;
	
	@Column(name = "ag_nascimento",  nullable = false)
	private LocalDate dtNascimento;
	
	@Column(name = "ag_cns", length = 15, nullable = false)
	private String cns;

	
	//Construtores
	
	public AgenteSaude() {
		super();
	}

	
	public AgenteSaude(String nome, String cpf, String cpfEmissor, String cpfUf, String telefone,
			LocalDate dtNascimento, String cns) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cpfEmissor = cpfEmissor;
		this.cpfUf = cpfUf;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.cns = cns;
	}


	public AgenteSaude(Integer id, String nome, String cpf, String cpfEmissor, String cpfUf, String telefone,
			LocalDate dtNascimento, String cns) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cpfEmissor = cpfEmissor;
		this.cpfUf = cpfUf;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.cns = cns;
	}
	

	//Getters e Setters

	public Integer getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public String getCpfEmissor() {
		return cpfEmissor;
	}


	public String getCpfUf() {
		return cpfUf;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public LocalDate getDtNascimento() {
		return dtNascimento;
	}


	public String getCns() {
		return cns;
	}
	
	
	
	
	
}
