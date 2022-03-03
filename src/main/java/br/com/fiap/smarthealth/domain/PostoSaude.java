package br.com.fiap.smarthealth.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ht01_saude")
public class PostoSaude {
	
	//Atributos ou colunas da tabela
	
	@Id
	@SequenceGenerator(name="saude",sequenceName="sq_ht01_medico",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="saude")
    @Column(name = "ps_id", nullable = false)
	private Integer id;
	
	@Column(name = "ps_nome", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "ps_cnpj", length = 14, nullable = false)
	private String cnpj;
	
	@Column(name = "ps_cep", length = 9, nullable = false)
	private String cep;
	
	@Column(name = "ps_endereco", length = 150, nullable = false)
	private String endereço;
	
	@Column(name = "ps_complemento", length = 30)
	private String complemento;
	
	@Column(name = "ps_bairro", length = 150, nullable = false)
	private String bairro;
	
	@Column(name = "ps_telefone", length = 14, nullable = false)
	private String telefone;
	
	@Column(name = "ps_email", length = 30, nullable = false)
	private String email;
	
	@Column(name = "ps_horario", length = 10)
	private String horario;

	
	//Construtores
	
	public PostoSaude() {
		super();
	}

	public PostoSaude(Integer id, String nome, String cnpj, String cep, String endereço, String complemento,
			String bairro, String telefone, String email, String horario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.cep = cep;
		this.endereço = endereço;
		this.complemento = complemento;
		this.bairro = bairro;
		this.telefone = telefone;
		this.email = email;
		this.horario = horario;
	}
	
	
	//Getters e Setters

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}
		
}
