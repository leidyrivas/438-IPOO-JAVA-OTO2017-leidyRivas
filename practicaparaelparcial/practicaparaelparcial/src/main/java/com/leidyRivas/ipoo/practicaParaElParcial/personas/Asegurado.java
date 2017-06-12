package com.leidyRivas.ipoo.practicaParaElParcial.personas;

import java.util.Date;

//Asegurado es una herencia de Persona
public class Asegurado extends Persona{
	
	
	public Asegurado(){
		
		//sirve para llamar al constructor de la clase padre
		super();
	}
	
	
	public Asegurado(String nombre, String lugarDeNacimiento, Date fechaNacimiento, String nacionalidad, String tipoDoc,
			String nroDoc, String direccionParticular, String telefono) {
		super( nombre,  lugarDeNacimiento, fechaNacimiento, nacionalidad,  tipoDoc,
				 nroDoc,  direccionParticular, telefono);
		
	}

	
	

	

}
