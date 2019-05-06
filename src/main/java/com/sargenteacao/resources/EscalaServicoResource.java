package com.sargenteacao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sargenteacao.domain.EscalaServico;
import com.sargenteacao.services.EscalaServicoService;

@RestController
@RequestMapping(value = "/escala")
public class EscalaServicoResource {
	
	@Autowired
	private EscalaServicoService escalaServicoService;
	
	@RequestMapping(value = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id){
		
		EscalaServico escala = escalaServicoService.findById(id);
		
		return ResponseEntity.ok().body(escala);
		
	}
	
	

}
