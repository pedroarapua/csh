package br.com.csh.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: PessoaFisicaBean
 *
 */
@Entity
@Table(name="estados_civis")
public class EstadoCivilBean extends GenericBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="descricao", nullable=false, length=200, unique=true)
	private String descricao;
	
	public EstadoCivilBean() {
		
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
	public EstadoCivilBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	
}
