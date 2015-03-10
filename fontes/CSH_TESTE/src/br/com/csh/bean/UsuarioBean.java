package br.com.csh.bean;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: UsuarioBean
 *
 */
@Entity
@Table(name="usuarios")
public class UsuarioBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	public int getId() {
		return id;
	}

	public UsuarioBean setId(int id) {
		this.id = id;
		return this;
	}
	
}
