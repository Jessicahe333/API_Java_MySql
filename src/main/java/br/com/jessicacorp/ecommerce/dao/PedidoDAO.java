package br.com.jessicacorp.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.jessicacorp.ecommerce.dto.FaturamentoMensal;
import br.com.jessicacorp.ecommerce.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {
	
	@Query("SELECT new " 
			+ "br.com.jessicacorp.ecommerce.dto.FaturamentoMensal(month(p.data_pedido), sum(p.valor_liq)) "
			+ "FROM Pedido p " 
			+ "WHERE year(p.data_pedido) = :ano "
			+ "GROUP BY month(p.data_pedido) " 
			+ "ORDER BY month(p.data_pedido) " )
	public ArrayList<FaturamentoMensal> recuperarFaturamentoPorAno(@Param("ano") Integer ano);

}
