package br.com.csh.enumerators;

public enum TipoConta {
	CP("Poupança"),
	CC("Conta Corrente");
	
	private String descricao;

	private TipoConta(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
