package br.com.csh.repository;

import br.com.csh.bean.*;

public class PaisRepository extends GenericRepository<PaisBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public PaisRepository() {
		super(PaisBean.class);
	}
}
