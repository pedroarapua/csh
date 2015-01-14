package br.com.csh.repository;

import br.com.csh.bean.*;

public class PessoaFisicaRepository extends GenericRepository<PessoaFisicaBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public PessoaFisicaRepository() {
		super(PessoaFisicaBean.class);
	}
}
