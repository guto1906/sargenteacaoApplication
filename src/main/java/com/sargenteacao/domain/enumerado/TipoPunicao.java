package com.sargenteacao.domain.enumerado;

public enum TipoPunicao {
	PRISAO(1, "Prisão"),
	DETIMENTO(2, "Detimento"),
	IMPEDIMENTO(3, "Impedimento"),
	REPREENSÃO(4, "Repreensão"),
	ADVERTÊNCIA(5, "Advertência");
	
	private int cod;
	private String descricao;
	
	private TipoPunicao(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoPunicao toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoPunicao x : TipoPunicao.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
