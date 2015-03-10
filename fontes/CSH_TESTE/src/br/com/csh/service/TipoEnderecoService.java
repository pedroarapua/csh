package br.com.csh.service;

import java.util.Collection;

import br.com.csh.bean.TipoEnderecoBean;

public interface TipoEnderecoService extends GenericService<TipoEnderecoBean>{
	
	Collection<TipoEnderecoBean> findByDescricao(String value);
}
