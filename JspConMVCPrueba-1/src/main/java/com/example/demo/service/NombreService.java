package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Nombres;
import com.example.demo.repository.NombresRepo;

public class NombreService {

	@Autowired
	NombresRepo nombresRepo;
	
	
	public List <Nombres> obtieneNombres(){
		return nombresRepo.findAll();
		
	}
	public Object obtieneNombre(Integer id) {
		Optional<Nombres> optional = nombresRepo.findById(id);
		 Nombres nombre= new Nombres();
		 if (optional.isPresent())
			 nombre= optional.get();
		
		return nombre;
	}
}
