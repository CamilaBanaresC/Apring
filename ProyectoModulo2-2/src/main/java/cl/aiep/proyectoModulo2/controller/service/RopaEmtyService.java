package cl.aiep.proyectoModulo2.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.aiep.proyectoModulo2.Classes.RopaEmty;
import cl.aiep.proyectoModulo2.repository.RopaEmtyRepository;

public class RopaEmtyService {

	
	@Autowired
	RopaEmtyRepository rRepository;
	
	
	public List<RopaEmty> obtieneRopa(){
		
		return rRepository.findAll();
	}
}
