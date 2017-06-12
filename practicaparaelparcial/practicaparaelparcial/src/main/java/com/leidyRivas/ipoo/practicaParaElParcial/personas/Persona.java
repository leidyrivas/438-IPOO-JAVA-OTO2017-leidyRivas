package com.leidyRivas.ipoo.practicaParaElParcial.personas;

import java.util.Date;

public class Persona {
	
	//atributos
	private String nombre;
	private String lugarDeNacimiento;
	private Date fechaNacimiento;
	private String nacionalidad;
	private String tipoDoc;
	private String nroDoc;
	private String direccionParticular;
	private String telefono;
	
	//contructor1 vacio
	public Persona(){
		
		
	}

	//constructor2 trae todas las propiedades de la clase
	public Persona(String nombre, String lugarDeNacimiento, Date fechaNacimiento, String nacionalidad, String tipoDoc,
			String nroDoc, String direccionParticular, String telefono) {
		super();
		this.nombre = nombre;
		this.lugarDeNacimiento = lugarDeNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.direccionParticular = direccionParticular;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}

	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getDireccionParticular() {
		return direccionParticular;
	}

	public void setDireccionParticular(String direccionParticular) {
		this.direccionParticular = direccionParticular;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}
