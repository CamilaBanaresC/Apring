package cl.aiep.proyectoModulo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.aiep.proyectoModulo2.Classes.Comida;
import cl.aiep.proyectoModulo2.controller.service.ComidaService;

@RestController
@RequestMapping("/comida")
public class ComidasController {

	@Autowired
	ComidaService comidaservice;
	
	
	@GetMapping("/obtiene")
	public List<Comida> obtieneComida(){
		
	return comidaservice.obtieneComida();
	}
}
