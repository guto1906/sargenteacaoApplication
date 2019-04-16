package com.sargenteacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sargenteacao.domain.Missao;

@Repository
public interface MissaoRepository extends JpaRepository<Missao, Integer>{

}
