package com.sargenteacao.domain.enums;

public enum OrganizacaoMilitar {
	SEGUNDOGAAAE(55426, "2 GAAAe");	
	
	private int cod;
	private String descricao;
	
	private OrganizacaoMilitar(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static OrganizacaoMilitar toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (OrganizacaoMilitar x : OrganizacaoMilitar.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
