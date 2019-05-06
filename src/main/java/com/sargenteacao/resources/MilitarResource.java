package com.sargenteacao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sargenteacao.domain.Militar;
import com.sargenteacao.services.MilitarService;

@RestController
@RequestMapping(value = "/militar")
public class MilitarResource {
	
	@Autowired
	private MilitarService militarService;
	
	@RequestMapping(value = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id){
		
		Militar mil = militarService.findById(id);
		
		return ResponseEntity.ok().body(mil);
		
	}
	
	

}
