package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sargenteacao.domain.enums.PostoEscalado;
import com.sargenteacao.domain.enums.TipoFolga;

@Entity
public class EscalaServico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date data;
	private Integer postoEscaldo;
	private Integer tipoFolga;
	
	@ManyToOne
	@JoinColumn(name = "militar_escalado_id")
	private Militar escalado;
	
	public EscalaServico() {
		
	}

	public EscalaServico(Integer id, Date data, PostoEscalado postoEscaldo, TipoFolga tipoFolga, Militar escalado) {
		super();
		this.id = id;
		this.data = data;
		this.postoEscaldo = postoEscaldo.getCod();
		this.tipoFolga = tipoFolga.getCod();
		this.escalado = escalado;
		
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
	
	public Militar getEscalado() {
		return escalado;
	}

	public void setEscalado(Militar escalado) {
		this.escalado = escalado;
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
		EscalaServico other = (EscalaServico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	

}
