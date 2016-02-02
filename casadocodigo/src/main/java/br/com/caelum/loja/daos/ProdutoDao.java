package br.com.caelum.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.caelum.loja.models.Produto;

@Transactional
@Repository
public class ProdutoDao {

	@PersistenceContext
	private EntityManager manager;

	public void gravar(Produto produto) {
		manager.persist(produto);
	}

	public List<Produto> listar() {
		return manager.createQuery("Select p from Produto p", Produto.class).getResultList();
	}

	//Pra reever!
//	@Override
//	protected Filter[] getServletFilters() {
//		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
//		encodingFilter.setEncoding("UTF-8");
//
//		return new Filter[] { encodingFilter };
//	}
}
