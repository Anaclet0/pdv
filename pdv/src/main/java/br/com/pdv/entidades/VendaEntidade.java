package br.com.pdv.entidades;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="venda", schema = "pdv")
public class VendaEntidade implements Serializable {

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_venda")
	private Long id_venda;
	public Long getId_venda() {
		return id_venda;
	}
	public void setId_venda(Long id_venda) {
		this.id_venda = id_venda;
	}
	
	
	@Column(name = "data_venda")
	private Date data_venda;
	public Date getData_venda() {
		return data_venda;
	}
	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}
	
	
	@Column(name = "id_loja")
	private Long id_loja;
	
	
	public Long getId_loja() {
		return id_loja;
	}
	public void setId_loja(Long id_loja) {
		this.id_loja = id_loja;
	}
	
	
	@Column(name = "id_vendedor")
	private Long id_vendedor;
	public Long getId_vendedor() {
		return id_vendedor;
	}
	public void setId_vendedor(Long id_vendedor) {
		this.id_vendedor = id_vendedor;
	}
	
	
	
	
}
