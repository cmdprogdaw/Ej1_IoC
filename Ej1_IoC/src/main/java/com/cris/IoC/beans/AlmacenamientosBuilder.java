package com.cris.IoC.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cris.IoC.beans.almacenamiento.Almacenamiento;

@Configuration
public class AlmacenamientosBuilder {

	@Bean
	public Almacenamiento alumnado() {
		
		Almacenamiento almacenamiento = new Almacenamiento();
		almacenamiento.setPath("/ficheros/alumnado");
		almacenamiento.setTamanio(0.1f);
		
		return almacenamiento;
	}
	
	@Bean
	public Almacenamiento profesorado() {
		
		Almacenamiento almacenamiento = new Almacenamiento();
		almacenamiento.setPath("/ficheros/profesorado");
		almacenamiento.setTamanio(2);
		
		return almacenamiento;
	}
}
