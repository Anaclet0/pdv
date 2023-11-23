package br.com.pdv.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="item", schema = "pdv")
public class ItemEntidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_item")
	private Long id_item;
	public Long getId_item() {
		return id_item;
	}
	public void setId_item(Long id_item) {
		this.id_item = id_item;
	}
	
	@Column(name = "quantidade")
	private Long quantidade;
	public Long getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	@Column(name = "id_produto")
	private Long id_produto;
	public Long getId_produto() {
		return id_produto;
	}
	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}
	@Column(name = "id_venda")
	private Long id_venda;
	public Long getId_venda() {
		return id_venda;
	}
	public void setId_venda(Long id_venda) {
		this.id_venda = id_venda;
	}
}