package br.com.jessicacorp.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.jessicacorp.ecommerce.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

}
