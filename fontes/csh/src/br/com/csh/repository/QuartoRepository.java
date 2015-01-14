package br.com.csh.repository;

import br.com.csh.bean.*;

public class QuartoRepository extends GenericRepository<QuartoBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public QuartoRepository() {
		super(QuartoBean.class);
	}
}
