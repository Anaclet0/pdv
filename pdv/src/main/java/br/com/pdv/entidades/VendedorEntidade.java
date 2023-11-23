
	package br.com.pdv.entidades;

	import java.io.Serializable;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name ="vendedor", schema = "pdv")
	public class VendedorEntidade implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@Column(name = "id_vendedor")
		private Long id_vendedor;
		public Long getId_vendedor() {
			return id_vendedor;
		}
		public void setId_vendedor(Long id_vendedor) {
			this.id_vendedor = id_vendedor;
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
