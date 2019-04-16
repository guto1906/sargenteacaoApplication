package com.sargenteacao.domain.enumerado;

public enum PostGrad {
	GENEX(1, "Gen Ex"),
	GENDIV(2, "Gen Div"),
	GENBDA(3, "Gen Bda"),
	CEL(4, "Cel"),
	TENCEL(5, "Ten Cel"),
	MAJ(6, "Maj"),
	CAP(7, "Cap"),
	PRIMEIROTEN(8, "1 Ten"),
	SEGUNDOTEN(9, "2 Ten"),
	ASP(10, "Asp"),
	STEN(11, "S Ten"),
	PRIMEIROSGT(12, "1 Sgt"),
	SEGUNDOSGT(13, "2 Sgt"),
	TERCEIROSGT(14, "3 Sgt"),
	CB(15, "Cb"),
	CBEV(16, "Cb EV"),
	SD(17, "Sd"),	
	SDEV(5, "Sd EV");
	
	private int cod;
	private String descricao;
	
	private PostGrad(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static PostGrad toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (PostGrad x : PostGrad.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
