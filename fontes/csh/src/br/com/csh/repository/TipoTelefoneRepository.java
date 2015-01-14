package br.com.csh.repository;

import br.com.csh.bean.*;

public class TipoTelefoneRepository extends GenericRepository<TipoTelefoneBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public TipoTelefoneRepository() {
		super(TipoTelefoneBean.class);
	}
}
