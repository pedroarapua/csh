package br.com.csh.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PessoaBean
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Mapeamento para geração da tabela pessoa
@Table(name="pessoas")

public abstract class PessoaBean extends GenericBean implements Serializable {
	   
	private static final long serialVersionUID = 1L;
	
	@Column(name="email", nullable=true, length=150, unique=true)
	private String email;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoa")
	private Collection<EnderecoBean> enderecos;
	
	public PessoaBean() {
		super();
	}
	
	public String getEmail() {
		return email;
	}
	public PessoaBean setEmail(String email) {
		this.email = email;
		return this;
	}
	
}
