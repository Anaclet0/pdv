
package br.com.pdv.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="loja", schema = "pdv")
public class LojaEntidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_loja")
	private Long id_loja;
	
	
	public Long getId_loja() {
		return id_loja;
	}
	public void setId_loja(Long id_loja) {
		this.id_loja = id_loja;
	}
	@Column(name = "nome")
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
	
	

}
