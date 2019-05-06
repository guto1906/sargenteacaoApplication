package com.sargenteacao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sargenteacao.domain.Missao;
import com.sargenteacao.services.MissaoService;

@RestController
@RequestMapping(value = "/missao")
public class MissaoResource {
	
	@Autowired
	private MissaoService missaoService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById (@PathVariable Integer id){
		Missao obj = missaoService.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
