package br.com.csh.service;

import java.util.Collection;

import br.com.csh.bean.TipoTelefoneBean;

public interface TipoTelefoneService{

	void save(TipoTelefoneBean element);

	void update(TipoTelefoneBean element);

	void delete(TipoTelefoneBean element);

	TipoTelefoneBean FindById(int key);

	Collection<TipoTelefoneBean> findAll();
}
