package br.com.jessicacorp.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.jessicacorp.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{
	
	// Aqui
	public ArrayList<Produto> findByOrderByPreco();
	public ArrayList<Produto> findByOrderByPrecoDesc();
	public ArrayList<Produto> findByNomeContaining(String palavraChave);

}
