package br.com.csh.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quartos")
public class QuartoBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 5, name="numero", unique=true)
	private int numero;

	@OneToMany(mappedBy = "quarto")
	private Collection<QuartoLogBean> quartosLog;

	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "id_quarto"), inverseJoinColumns = @JoinColumn(name = "id_quarto_opicional"))
	private Collection<QuartoOpicionalBean> quartoOpcionais;

	@ManyToOne
	@JoinColumn(name = "id_quarto_categoria")
	private QuartoCategoriaBean categoria;

	public int getNumero() {
		return numero;
	}

	public QuartoBean setNumero(int numero) {
		this.numero = numero;
		return this;
	}

	public Collection<QuartoLogBean> getQuartosLog() {
		return quartosLog;
	}

	public QuartoBean setQuartosLog(Collection<QuartoLogBean> quartosLog) {
		this.quartosLog = quartosLog;
		return this;
	}

	public Collection<QuartoOpicionalBean> getQuartoOpcionais() {
		return quartoOpcionais;
	}

	public QuartoBean setQuartoOpcionais(
			Collection<QuartoOpicionalBean> quartoOpcionais) {
		this.quartoOpcionais = quartoOpcionais;
		return this;
	}

	public QuartoCategoriaBean getCategoria() {
		return categoria;
	}

	public QuartoBean setCategoria(QuartoCategoriaBean categoria) {
		this.categoria = categoria;
		return this;
	}
}
