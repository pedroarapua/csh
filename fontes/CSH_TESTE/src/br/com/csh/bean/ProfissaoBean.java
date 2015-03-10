package br.com.csh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: PessoaFisicaBean
 *
 */
@Entity
@Table(name="profissoes")
public class ProfissaoBean extends GenericBean {

	private static final long serialVersionUID = 1L;
	
	@Column(name="descricao", unique = true, nullable=false, length=200)
	private String descricao;
	
	public ProfissaoBean() {
		
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public ProfissaoBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
}
