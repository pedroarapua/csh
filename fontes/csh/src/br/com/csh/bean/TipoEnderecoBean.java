package br.com.csh.bean;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: PessoaFisicaBean
 *
 */
@Entity
@Table(name="tipos_enderecos")
public class TipoEnderecoBean extends GenericBean {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 200, name="descricao", unique=true)
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public TipoEnderecoBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
}
