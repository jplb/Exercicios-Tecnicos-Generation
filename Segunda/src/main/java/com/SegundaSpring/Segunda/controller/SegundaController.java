package com.SegundaSpring.Segunda.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping ("/Segunda")
public class SegundaController {
	
	@GetMapping
	public String Segunda()
	{
		return "Spring Boot e Revisar POO";
	}
	//Como faço pra configurar uma porta diferente????!

}
