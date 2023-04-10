package br.com.dominio.controller;

public enum TipoAtividade {
	APRESENTACAO("Apresentação"), CURSO("Curso"), MINICURSO("Mini Curso"), PALESTRA("Palestra"), SEMINARIO("Seminario"),
	SIMPSIO("Simpsio"), OUTRA("Outra");
	
	private String descricao;
	
	private TipoAtividade(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}
