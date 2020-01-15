package com.cris.IoC.beans.almacenamiento;

public class Almacenamiento {

	private String path;
	
	private float tamanio;

	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public float getTamanio() {
		return tamanio;
	}

	public void setTamanio(float tamanio) {
		this.tamanio = tamanio;
	}

	
	@Override
	public String toString() {
		return "Almacenamiento [path=" + path + ", tamanio=" + tamanio + "]";
	}
	
	
}
