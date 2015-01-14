package br.com.csh.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public abstract class GenericRepository<T, K> implements Serializable {
	private static final long serialVersionUID = 1L;

	protected EntityManager em;
	private Class<T> classe;

	public GenericRepository(Class<T> classe) {
		super();
		this.classe = classe;
	}

	public T save(T element) {
		if (element == null)
			throw new IllegalArgumentException(
					"Parâmetro para adicionar nulo, operação cancelada!");
		em.persist(element);
		em.flush();
		return element;
	}

	public T update(T element) {
		if (element == null)
			throw new IllegalArgumentException(
					"Parâmetro para atualizar nulo, operação cancelada!");
		T obj = em.merge(element);
		em.flush();
		return obj;
	}

	public void delete(T element) {
		if (element == null)
			throw new IllegalArgumentException(
					"Parâmetro para remover nulo, operação cancelada!");
		em.remove(element);
		em.flush();
	}
	
	public void deleteById(K key) {
		T element = this.findById(key);
		this.delete(element);
	}

	public T findById(K key) {
		return em.find(classe, key);
	}
	
	public T find(ArrayList<String> properties, HashMap<String, Object> filters) {
		ArrayList<T> list = (ArrayList<T>)this.findAll(properties, filters);
		return list.size() > 0 ? list.get(0) : null;
	}
	
	public T find(HashMap<String, Object> filters) {
		ArrayList<T> list = (ArrayList<T>)this.findAll(new ArrayList<String>(), filters);
		return list.size() > 0 ? list.get(0) : null;
	}
	
	public T find(String property, Object value) {
		HashMap<String, Object> filters = new HashMap<String, Object>();
		filters.put(property, value);
		return this.find(filters);
	}
	
	public Collection<T> findAll(ArrayList<String> properties) {
		return this.findAll(properties, new HashMap<String, Object>());
	}
	
	public Collection<T> findAll(HashMap<String, Object> filters) {
		return this.findAll(new ArrayList<String>(), filters);
	}
	
	public Collection<T> findAll(String property, Object value) {
		HashMap<String, Object> filters = new HashMap<String, Object>();
		filters.put(property, value);
		return this.findAll(filters);
	}

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
	
	public void BeginTransction() {
		em.getTransaction().begin();
	}

	public void Commit() {
		em.getTransaction().commit();
	}

	public void RollBack() {
		em.getTransaction().rollback();
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
}

