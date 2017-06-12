package com.leidyRivas.ipoo.practicaParaElParcial.personas;

import java.util.Date;

//Propietario es una herencia de Persona
public class Propietario extends Persona{
	
	
	public Propietario(){
		
		//sirve para llamar al constructor de la clase padre
		super();
	}
	
	
	public Propietario(String nombre, String lugarDeNacimiento, Date fechaNacimiento, String nacionalidad, String tipoDoc,
			String nroDoc, String direccionParticular, String telefono) {
		super( nombre,  lugarDeNacimiento, fechaNacimiento, nacionalidad,  tipoDoc,
				 nroDoc,  direccionParticular, telefono);
		
	}

	
	
	

}
