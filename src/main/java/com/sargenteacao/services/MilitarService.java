package com.sargenteacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sargenteacao.domain.Militar;
import com.sargenteacao.repositories.MilitarRepository;
import com.sargenteacao.services.exceptions.NoSuchElementException;

@Service
public class MilitarService {
	
	@Autowired
	private MilitarRepository militarRepository;
	
	public Militar findById(Integer id) {
		Optional<Militar> obj = militarRepository.findById(id);
		return obj.orElseThrow(()-> new NoSuchElementException("Elemento de Id "+id+" não existe"));
		
	}

}
