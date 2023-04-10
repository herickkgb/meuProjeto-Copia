package br.com.dominio.model;

import java.io.Serializable;
import java.util.Objects;

import br.com.dominio.controller.TipoAtividade;

public class Atividade implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private TipoAtividade tipoatividade;

	public Atividade() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoAtividade getTipoatividade() {
		return tipoatividade;
	}

	public void setTipoatividade(TipoAtividade tipoatividade) {
		this.tipoatividade = tipoatividade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atividade other = (Atividade) obj;
		return Objects.equals(id, other.id);
	}

}
