package com.sargenteacao.domain.enums;

public enum PostoEscalado {
	OFDIA(1, "Oficial de Dia"),
	ADJOFDIA(2, "Adjunto"),
	CMTGDA(3,"Cmt Gda"),
	SGTDIA(4, "Sargento de Dia"),
	CBGDA(5, "Cabo da Gda"),
	CBDIA(6, "Cabo de Dia"),
	PLANTAO(7, "Plantão"),
	GUARDA(8, "Guarda");
	
	private int cod;
	private String descricao;
	
	private PostoEscalado(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static PostoEscalado toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (PostoEscalado x : PostoEscalado.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
