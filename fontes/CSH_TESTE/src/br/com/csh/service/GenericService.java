package br.com.csh.service;

import java.util.Collection;

import br.com.csh.bean.TipoEnderecoBean;

public interface GenericService<T>{

	void save(T element);

	void update(T element);

	void delete(T element);

	T findById(Object key);

	Collection<T> findAll();
}
