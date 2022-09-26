package br.com.jessicacorp.ecommerce.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column (name = "numero")
	private Integer numero;
	
	@Column(name = "status", length = 1, nullable = false)
	private String status;
	
	@Column(name = "data_pedido", nullable = true)
	private LocalDate data_pedido;
	
	@Column(name = "valor_bruto", nullable = true)
	private Double valor_bruto;
	
	@Column(name = "desconto", nullable = true)
	private Double desconto;
	
	@Column(name = "valor_liq", nullable = true)
	private Double valor_liq;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("pedido")
	private List<ItemPedido> itens;
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliene(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getData_pedido() {
		return data_pedido;
	}
	public void setData_pedido(LocalDate data_pedido) {
		this.data_pedido = data_pedido;
	}
	public Double getValor_bruto() {
		return valor_bruto;
	}
	public void setValor_bruto(Double valor_bruto) {
		this.valor_bruto = valor_bruto;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getValor_liq() {
		return valor_liq;
	}
	public void setValor_liq(Double valor_liq) {
		this.valor_liq = valor_liq;
	}
	
	
	
}
