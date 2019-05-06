package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sargenteacao.domain.enums.PostGrad;

@Entity
public class Militar implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer antiguidade;
	private String nome;
	private String nomeGuerra;
	private String identidade;
	private String cpf;
	private String nomePai;
	private String nomeMae;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataNascimento;
	private String endereco;
	private String telefone;
	private Boolean pronto;
	private Integer postGrad;
	
	@ManyToMany(mappedBy = "militares")
	@JsonIgnore
	private List<Missao> missoes = new ArrayList<>();
	
	@OneToMany(mappedBy = "escalado")
	@JsonIgnore
	private List<EscalaServico> servicos = new ArrayList<>();
	
	
	public Militar(){
		
	}

	public Militar(Integer id, Integer antiguidade, String nome, String nomeGuerra, String identidade, String cpf,
			String nomePai, String nomeMae, Date dataNascimento, String endereco, String telefone, Boolean pronto, PostGrad postGrad) {
		super();
		this.id = id;
		this.antiguidade = antiguidade;
		this.nome = nome;
		this.nomeGuerra = nomeGuerra;
		this.identidade = identidade;
		this.cpf = cpf;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
		this.pronto = pronto;
		this.postGrad = postGrad.getCod();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAntiguidade() {
		return antiguidade;
	}

	public void setAntiguidade(Integer antiguidade) {
		this.antiguidade = antiguidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeGuerra() {
		return nomeGuerra;
	}

	public void setNomeGuerra(String nomeGuerra) {
		this.nomeGuerra = nomeGuerra;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getPronto() {
		return pronto;
	}

	public void setPronto(Boolean pronto) {
		this.pronto = pronto;
	}

	public PostGrad getPostGrad() {
		return PostGrad.toEnum(postGrad);
	}

	public void setPostGrad(PostGrad postGrad) {
		this.postGrad = postGrad.getCod();
	}
	
	public List<Missao> getMissoes() {
		return missoes;
	}

	public void setMissoes(List<Missao> missoes) {
		this.missoes = missoes;
	}
	
	public List<EscalaServico> getServicos() {
		return servicos;
	}

	public void setServicos(List<EscalaServico> servicos) {
		this.servicos = servicos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Militar other = (Militar) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
