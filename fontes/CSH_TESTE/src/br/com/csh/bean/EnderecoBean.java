package br.com.csh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enderecos")
public class EnderecoBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 200, name="logradouro")
	private String logradouro;

	@Column(nullable = false, length = 5, name="numero")
	private int numero;

	@Column(nullable = false, length = 8, name="cep")
	private String cep;

	@Column(nullable = false, length = 200, name="bairro")
	private String bairro;

	@Column(length = 200, nullable=true, name="complemento")
	private String complemento;

	@Column(length = 200, nullable=true, name="referencia")
	private String referencia;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_pessoa", nullable=false)
	private PessoaBean pessoa;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_tipo_endereco", nullable=false)
	private TipoEnderecoBean tipoEndereco;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_cidade", nullable=false)
	private CidadeBean cidade;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_tipo_logradouro", nullable=false)
	private TipoLogradouroBean tipoLogradouro;

	public String getLogradouro() {
		return logradouro;
	}

	public EnderecoBean setLogradouro(String logradouro) {
		this.logradouro = logradouro;
		return this;
	}

	public int getNumero() {
		return numero;
	}

	public EnderecoBean setNumero(int numero) {
		this.numero = numero;
		return this;
	}

	public String getCep() {
		return cep;
	}

	public EnderecoBean setCep(String cep) {
		this.cep = cep;
		return this;
	}

	public String getBairro() {
		return bairro;
	}

	public EnderecoBean setBairro(String bairro) {
		this.bairro = bairro;
		return this;
	}

	public String getComplemento() {
		return complemento;
	}

	public EnderecoBean setComplemento(String complemento) {
		this.complemento = complemento;
		return this;
	}

	public String getReferencia() {
		return referencia;
	}

	public EnderecoBean setReferencia(String referencia) {
		this.referencia = referencia;
		return this;
	}

	public PessoaBean getPessoa() {
		return pessoa;
	}

	public EnderecoBean setPessoa(PessoaBean pessoa) {
		this.pessoa = pessoa;
		return this;
	}

	public TipoEnderecoBean getTipoEndereco() {
		return tipoEndereco;
	}

	public EnderecoBean setTipoEndereco(TipoEnderecoBean tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
		return this;
	}

	public CidadeBean getCidade() {
		return cidade;
	}

	public EnderecoBean setCidade(CidadeBean cidade) {
		this.cidade = cidade;
		return this;
	}

	public TipoLogradouroBean getTipoLogradouro() {
		return tipoLogradouro;
	}

	public EnderecoBean setTipoLogradouro(TipoLogradouroBean tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
		return this;
	}

}