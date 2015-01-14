package br.com.csh.repository;

import br.com.csh.bean.*;

public class EnderecoRepository extends GenericRepository<EnderecoBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public EnderecoRepository() {
		super(EnderecoBean.class);
	}
}
