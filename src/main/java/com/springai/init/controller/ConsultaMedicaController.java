package com.springai.init.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springai.init.service.ConsultaMedicaService;

@RestController
public class ConsultaMedicaController {

	ConsultaMedicaService consultaMedicaService;

	public ConsultaMedicaController(ConsultaMedicaService consultaMedicaService) {
		super();
		this.consultaMedicaService = consultaMedicaService;
	}
	
	@GetMapping("consulta")
	public ResponseEntity<String> consultaSintoma(@RequestParam("sintoma") String sintoma){
		return new ResponseEntity<>(consultaMedicaService.consultaSintoma(sintoma),HttpStatus.OK);
	}

}
