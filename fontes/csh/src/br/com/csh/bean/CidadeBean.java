package br.com.csh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cidades")
public class CidadeBean extends GenericBean {
	private static final long serialVersionUID = 1L;
	
	@Column(name="descricao", nullable=false, length=200)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_estado", nullable=false)
	private EstadoBean estado;

	public String getDescricao() {
		return descricao;
	}

	public CidadeBean setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public EstadoBean getEstado() {
		return estado;
	}

	public CidadeBean setEstado(EstadoBean estado) {
		this.estado = estado;
		return this;
	}

}
