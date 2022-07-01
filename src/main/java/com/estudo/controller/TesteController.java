package com.estudo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class TesteController {

	@GetMapping("/v1")
	public ResponseEntity<?> teste1() {
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/v2")
	public String teste2() {
		return "hello teste";
	}
	
	@GetMapping("/v3")
	public ResponseEntity<String> teste3() {
		return ResponseEntity.ok().body("Teste2");
	}
}
