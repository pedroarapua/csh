package br.com.csh.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "hospedes")
public class HospedeBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;

	@Column(nullable = false, length = 150)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(nullable = true, name="data_nascimento")
	private Date dataNascimento;

	@ManyToOne
	@JoinColumn(name = "id_reserva", nullable=false)
	private ReservaBean reserva;

	public int getId() {
		return id;
	}

	public HospedeBean setId(int id) {
		this.id = id;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public HospedeBean setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public HospedeBean setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}

	public ReservaBean getReserva() {
		return reserva;
	}

	public HospedeBean setReserva(ReservaBean reserva) {
		this.reserva = reserva;
		return this;
	}

}