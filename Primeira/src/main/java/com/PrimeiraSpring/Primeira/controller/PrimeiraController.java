package com.PrimeiraSpring.Primeira.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/Primeira")
public class PrimeiraController {
	
	@GetMapping
		
		public String Primeira () 
		{
			return "Atenção aos Detalhes e Persistência";
		}
	

}
