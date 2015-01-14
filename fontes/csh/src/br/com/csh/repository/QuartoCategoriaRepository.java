package br.com.csh.repository;

import br.com.csh.bean.*;

public class QuartoCategoriaRepository extends GenericRepository<QuartoCategoriaBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public QuartoCategoriaRepository() {
		super(QuartoCategoriaBean.class);
	}
}
