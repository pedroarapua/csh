package br.com.csh.bean;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "paises")
public class PaisBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(length = 200, unique = true, nullable = false, name="descricao")
	private String descricao;

	@Column(length = 3, nullable = false, name="ddi", unique=true)
	private String ddi;
	
	@OneToMany(mappedBy = "pais")
	private Collection<EstadoBean> estados;

	public String getDdi() {
		return ddi;
	}

	public PaisBean setDdi(String ddi) {
		this.ddi = ddi;
		return this;
	}

	public String getDescricao() {
		return descricao;
	}

	public PaisBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public Collection<EstadoBean> getEstados() {
		return estados;
	}

	public PaisBean setEstados(Collection<EstadoBean> estados) {
		this.estados = estados;
		return this;
	}

}
