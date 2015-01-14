package br.com.csh.bean;

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
@Table(name = "funcionarios_dependentes")
public class FuncionarioDependenteBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;

	@Column(nullable = false, length = 200, name="nome")
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(nullable = true, name="data_nascimento")
	private Date dataNascimento;

	@ManyToOne
	@JoinColumn(name = "id_funcionario", nullable=false)
	private FuncionarioBean funcionario;
}
