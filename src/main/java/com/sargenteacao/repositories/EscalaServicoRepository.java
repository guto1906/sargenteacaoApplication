package com.sargenteacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sargenteacao.domain.EscalaServico;

@Repository
public interface EscalaServicoRepository extends JpaRepository<EscalaServico, Integer>{

}
