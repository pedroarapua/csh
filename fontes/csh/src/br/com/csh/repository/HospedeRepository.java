package br.com.csh.repository;

import br.com.csh.bean.*;

public class HospedeRepository extends GenericRepository<HospedeBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public HospedeRepository() {
		super(HospedeBean.class);
	}
}
