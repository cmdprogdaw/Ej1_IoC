package com.cris.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cris.IoC.beans.almacenamiento.Almacenamiento;

@Controller
public class Rutas {

	@Autowired
	Almacenamiento alumnado;
	
	@Autowired
	Almacenamiento profesorado;
	
	
	
	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
		return alumnado + "<br>" + profesorado;
	}
	
}
