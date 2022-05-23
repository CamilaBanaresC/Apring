package cl.aiep.proyectoModulo2.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.proyectoModulo2.Classes.Auto;
import cl.aiep.proyectoModulo2.repository.AutoRepository;

@Service
public class AutoService {
	@Autowired
	AutoRepository autorepository;
	
	public List<Auto> obtieneAuto(){
		
		return autorepository.findAll();	}
	
}
