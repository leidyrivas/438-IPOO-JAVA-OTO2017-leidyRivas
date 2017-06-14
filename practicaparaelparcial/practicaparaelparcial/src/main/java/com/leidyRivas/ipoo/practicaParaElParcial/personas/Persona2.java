package com.leidyRivas.ipoo.practicaParaElParcial.personas;

import java.util.Date;


//esta clase cree para ejecutar el metodo test en el paquete practica archivos
public class Persona2 {
	
	//atributos
	private int id;
	private String nombre;
	private String nroDocumento;
	
	//contructor1 vacio
	public Persona2(){
		
		
	}

	public Persona2(int id, String nombre, String nroDoc) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nroDocumento = nroDoc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroDoc() {
		return nroDocumento;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDocumento = nroDoc;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", nroDocumento=" + nroDocumento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nroDocumento == null) ? 0 : nroDocumento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona2 other = (Persona2) obj;
		if (id != other.id)
			return false;
		if (nroDocumento == null) {
			if (other.nroDocumento != null)
				return false;
		} else if (!nroDocumento.equals(other.nroDocumento))
			return false;
		return true;
	}
	
}
