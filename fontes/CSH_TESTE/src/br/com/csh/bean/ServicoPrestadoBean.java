package br.com.csh.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servicos_prestados")
public class ServicoPrestadoBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 100, name="nome_arquivo")
	private String nomeArquivo;

	@Column(nullable = false, length = 2, name="avaliacao")
	private int avaliacao;

	@Column(nullable = false, scale = 2, precision = 15, name="valor_prestado")
	private BigDecimal valorPrestado;

	@ManyToOne
	@JoinColumn(name = "id_fornecedor", nullable=false)
	private FornecedorBean fornecedor;

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public ServicoPrestadoBean setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		return this;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public ServicoPrestadoBean setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
		return this;
	}

	public BigDecimal getValorPrestado() {
		return valorPrestado;
	}

	public ServicoPrestadoBean setValorPrestado(BigDecimal valorPrestado) {
		this.valorPrestado = valorPrestado;
		return this;
	}

	public FornecedorBean getFornecedor() {
		return fornecedor;
	}

	public ServicoPrestadoBean setFornecedor(FornecedorBean fornecedor) {
		this.fornecedor = fornecedor;
		return this;
	}

}
