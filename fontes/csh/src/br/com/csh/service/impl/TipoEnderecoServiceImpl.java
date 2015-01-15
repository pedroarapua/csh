package br.com.csh.service.impl;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.csh.bean.TipoEnderecoBean;
import br.com.csh.repository.TipoEnderecoRepository;
import br.com.csh.service.TipoEnderecoService;
import br.com.csh.service.qualifier.Persistencia;

public class TipoEnderecoServiceImpl implements TipoEnderecoService {

	@Inject
	@Persistencia
	private EntityManager em;
	
	public TipoEnderecoServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(TipoEnderecoBean element) {
		repository().BeginTransction();
		repository().save(element);
		repository().Commit();

	}

	@Override
	public void update(TipoEnderecoBean element) {
		repository().BeginTransction();
		repository().update(element);
		repository().Commit();

	}

	@Override
	public void delete(TipoEnderecoBean element) {
		repository().BeginTransction();
		repository().delete(element);
		repository().Commit();

	}

	@Override
	public TipoEnderecoBean FindById(int key) {
		return repository().findById(key);
	}

	@Override
	public Collection<TipoEnderecoBean> findAll() {
		return repository().findAll();
	}
	
	private TipoEnderecoRepository repository(){
		TipoEnderecoRepository repo = new TipoEnderecoRepository();
		repo.setEm(em);
		return repo;
	}

}
