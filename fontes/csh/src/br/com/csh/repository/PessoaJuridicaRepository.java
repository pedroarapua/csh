package br.com.csh.repository;

import br.com.csh.bean.*;

public class PessoaJuridicaRepository extends GenericRepository<PessoaJuridicaBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public PessoaJuridicaRepository() {
		super(PessoaJuridicaBean.class);
	}
}
