package com.cris.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cris.IoC.servicio.ComponenteGigas;

@Controller
public class Rutas {

	@Autowired
	ComponenteGigas componenteGigas;
	
	
	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
		
		
		return "";
	}
	
	
	@GetMapping("/ficheros/profesorado")
	@ResponseBody
	public String profesores() {
		
		
		
		return "";
	}
	
	
	@GetMapping("/ficheros/alumnado")
	@ResponseBody
	public String alumnos() {
		
		
		
		return "";
	}
}
