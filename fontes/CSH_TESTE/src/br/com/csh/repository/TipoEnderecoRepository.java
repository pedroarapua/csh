package br.com.csh.repository;

import javax.enterprise.context.RequestScoped;
import br.com.csh.bean.TipoEnderecoBean;

@RequestScoped
public interface TipoEnderecoRepository extends GenericRepository<TipoEnderecoBean> {
	
}
