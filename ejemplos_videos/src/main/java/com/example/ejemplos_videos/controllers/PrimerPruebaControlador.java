package com.example.ejemplos_videos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/primerPrueba")

public class PrimerPruebaControlador {
	
	@GetMapping("iniciando")
	public String iniciandoElCurso() {
		return "IniciandoPagina";
		
	}
	
	@GetMapping("")
	public String inicio() {
		return "index";
		
	}

}
