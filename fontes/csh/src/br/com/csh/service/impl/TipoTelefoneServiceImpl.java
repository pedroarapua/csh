package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.csh.bean.TipoTelefoneBean;
import br.com.csh.repository.TipoTelefoneRepository;
import br.com.csh.service.TipoTelefoneService;
import br.com.csh.service.qualifier.Persistencia;

public class TipoTelefoneServiceImpl implements TipoTelefoneService {

	@Inject
	@Persistencia
	private EntityManager em;
	
	public TipoTelefoneServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(TipoTelefoneBean element) {
		repository().BeginTransction();
		repository().save(element);
		repository().Commit();

	}

	@Override
	public void update(TipoTelefoneBean element) {
		repository().BeginTransction();
		repository().update(element);
		repository().Commit();

	}

	@Override
	public void delete(TipoTelefoneBean element) {
		repository().BeginTransction();
		repository().delete(element);
		repository().Commit();

	}

	@Override
	public TipoTelefoneBean FindById(int key) {
		return repository().findById(key);
	}

	@Override
	public Collection<TipoTelefoneBean> findAll() {
		return repository().findAll();
	}
	
	private TipoTelefoneRepository repository(){
		TipoTelefoneRepository repo = new TipoTelefoneRepository();
		repo.setEm(em);
		return repo;
	}

}
