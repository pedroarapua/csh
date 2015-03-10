package br.com.csh.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="estados")
public class EstadoBean extends GenericBean {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, length=200, name="descricao")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_pais", nullable=false)
	private PaisBean pais;
	
	@OneToMany(mappedBy="estado")
	private Collection<CidadeBean> cidade;
	
	public String getDescricao() {
		return descricao;
	}
	public EstadoBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	public PaisBean getPais() {
		return pais;
	}
	public EstadoBean setPais(PaisBean pais) {
		this.pais = pais;
		return this;
	}
	
}
