package com.leidyRivas.ipoo.practicaParaElParcial.personas;

public class LocalDeSalud {
	
	private long id;
	private String nombre;
	private String direccion;
	private String telefono;
	
	
	//constructor1 vacio
	public LocalDeSalud(){
		
	}
	
	
	//constructor2
	public LocalDeSalud(long id, String nombre, String direccion, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	
	
	
	

}
