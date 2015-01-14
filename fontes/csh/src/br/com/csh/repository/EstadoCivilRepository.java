package br.com.csh.repository;

import br.com.csh.bean.*;

public class EstadoCivilRepository extends GenericRepository<EstadoCivilBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public EstadoCivilRepository() {
		super(EstadoCivilBean.class);
	}
}
