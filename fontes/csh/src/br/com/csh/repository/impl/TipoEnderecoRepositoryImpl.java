package br.com.csh.repository.impl;

import br.com.csh.bean.TipoEnderecoBean;
import br.com.csh.repository.TipoEnderecoRepository;

public class TipoEnderecoRepositoryImpl extends GenericRepositoryImpl<TipoEnderecoBean> implements TipoEnderecoRepository {
	private static final long serialVersionUID = 1L;
	
	public TipoEnderecoRepositoryImpl() {
		super(TipoEnderecoBean.class);
	}
}
