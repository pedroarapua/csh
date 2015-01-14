package br.com.csh.repository;

import br.com.csh.bean.*;

public class QuartoOpicionalRepository extends GenericRepository<QuartoOpicionalBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public QuartoOpicionalRepository() {
		super(QuartoOpicionalBean.class);
	}
}
