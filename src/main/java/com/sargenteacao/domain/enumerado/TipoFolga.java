package com.sargenteacao.domain.enumerado;

public enum TipoFolga {
	PRETA(1, "Preta"),
	VERMELHA(2, "Vermelha");
	
	private int cod;
	private String descricao;
	
	private TipoFolga(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoFolga toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoFolga x : TipoFolga.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
