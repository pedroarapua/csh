package br.com.csh.bean;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.csh.enumerators.Sexo;

/**
 * Entity implementation class for Entity: PessoaFisicaBean
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="pessoas_fisicas")
public class PessoaFisicaBean extends PessoaBean {

	private static final long serialVersionUID = 1L;
	
	@Column(name="nome", nullable=false, length=500)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_nascimento", nullable=false)
	private Date dataNascimento;
	
	@Column(name="cpf", nullable=false, length=11)
	private String cpf;
	
	@Column(name="rg", nullable=true, length=20)
	private String rg;
	
	@Column(name="orgao_emissor", nullable=true, length=10)
	private String orgaoEmissor;
	
	@Enumerated(EnumType.STRING)
	@Column(name="id_sexo", nullable=false)
	private Sexo sexo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_estado_civil", nullable=false)
	private EstadoCivilBean estadoCivil;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_profissao", nullable=true)
	private ProfissaoBean profissao;
	
	@ManyToMany(mappedBy="pessoasFisica")
	private Collection<PessoaJuridicaBean> pessoasJuridica;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pais", nullable=true)
	private PaisBean pais;
	
	public PessoaFisicaBean() {
		super();
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public PessoaFisicaBean setNome(String nome) {
		this.nome = nome;
		return this;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public PessoaFisicaBean setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public PessoaFisicaBean setCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public PessoaFisicaBean setRg(String rg) {
		this.rg = rg;
		return this;
	}

	/**
	 * @return the orgaoEmissor
	 */
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	/**
	 * @param orgaoEmissor the orgaoEmissor to set
	 */
	public PessoaFisicaBean setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
		return this;
	}

	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public PessoaFisicaBean setSexo(Sexo sexo) {
		this.sexo = sexo;
		return this;
	}

	/**
	 * @return the estadoCivil
	 */
	public EstadoCivilBean getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public PessoaFisicaBean setEstadoCivil(EstadoCivilBean estadoCivil) {
		this.estadoCivil = estadoCivil;
		return this;
	}

	/**
	 * @return the profissao
	 */
	public ProfissaoBean getProfissao() {
		return profissao;
	}

	/**
	 * @param profissao the profissao to set
	 */
	public PessoaFisicaBean setProfissao(ProfissaoBean profissao) {
		this.profissao = profissao;
		return this;
	}

	/**
	 * @return the pessoasJuridica
	 */
	public Collection<PessoaJuridicaBean> getPessoasJuridica() {
		return pessoasJuridica;
	}

	/**
	 * @param pessoasJuridica the pessoasJuridica to set
	 */
	public PessoaFisicaBean setPessoasJuridica(Collection<PessoaJuridicaBean> pessoasJuridica) {
		this.pessoasJuridica = pessoasJuridica;
		return this;
	}

	/**
	 * @return the pais
	 */
	public PaisBean getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public PessoaFisicaBean setPais(PaisBean pais) {
		this.pais = pais;
		return this;
	}
	
	
	   
}
