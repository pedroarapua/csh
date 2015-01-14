package br.com.csh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_logradouros")
public class TipoLogradouroBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 200, unique=true, name="descricao")
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
