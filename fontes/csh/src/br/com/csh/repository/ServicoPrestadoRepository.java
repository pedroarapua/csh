package br.com.csh.repository;

import br.com.csh.bean.*;

public class ServicoPrestadoRepository extends GenericRepository<ServicoPrestadoBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public ServicoPrestadoRepository() {
		super(ServicoPrestadoBean.class);
	}
}
