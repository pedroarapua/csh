package br.com.csh.repository;

import br.com.csh.bean.*;

public class TipoLogradouroRepository extends GenericRepository<TipoLogradouroBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public TipoLogradouroRepository() {
		super(TipoLogradouroBean.class);
	}
}
