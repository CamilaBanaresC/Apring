package cl.aiep.proyectoModulo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.aiep.proyectoModulo2.Classes.Auto;
import cl.aiep.proyectoModulo2.Classes.Mueble;
import cl.aiep.proyectoModulo2.Classes.RopaEmty;
import cl.aiep.proyectoModulo2.controller.service.AutoService;
import cl.aiep.proyectoModulo2.controller.service.ComidaService;
import cl.aiep.proyectoModulo2.controller.service.MuebleService;
import cl.aiep.proyectoModulo2.controller.service.RopaEmtyService;

@RestController
@RequestMapping("/mall")
public class MallControler {

	
	@Autowired
	AutoService autoservice;
	@Autowired
	MuebleService muebleservice;
	@Autowired
	RopaEmtyService ropaEmtyService;
	
	
	@GetMapping
	public List<Auto> obtieneAutos(){
		
		return autoservice.obtieneAuto();
	}
	
	@GetMapping
	public List<Mueble> obtMuebles(){
		
		return muebleservice.obtieneMuebles();
	}
	
	
	@GetMapping
	public  List<RopaEmty> obRopaEmties(){
		return ropaEmtyService.obtieneRopa();

	}
}
