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
@Table(name = "ht02_medico")
public class Medico {
	
	//Atributos ou colunas da tabela

	
	@Id
	@SequenceGenerator(name="medico",sequenceName="sq_ht02_medico",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="medico")
    @Column(name = "md_id", nullable = false)
	private Integer id;
	
	@Column(name = "md_nome", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "md_cpf", length = 11, nullable = false)
	private String cpf;
	
	@Column(name = "md_cpf_emissor", length = 5)
	private String cpfEmissor;
	
	@Column(name = "md_cpf_uf", length = 2, nullable = false)
	private String cpfUf;
	
	@Column(name = "md_cpnj", length = 14, nullable = false)
	private String cpnj;
	
	@Column(name = "md_crm", length = 10, nullable = false)
	private String crm;
	
	@Column(name = "md_crm_uf", length = 2, nullable = false)
	private String crmUf;
	
	@Column(name = "md_telefone", length = 14, nullable = false)
	private String telefone;
	
	@Column(name = "md_nascimento", nullable = false)
	private LocalDate dtNascimento;

	
	//Construtores
	
	public Medico() {
		super();
	}

	public Medico(Integer id, String nome, String cpf, String cpfEmissor, String cpfUf, String cpnj, String crm,
			String crmUf, String telefone, LocalDate dtNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cpfEmissor = cpfEmissor;
		this.cpfUf = cpfUf;
		this.cpnj = cpnj;
		this.crm = crm;
		this.crmUf = crmUf;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
	}
	
	
	//Getters e Setters

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

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

	public String getCpnj() {
		return cpnj;
	}

	public String getCrm() {
		return crm;
	}

	public String getCrmUf() {
		return crmUf;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	
	
	
	
	
	
}
