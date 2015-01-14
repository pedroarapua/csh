package br.com.csh.repository;

import br.com.csh.bean.*;

public class ReservaRepository extends GenericRepository<QuartoOpicionalBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public ReservaRepository() {
		super(QuartoOpicionalBean.class);
	}
}
