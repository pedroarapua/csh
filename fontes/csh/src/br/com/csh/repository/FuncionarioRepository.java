package br.com.csh.repository;

import br.com.csh.bean.*;

public class FuncionarioRepository extends GenericRepository<FuncionarioBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public FuncionarioRepository() {
		super(FuncionarioBean.class);
	}
}
