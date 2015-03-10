package br.com.csh.bean;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quartos_opicionais")
public class QuartoOpicionalBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 200, name="descricao", unique=true)
	private String descricao;

	@Column(nullable = false, scale = 2, precision = 15, name="valor")
	private BigDecimal valor;

	@Column(nullable = false, length = 3, name="estoque")
	private int estoque;

	@ManyToMany(mappedBy = "quartoOpcionais")
	private Collection<QuartoBean> quarto;

	public String getDescricao() {
		return descricao;
	}

	public QuartoOpicionalBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public QuartoOpicionalBean setValor(BigDecimal valor) {
		this.valor = valor;
		return this;
	}

	public int getEstoque() {
		return estoque;
	}

	public QuartoOpicionalBean setEstoque(int estoque) {
		this.estoque = estoque;
		return this;
	}

	public Collection<QuartoBean> getQuarto() {
		return quarto;
	}

	public QuartoOpicionalBean setQuarto(Collection<QuartoBean> quarto) {
		this.quarto = quarto;
		return this;
	}
	
	

}
