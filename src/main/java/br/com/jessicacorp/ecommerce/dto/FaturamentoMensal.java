package br.com.jessicacorp.ecommerce.dto;

public class FaturamentoMensal {
	
	private Integer mes;
	private Double ValorTotal;
	
	public FaturamentoMensal(Integer mes, Double valorTotal) {
		super();
		this.mes = mes;
		ValorTotal = valorTotal;
	}
	
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Double getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		ValorTotal = valorTotal;
	}
	
}
