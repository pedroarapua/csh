package br.com.csh.repository;

import br.com.csh.bean.*;

public class ProfissaoRepository extends GenericRepository<ProfissaoBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public ProfissaoRepository() {
		super(ProfissaoBean.class);
	}
}
