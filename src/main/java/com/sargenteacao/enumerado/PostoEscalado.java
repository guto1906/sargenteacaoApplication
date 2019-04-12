package com.sargenteacao.enumerado;

public enum PostoEscalado {
	SGTDIA(1, "Sargento de Dia"),
	CBDIA(2, "Cabo de Dia"),
	PLANTAO(3, "Plantão"),
	GUARDA(4, "Guarda");
	
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
