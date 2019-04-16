package com.sargenteacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sargenteacao.domain.ServicoEscala;

@Repository
public interface ServicoEscalaRepository extends JpaRepository<ServicoEscala, Integer>{

}
