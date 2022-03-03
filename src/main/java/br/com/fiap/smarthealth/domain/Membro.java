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
@Table(name = "ht05_membro")
public class Membro {

	//Atributos ou colunas da tabela
	
	@Id
	@SequenceGenerator(name="membro",sequenceName="sq_ht05_membro",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="membro")
    @Column(name = "mb_id", nullable = false)
	private Integer id;
	
	@Column(name = "mb_nome", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "mb_nome_social", length = 150)
	private String nomeSocial;
	
	@Column(name = "mb_cpf", length = 11, nullable = false)
	private String cpf;
	
	@Column(name = "mb_cpf_emissor", length = 5, nullable = false)
	private String cpfEmissor;
	
	@Column(name = "mb_cpf_uf", length = 2, nullable = false)
	private String cpfUf;
	
	@Column(name = "mb_rg", length = 15, nullable = false)
	private String rg;
	
	@Column(name = "mb_nascimento", nullable = false)
	private LocalDate dtNascimento;
	
	@Column(name = "mb_responsavel", nullable = false)
	private char responsavel;
	
	
	//Construtores

	public Membro() {
		super();
	}

	public Membro(Integer id, String nome, String nomeSocial, String cpf, String cpfEmissor, String cpfUf, String rg,
			LocalDate dtNascimento, char responsavel) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.cpfEmissor = cpfEmissor;
		this.cpfUf = cpfUf;
		this.rg = rg;
		this.dtNascimento = dtNascimento;
		this.responsavel = responsavel;
	}

	
	//Getters e Setters
	
	public char getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(char responsavel) {
		this.responsavel = responsavel;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeSocial() {
		return nomeSocial;
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

	public String getRg() {
		return rg;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	
	
	
}
