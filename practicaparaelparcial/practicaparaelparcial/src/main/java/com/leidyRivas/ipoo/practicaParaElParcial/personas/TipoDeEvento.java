package com.leidyRivas.ipoo.practicaParaElParcial.personas;

public class TipoDeEvento {
	
	private long id;
	private String nombre;
	
	public TipoDeEvento(){
		
	}

	public TipoDeEvento(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}


