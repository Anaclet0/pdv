package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidades.LojaEntidade;

@Repository
public interface LojasRepository extends JpaRepository<LojaEntidade, Long>{

}
