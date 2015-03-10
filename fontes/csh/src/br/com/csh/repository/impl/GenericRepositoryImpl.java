package br.com.csh.repository.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.csh.repository.GenericRepository;
import br.com.csh.service.qualifier.Persistencia;

public class GenericRepositoryImpl<T> implements GenericRepository<T> {
	private static final long serialVersionUID = 1L;

	@Inject @Persistencia  
    private EntityManager em;  
	
	private Class<T> classe;

	public GenericRepositoryImpl(Class<T> classe) {
		super();
		this.classe = classe;
	}

	@Override
	public T save(T element) {
		if (element == null)
			throw new IllegalArgumentException(
					"Parâmetro para adicionar nulo, operação cancelada!");
		em.persist(element);
		em.flush();
		return element;
	}

	@Override
	public T update(T element) {
		if (element == null)
			throw new IllegalArgumentException(
					"Parâmetro para atualizar nulo, operação cancelada!");
		T obj = em.merge(element);
		em.flush();
		return obj;
	}

	@Override
	public void delete(T element) {
		if (element == null)
			throw new IllegalArgumentException(
					"Parâmetro para remover nulo, operação cancelada!");
		em.remove(element);
		em.flush();
	}
	
	@Override
	public void deleteById(Object key) {
		T element = this.findById(key);
		this.delete(element);
	}

	public T findById(Object key) {
		return em.find(classe, key);
	}
	
	@Override
	public T find(ArrayList<String> properties, HashMap<String, Object> filters) {
		ArrayList<T> list = (ArrayList<T>)this.findAll(properties, filters);
		return list.size() > 0 ? list.get(0) : null;
	}
	
	@Override
	public T find(HashMap<String, Object> filters) {
		ArrayList<T> list = (ArrayList<T>)this.findAll(new ArrayList<String>(), filters);
		return list.size() > 0 ? list.get(0) : null;
	}
	
	@Override
	public T find(String property, Object value) {
		HashMap<String, Object> filters = new HashMap<String, Object>();
		filters.put(property, value);
		return this.find(filters);
	}
	
	@Override
	public Collection<T> findAll() {
		return this.findAll(new ArrayList<String>(), new HashMap<String, Object>());
	}
	
	@Override
	public Collection<T> findAll(ArrayList<String> properties) {
		return this.findAll(properties, new HashMap<String, Object>());
	}
	
	@Override
	public Collection<T> findAll(HashMap<String, Object> filters) {
		return this.findAll(new ArrayList<String>(), filters);
	}
	
	@Override
	public Collection<T> findAll(String property, Object value) {
		HashMap<String, Object> filters = new HashMap<String, Object>();
		filters.put(property, value);
		return this.findAll(filters);
	}

	@Override
	public Collection<T> findAll(ArrayList<String> properties, HashMap<String, Object> filters) {
		String jpql = "SELECT ";
		if(properties.size() > 0) {
			for(int i = 0; i < properties.size(); i++) {
				jpql += "C."+ properties.get(i);
				if(i != properties.size() - 1) {
					jpql += ", ";
				}
				else {
					jpql += " ";
				}
			}
		}
		else {
			jpql += "C ";
		}
		
		jpql += "FROM " + classe.getSimpleName() + " C ";
		
		/**
		 * Adiciona parâmetros na query
		 */
		if(filters.size() > 0) {
			jpql += "WHERE ";
			for(Map.Entry<String, Object> map : filters.entrySet()) {
				jpql += "C."+map.getKey() + " = :"+map.getKey();
			}
		}
		
		TypedQuery<T> query = em.createQuery(jpql, classe);
		
		/**
		 * Adiciona valor dos parâmetros na query
		 */
		for(Map.Entry<String, Object> map : filters.entrySet()) {
			query.setParameter(map.getKey(), map.getValue());
		}
		
		return query.getResultList();
	}
	
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}

	@Override
	public void commit() {
		em.getTransaction().commit();
	}

	@Override
	public void rollBack() {
		em.getTransaction().rollback();
	}
}

