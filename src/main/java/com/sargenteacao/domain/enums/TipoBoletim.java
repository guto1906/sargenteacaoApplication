package com.sargenteacao.domain.enums;

public enum TipoBoletim {
	BI(1, "Boletim Interno"),
	ADTBI(2, "Adt BI"),
	ADTS1BI(3, "Adt S1 BI"),
	ADTS3BI(4, "Adt S3 BI"),
	RESTRITO(5, "Bol Acesso Restrito"),
	ADTBOLRESTRITO(6, "Adt Bol Acesso Restrito"),
	ADTS1RESTRITO(7, "Adt S1 Bol Acesso Restrito");
	
	
	
	private int cod;
	private String descricao;
	
	private TipoBoletim(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoBoletim toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoBoletim x : TipoBoletim.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
