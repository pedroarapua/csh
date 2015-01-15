package br.com.csh.service.producer;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManegerFactory {

	@SessionScoped
	@Produces
	public EntityManagerFactory createFactory(){
		return Persistence.createEntityManagerFactory("cshUP");
	}
}
