package com.sargenteacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sargenteacao.domain.Militar;

@Repository
public interface MilitarRepository extends JpaRepository<Militar, Integer>{

}
