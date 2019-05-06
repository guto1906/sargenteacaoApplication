package com.sargenteacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sargenteacao.domain.Missao;
import com.sargenteacao.repositories.MissaoRepository;

@Service
public class MissaoService {
	
	@Autowired
	private MissaoRepository repo;
	
	public Missao buscar(Integer id) {
		Optional<Missao> obj = repo.findById(id);		
		return obj.orElse(null);
	}

}
