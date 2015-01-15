package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.csh.bean.TipoLogradouroBean;
import br.com.csh.repository.TipoLogradouroRepository;
import br.com.csh.service.TipoLogradouroService;
import br.com.csh.service.qualifier.Persistencia;

public class TipoLogradouroServiceImpl implements TipoLogradouroService {

	@Inject
	@Persistencia
	private EntityManager em;
	
	public TipoLogradouroServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(TipoLogradouroBean element) {
		repository().BeginTransction();
		repository().save(element);
		repository().Commit();

	}

	@Override
	public void update(TipoLogradouroBean element) {
		repository().BeginTransction();
		repository().update(element);
		repository().Commit();

	}

	@Override
	public void delete(TipoLogradouroBean element) {
		repository().BeginTransction();
		repository().delete(element);
		repository().Commit();

	}

	@Override
	public TipoLogradouroBean FindById(int key) {
		return repository().findById(key);
	}

	@Override
	public Collection<TipoLogradouroBean> findAll() {
		return repository().findAll();
	}
	
	private TipoLogradouroRepository repository(){
		TipoLogradouroRepository repo = new TipoLogradouroRepository();
		repo.setEm(em);
		return repo;
	}

}
