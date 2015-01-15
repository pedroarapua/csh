package br.com.csh.service;

import java.util.Collection;

import br.com.csh.bean.TipoEnderecoBean;

public interface TipoEnderecoService{

	void save(TipoEnderecoBean element);

	void update(TipoEnderecoBean element);

	void delete(TipoEnderecoBean element);

	TipoEnderecoBean FindById(int key);

	Collection<TipoEnderecoBean> findAll();
}
