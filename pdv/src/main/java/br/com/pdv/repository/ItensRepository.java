package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidades.ItemEntidade;


	@Repository
	public interface ItensRepository extends JpaRepository<ItemEntidade, Long>{

	}


