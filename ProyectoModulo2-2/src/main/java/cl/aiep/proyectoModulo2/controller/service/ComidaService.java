package cl.aiep.proyectoModulo2.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.proyectoModulo2.Classes.Comida;
import cl.aiep.proyectoModulo2.repository.ComidaRepository;

@Service
public class ComidaService {

	@Autowired
	ComidaRepository repository;
	
	
	
	public List<Comida> obtieneComida(){
		
		return repository.findAll();
	}
}
