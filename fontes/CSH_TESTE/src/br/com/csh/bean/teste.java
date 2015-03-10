package br.com.csh.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.csh.repository.TipoEnderecoRepository;

public class teste {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cshUnity");
		EntityManager em = factory.createEntityManager();
		//TipoEnderecoRepository tipoEnderecoRepository = new TipoEnderecoRepository();
		//tipoEnderecoRepository.setEm(em);
		
		//TipoEnderecoBean tipoEndereco = tipoEnderecoRepository.find("descricao", "Residencial1");
		
		/*
		tipoEnderecoRepository.BeginTransction();
		
		TipoEnderecoBean tipoEndereco = new TipoEnderecoBean();
		tipoEndereco.setDescricao("Residencial").setUsuario(new UsuarioBean().setId(1));
		tipoEnderecoRepository.save(tipoEndereco);
		
		tipoEnderecoRepository.Commit();
		*/
		
		
		em.close();
		factory.close();
	}
}
