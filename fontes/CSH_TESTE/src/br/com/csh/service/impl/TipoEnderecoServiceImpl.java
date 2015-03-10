package br.com.csh.service.impl;

import java.util.Collection;
import java.util.HashMap;
import javax.inject.Inject;
import br.com.csh.bean.TipoEnderecoBean;
import br.com.csh.repository.TipoEnderecoRepository;
import br.com.csh.service.TipoEnderecoService;

public class TipoEnderecoServiceImpl implements TipoEnderecoService {

	@Inject
	private TipoEnderecoRepository tipoEnderecoRepository;
	
	public TipoEnderecoServiceImpl() {
		super();
	}

	@Override
	public void save(TipoEnderecoBean element) {
		tipoEnderecoRepository.beginTransaction();
		tipoEnderecoRepository.save(element);
		tipoEnderecoRepository.commit();

	}

	@Override
	public void update(TipoEnderecoBean element) {
		tipoEnderecoRepository.beginTransaction();
		tipoEnderecoRepository.update(element);
		tipoEnderecoRepository.commit();

	}

	@Override
	public void delete(TipoEnderecoBean element) {
		tipoEnderecoRepository.beginTransaction();
		tipoEnderecoRepository.delete(element);
		tipoEnderecoRepository.commit();

	}

	@Override
	public TipoEnderecoBean findById(Object key) {
		return tipoEnderecoRepository.findById(key);
	}

	@Override
	public Collection<TipoEnderecoBean> findAll() {
		return tipoEnderecoRepository.findAll();
	}

	@Override
	public Collection<TipoEnderecoBean> findByDescricao(String value) {
		HashMap<String, Object> filters = new HashMap<String, Object>();
		filters.put("descricao", value);
		
		return tipoEnderecoRepository.findAll(filters);
	}

}
