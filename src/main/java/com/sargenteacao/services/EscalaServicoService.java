package com.sargenteacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sargenteacao.domain.EscalaServico;
import com.sargenteacao.repositories.EscalaServicoRepository;
import com.sargenteacao.services.exceptions.NoSuchElementException;

@Service
public class EscalaServicoService {
	
	@Autowired
	private EscalaServicoRepository escalaServicoRepository;
	
	public EscalaServico findById(Integer id) {
		Optional<EscalaServico> obj = escalaServicoRepository.findById(id);		
		return obj.orElseThrow(()-> new NoSuchElementException("Elemento de Id "+id+" não existe"));
	}

}
