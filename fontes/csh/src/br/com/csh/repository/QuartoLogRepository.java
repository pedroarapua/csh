package br.com.csh.repository;

import br.com.csh.bean.*;

public class QuartoLogRepository extends GenericRepository<QuartoLogBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public QuartoLogRepository() {
		super(QuartoLogBean.class);
	}
}
