package br.com.jessicacorp.ecommerce.service;

import java.util.ArrayList;

import br.com.jessicacorp.ecommerce.dto.FaturamentoMensal;
import br.com.jessicacorp.ecommerce.model.Pedido;

public interface IPedidoService {
	
	public Pedido inserirNovo(Pedido novo);
	public Pedido recuperarPeloNumero(Integer numero);
	public ArrayList<FaturamentoMensal> recuperarFaturamento(Integer ano);

}
