package cl.aiep.proyectoModulo2.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.proyectoModulo2.Classes.Mueble;
import cl.aiep.proyectoModulo2.repository.MuebleRepository;

@Service
public class MuebleService {

	
	@Autowired
	MuebleRepository reposirotye;
	
	public List<Mueble> obtieneMuebles(){
		
		return reposirotye.findAll();
		
	}

}
