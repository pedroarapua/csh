package br.com.csh.bean;

import br.com.csh.bean.PessoaBean;

import java.util.Collection;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PessoaJuridica
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="pessoas_juridicas")
public class PessoaJuridicaBean extends PessoaBean {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name="razao_social", nullable=false, length=500)
	private String razaoSocial;
	
	@Column(name="nome_fantasia", nullable=false, length=200)
	private String nomeFantasia;
	
	@Column(name="cnpj", nullable=false, length=14)
	private String cnpj;
	
	@Column(name="inscricao_estadual", nullable=true, length=20)
	private String inscricaoEstadual;
	
	@Column(name="inscricao_municipal", nullable=true, length=20)
	private String inscricaoMunicial;
	
	@ManyToMany
	@JoinTable(name="pessoas_juridicas_pessoas_fisicas",
			   joinColumns = @JoinColumn(name="id_pessoa_juridica"), 
			   inverseJoinColumns = @JoinColumn(name="id_pessoa_fisica"))				
	private Collection<PessoaFisicaBean> pessoasFisica;
	
	public PessoaJuridicaBean() {
		super();
	}

	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public PessoaJuridicaBean setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	/**
	 * @return the nomeFantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	/**
	 * @param nomeFantasia the nomeFantasia to set
	 */
	public PessoaJuridicaBean setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
		return this;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public PessoaJuridicaBean setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	/**
	 * @return the inscricaoEstadual
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public PessoaJuridicaBean setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
		return this;
	}

	/**
	 * @return the inscricaoMunicial
	 */
	public String getInscricaoMunicial() {
		return inscricaoMunicial;
	}

	/**
	 * @param inscricaoMunicial the inscricaoMunicial to set
	 */
	public PessoaJuridicaBean setInscricaoMunicial(String inscricaoMunicial) {
		this.inscricaoMunicial = inscricaoMunicial;
		return this;
	}

	/**
	 * @return the pessoasFisica
	 */
	public Collection<PessoaFisicaBean> getPessoasFisica() {
		return pessoasFisica;
	}

	/**
	 * @param pessoasFisica the pessoasFisica to set
	 */
	public PessoaJuridicaBean setPessoasFisica(Collection<PessoaFisicaBean> pessoasFisica) {
		this.pessoasFisica = pessoasFisica;
		return this;
	}
   
}
