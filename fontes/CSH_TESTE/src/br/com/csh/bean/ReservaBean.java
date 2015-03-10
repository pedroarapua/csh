package br.com.csh.bean;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reservas")
public class ReservaBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	@Column(length = 200, nullable=false, name="codigo_reserva")
	private String codigoReserva;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, name="data_inicio")
	private Date dataInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, name="data_final")
	private Date dataFim;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_cancelamento", nullable=true)
	private Date dataCancelamento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_check_in", nullable=true)
	private Date dataCheckIn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_check_out", nullable=true)
	private Date dataCheckOut;

	@Column(nullable = false, scale = 2, precision = 15)
	private BigDecimal valorTotal;

	@ManyToOne
	@JoinColumn(name = "id_pessoa", nullable=false)
	private PessoaBean cliente;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_funcionario_empresa", nullable=true)
	private PessoaFisicaBean funcionarioEmpresa;

	@ManyToOne
	@JoinColumn(name = "id_quarto", nullable=false)
	private QuartoBean quarto;

	@OneToMany(mappedBy="reserva")
	private Collection<HospedeBean> hospedes;
	
	public String getCodigoReserva() {
		return codigoReserva;
	}

	public ReservaBean setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
		return this;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public ReservaBean setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
		return this;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public ReservaBean setDataFim(Date dataFim) {
		this.dataFim = dataFim;
		return this;
	}

	public Date getDataCheckIn() {
		return dataCheckIn;
	}

	public ReservaBean setDataCheckIn(Date dataCheckIn) {
		this.dataCheckIn = dataCheckIn;
		return this;
	}

	public Date getDataCheckOut() {
		return dataCheckOut;
	}

	public ReservaBean setDataCheckOut(Date dataCheckOut) {
		this.dataCheckOut = dataCheckOut;
		return this;
	}

	public Date getDataCancelamento() {
		return dataCancelamento;
	}

	public ReservaBean setDataCancelamento(Date dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
		return this;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public ReservaBean setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
		return this;
	}

	public PessoaBean getCliente() {
		return cliente;
	}

	public ReservaBean setCliente(PessoaBean cliente) {
		this.cliente = cliente;
		return this;
	}

	public QuartoBean getQuarto() {
		return quarto;
	}

	public ReservaBean setQuarto(QuartoBean quarto) {
		this.quarto = quarto;
		return this;
	}

	/**
	 * @return the funcionarioEmpresa
	 */
	public PessoaFisicaBean getFuncionarioEmpresa() {
		return funcionarioEmpresa;
	}

	/**
	 * @param funcionarioEmpresa the funcionarioEmpresa to set
	 */
	public ReservaBean setFuncionarioEmpresa(PessoaFisicaBean funcionarioEmpresa) {
		this.funcionarioEmpresa = funcionarioEmpresa;
		return this;
	}

	/**
	 * @return the hospedes
	 */
	public Collection<HospedeBean> getHospedes() {
		return hospedes;
	}

	/**
	 * @param hospedes the hospedes to set
	 */
	public ReservaBean setHospedes(Collection<HospedeBean> hospedes) {
		this.hospedes = hospedes;
		return this;
	}
	
	
}
