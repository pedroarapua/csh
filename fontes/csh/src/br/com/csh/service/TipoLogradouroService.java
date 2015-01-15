package br.com.csh.service;

import java.util.Collection;

import br.com.csh.bean.TipoLogradouroBean;

public interface TipoLogradouroService{

	void save(TipoLogradouroBean element);

	void update(TipoLogradouroBean element);

	void delete(TipoLogradouroBean element);

	TipoLogradouroBean FindById(int key);

	Collection<TipoLogradouroBean> findAll();
}
