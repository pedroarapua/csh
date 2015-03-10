package br.com.csh.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public interface GenericRepository<T> extends Serializable {
	
	T save(T element);

	T update(T element);

	void delete(T element);
	
	void deleteById(Object key);

	T findById(Object key);
	
	T find(ArrayList<String> properties, HashMap<String, Object> filters);
	
	T find(HashMap<String, Object> filters);
	
	T find(String property, Object value);
	
	Collection<T> findAll();
	
	Collection<T> findAll(ArrayList<String> properties);
	
	Collection<T> findAll(HashMap<String, Object> filters);
	
	Collection<T> findAll(String property, Object value);

	Collection<T> findAll(ArrayList<String> properties, HashMap<String, Object> filters);
	
	void beginTransaction();

	void commit();

	void rollBack();
}

