package com.sargenteacao.domain.enumerado;

public enum TipoDispensa {
	DESCONTOFERIAS(1, "Desconto em Férias"),
	RECOMPENSA(2, "Recompensa");
	
	private int cod;
	private String descricao;
	
	private TipoDispensa(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoDispensa toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoDispensa x : TipoDispensa.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
