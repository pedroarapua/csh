package br.com.csh.repository;

import br.com.csh.bean.*;

public class CidadeRepository extends GenericRepository<CidadeBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public CidadeRepository() {
		super(CidadeBean.class);
	}
}
