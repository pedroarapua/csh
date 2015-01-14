package br.com.csh.repository;

import br.com.csh.bean.*;

public class TelefoneRepository extends GenericRepository<TelefoneBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public TelefoneRepository() {
		super(TelefoneBean.class);
	}
}
