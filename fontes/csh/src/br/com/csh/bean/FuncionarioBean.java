package br.com.csh.bean;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "funcionarios")
public class FuncionarioBean extends PessoaFisicaBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 20, name="pis")
	private String pis;

	@Column(nullable = false, scale = 2, precision = 15, name="salario")
	private BigDecimal salario;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false, name="data_admissao")
	private Date dataAdimissao;

	@Temporal(TemporalType.DATE)
	@Column(nullable=true, name="data_demissao")
	private Date dataDemissao;

	@OneToMany(mappedBy="funcionario")
	private Collection<FuncionarioDependenteBean> dependentes;
	
	public String getPis() {
		return pis;
	}

	public FuncionarioBean setPis(String pis) {
		this.pis = pis;
		return this;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public FuncionarioBean setSalario(BigDecimal salario) {
		this.salario = salario;
		return this;
	}

	public Date getDataAdimissao() {
		return dataAdimissao;
	}

	public FuncionarioBean setDataAdimissao(Date dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
		return this;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public FuncionarioBean setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
		return this;
	}

	public Collection<FuncionarioDependenteBean> getDependente() {
		return dependentes;
	}

	public FuncionarioBean setDependente(Collection<FuncionarioDependenteBean> dependentes) {
		this.dependentes = dependentes;
		return this;
	}
}
