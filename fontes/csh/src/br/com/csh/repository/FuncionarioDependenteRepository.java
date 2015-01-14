package br.com.csh.repository;

import br.com.csh.bean.*;

public class FuncionarioDependenteRepository extends GenericRepository<FuncionarioDependenteBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public FuncionarioDependenteRepository() {
		super(FuncionarioDependenteBean.class);
	}
}
