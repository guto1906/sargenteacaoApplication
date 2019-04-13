package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sargenteacao.domain.enumerado.PostoEscalado;
import com.sargenteacao.domain.enumerado.TipoFolga;

@Entity
public class ServicoEscala implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date data;
	private Militar substituto;
	private Integer postoEscaldo;
	private Integer tipoFolga;
	
	@ManyToOne
	@JoinColumn(name = "designado_id")
	private Militar designado;
	
	public ServicoEscala() {
		
	}

	public ServicoEscala(Integer id, Date data, Militar substituto, PostoEscalado postoEscaldo, TipoFolga tipoFolga,
			Militar designado) {
		super();
		this.id = id;
		this.data = data;
		this.substituto = substituto;
		this.postoEscaldo = postoEscaldo.getCod();
		this.tipoFolga = tipoFolga.getCod();
		this.designado = designado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Militar getSubstituto() {
		return substituto;
	}

	public void setSubstituto(Militar substituto) {
		this.substituto = substituto;
	}

	public PostoEscalado getPostoEscaldo() {
		return PostoEscalado.toEnum(postoEscaldo);
	}

	public void setPostoEscaldo(PostoEscalado postoEscaldo) {
		this.postoEscaldo = postoEscaldo.getCod();
	}

	public TipoFolga getTipoFolga() {
		return TipoFolga.toEnum(tipoFolga);
	}

	public void setTipoFolga(TipoFolga tipoFolga) {
		this.tipoFolga = tipoFolga.getCod();
	}

	public Militar getDesignado() {
		return designado;
	}

	public void setDesignado(Militar designado) {
		this.designado = designado;
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
		ServicoEscala other = (ServicoEscala) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	

}
