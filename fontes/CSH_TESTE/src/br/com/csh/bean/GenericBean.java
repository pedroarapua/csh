package br.com.csh.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * Entity implementation class for Entity: PessoaFisicaBean
 *
 */
@MappedSuperclass
public abstract class GenericBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_cadastro", nullable=false)
	private Date dataCadastro;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_alteracao", nullable=true)
	private Date dataAlteracao;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_exclusao", nullable=true)
	private Date dataExclusao;
	@Column(name="id_usuario_cadastro", nullable=false)
	private int usuarioCadastro;
	@Column(name="id_usuario_alteracao", nullable=true)
	private int usuarioAlteracao;
	@Column(name="id_usuario_exclusao", nullable=true)
	private int usuarioExclusao;
	
	@Transient
	private UsuarioBean usuario;
	@Column(name="ativo", nullable=false)
	private boolean ativo; 
	
	public GenericBean() {
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public GenericBean setId(int id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the dataCadastro
	 */
	public Date getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public GenericBean setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
		return this;
	}

	/**
	 * @return the dataAlteracao
	 */
	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	/**
	 * @param dataAlteracao the dataAlteracao to set
	 */
	public GenericBean setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
		return this;
	}

	/**
	 * @return the usuarioCadastro
	 */
	public int getUsuarioCadastro() {
		return usuarioCadastro;
	}

	/**
	 * @param usuarioCadastro the usuarioCadastro to set
	 */
	public GenericBean setUsuarioCadastro(int usuarioCadastro) {
		this.usuarioCadastro = usuarioCadastro;
		return this;
	}

	/**
	 * @return the usuarioAlteracao
	 */
	public int getUsuarioAlteracao() {
		return usuarioAlteracao;
	}

	/**
	 * @param usuarioAlteracao the usuarioAlteracao to set
	 */
	public GenericBean setUsuarioAlteracao(int usuarioAlteracao) {
		this.usuarioAlteracao = usuarioAlteracao;
		return this;
	}

	/**
	 * @return the usuarioExclusao
	 */
	public int getUsuarioExclusao() {
		return usuarioExclusao;
	}

	/**
	 * @param usuarioExclusao the usuarioExclusao to set
	 */
	public GenericBean setUsuarioExclusao(int usuarioExclusao) {
		this.usuarioExclusao = usuarioExclusao;
		return this;
	}

	/**
	 * @return the usuarioBean
	 */
	public UsuarioBean getUsuario() {
		return usuario;
	}

	/**
	 * @param usuarioBean the usuarioBean to set
	 */
	public GenericBean setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
		return this;
	}
	
	
	
	/**
	 * @return the dataExclusao
	 */
	public Date getDataExclusao() {
		return dataExclusao;
	}

	/**
	 * @param dataExclusao the dataExclusao to set
	 */
	public void setDataExclusao(Date dataExclusao) {
		this.dataExclusao = dataExclusao;
	}

	/**
	 * @return the ativo
	 */
	public boolean isAtivo() {
		return ativo;
	}

	/**
	 * @param ativo the ativo to set
	 */
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@PrePersist
	private void defaultPersist() {
		dataCadastro = new Date();
		ativo = true;
		usuarioCadastro = usuario.getId();
	}

	@PreUpdate
	void defaultUpdate() {
		if (ativo == false) {
			dataExclusao = new Date();
			usuarioExclusao = usuario.getId();
		} else {
			dataAlteracao = new Date();
			usuarioAlteracao = usuario.getId();
		}
	}
}
