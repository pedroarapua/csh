package br.com.csh.bean;

import java.math.BigDecimal;
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
@Table(name="quartos_categorias")
public class QuartoCategoriaBean extends GenericBean {

	private static final long serialVersionUID = 1L;
	
	@Column(name="descricao", nullable=false, unique=true, length=200)
	private String descricao;
	
	@Column(name="valor", nullable=false, precision=15, scale=2)
	private BigDecimal valor;
	
	@OneToMany(mappedBy="categoria")
	private Collection<QuartoBean> quartos;
	
	public QuartoCategoriaBean() {
		
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
	public QuartoCategoriaBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public QuartoCategoriaBean setValor(BigDecimal valor) {
		this.valor = valor;
		return this;
	}

	/**
	 * @return the quartos
	 */
	public Collection<QuartoBean> getQuartos() {
		return quartos;
	}

	/**
	 * @param quartos the quartos to set
	 */
	public QuartoCategoriaBean setQuartos(Collection<QuartoBean> quartos) {
		this.quartos = quartos;
		return this;
	}
		
}
