package com.sargenteacao.domain.enumerado;

public enum AutoridadeConcedente {
	CMTOM(1, "Comandante de OM"),
	CMTSU(2, "Comandante de SU"),
	CHSEC(3, "Chefe de Seção");
	
	private int cod;
	private String descricao;
	
	private AutoridadeConcedente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static AutoridadeConcedente toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (AutoridadeConcedente x : AutoridadeConcedente.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
