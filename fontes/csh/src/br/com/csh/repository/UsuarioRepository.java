package br.com.csh.repository;

import br.com.csh.bean.*;

public class UsuarioRepository extends GenericRepository<UsuarioBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public UsuarioRepository() {
		super(UsuarioBean.class);
	}
}
