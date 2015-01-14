package br.com.csh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="telefones")
public class TelefoneBean extends GenericBean {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, length=3, name="ddd")
	private String ddd;
	
	@Column(nullable= false, length=14, name="numero")
	private String numero;
	
	@Column(length=200, name="contato", nullable=true)
	private String contato;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_tipo_telefone", nullable=false)
	private TipoTelefoneBean tipoTelefone;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_pais", nullable=false)
	private PaisBean pais;
	
	@ManyToOne
	@JoinColumn(name="id_pessoa", nullable=false)
	private PessoaBean pessoa;

	public String getDdd() {
		return ddd;
	}

	public TelefoneBean setDdd(String ddd) {
		this.ddd = ddd;
		return this;
	}

	public String getNumero() {
		return numero;
	}

	public TelefoneBean setNumero(String numero) {
		this.numero = numero;
		return this;
	}

	public String getContato() {
		return contato;
	}

	public TelefoneBean setContato(String contato) {
		this.contato = contato;
		return this;
	}

	public TipoTelefoneBean getTipoTelefone() {
		return tipoTelefone;
	}

	public TelefoneBean setTipoTelefone(TipoTelefoneBean tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
		return this;
	}

	public PaisBean getPais() {
		return pais;
	}

	public TelefoneBean setPais(PaisBean pais) {
		this.pais = pais;
		return this;
	}

	public PessoaBean getPessoa() {
		return pessoa;
	}

	public TelefoneBean setPessoa(PessoaBean pessoaBean) {
		this.pessoa = pessoaBean;
		return this;
	}
}
