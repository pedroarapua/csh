package br.com.csh.repository;

import br.com.csh.bean.*;

public class FornecedorRepository extends GenericRepository<FornecedorBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public FornecedorRepository() {
		super(FornecedorBean.class);
	}
}
