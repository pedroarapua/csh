package br.com.csh.bean;

import java.util.Collection;
import javax.persistence.*;
import br.com.csh.enumerators.TipoConta;

@Entity
@Table(name = "fornecedores")
public class FornecedorBean extends PessoaJuridicaBean {

	private static final long serialVersionUID = 1L;

	@Column(length = 5, nullable = false, name="codigo_banco")
	private String codigoBanco;

	@Enumerated(EnumType.STRING)
	@Column(name="tipo_conta", nullable=false)
	private TipoConta tipoConta;

	@Column(nullable = false, length = 10, name="agencia")
	private String agencia;

	@Column(nullable = false, length = 10, name="numero_conta")
	private String numeroConta;

	@Column(length = 5, nullable=true, name="codigo_operacao")
	private String codigoOperacao;
	
	@OneToMany(mappedBy="fornecedor")
	private Collection<ServicoPrestadoBean> servicosPrestados;

	/**
	 * @return the codigoBanco
	 */
	public String getCodigoBanco() {
		return codigoBanco;
	}

	/**
	 * @param codigoBanco the codigoBanco to set
	 */
	public FornecedorBean setCodigoBanco(String codigoBanco) {
		this.codigoBanco = codigoBanco;
		return this;
	}

	/**
	 * @return the tipoConta
	 */
	public TipoConta getTipoConta() {
		return tipoConta;
	}

	/**
	 * @param tipoConta the tipoConta to set
	 */
	public FornecedorBean setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
		return this;
	}

	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public FornecedorBean setAgencia(String agencia) {
		this.agencia = agencia;
		return this;
	}

	/**
	 * @return the numeroConta
	 */
	public String getNumeroConta() {
		return numeroConta;
	}

	/**
	 * @param numeroConta the numeroConta to set
	 */
	public FornecedorBean setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
		return this;
	}

	/**
	 * @return the codigoOperacao
	 */
	public String getCodigoOperacao() {
		return codigoOperacao;
	}

	/**
	 * @param codigoOperacao the codigoOperacao to set
	 */
	public FornecedorBean setCodigoOperacao(String codigoOperacao) {
		this.codigoOperacao = codigoOperacao;
		return this;
	}

	/**
	 * @return the servicosPrestados
	 */
	public Collection<ServicoPrestadoBean> getServicosPrestados() {
		return servicosPrestados;
	}

	/**
	 * @param servicosPrestados the servicosPrestados to set
	 */
	public FornecedorBean setServicosPrestados(
			Collection<ServicoPrestadoBean> servicosPrestados) {
		this.servicosPrestados = servicosPrestados;
		return this;
	}
	
}
