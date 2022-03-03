package br.com.fiap.smarthealth.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ht04_familia")
public class Familia {
	
	//Atributos ou colunas da tabela
	
	@Id
	@SequenceGenerator(name="familia",sequenceName="sq_ht04_familia",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="familia")
    @Column(name = "fm_id", nullable = false)
	private Integer id;

	@Column(name = "fm_sobrenome", length = 150, nullable = false)
	private String sobrenome;
	
	@Column(name = "fm_cns", length = 15, nullable = false)
	private String cns;
	
	@Column(name = "fm_cep", length = 9, nullable = false)
	private String cep;
	
	@Column(name = "fm_endereco", length = 150, nullable = false)
	private String endereco;
	
	@Column(name = "fm_complemento", length = 30)
	private String complemento;
	
	@Column(name = "fm_bairro", length = 150, nullable = false)
	private String bairro;
	
	@Column(name = "fm_telefone", length = 14, nullable = false)
	private String telefone;
	
	@Column(name = "fm_email", length = 30, nullable = false)
	private String email;


	//Construtores

	public Familia() {
		super();
	}

	public Familia(Integer id, String sobrenome, String cns, String cep, String endereco, String complemento,
			String bairro, String telefone, String email) {
		super();
		this.id = id;
		this.sobrenome = sobrenome;
		this.cns = cns;
		this.cep = cep;
		this.endereco = endereco;
		this.complemento = complemento;
		this.bairro = bairro;
		this.telefone = telefone;
		this.email = email;
	}

	
	//Getters e Setters
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCns() {
		return cns;
	}
	
	

	
}
