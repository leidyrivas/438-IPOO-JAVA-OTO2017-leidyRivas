package com.leidyRivas.ipoo.practicaParaElParcial.personas;

import java.util.Date;

//Asegurado es una herencia de Persona2
public class Cliente extends Persona{
	
	
	public Cliente(){
		
		//sirve para llamar al constructor de la clase padre
		super();
	}
	
	
	public Cliente(String nombre, String lugarDeNacimiento, Date fechaNacimiento, String nacionalidad, String tipoDoc,
			String nroDoc, String direccionParticular, String telefono) {
		super( nombre,  lugarDeNacimiento, fechaNacimiento, nacionalidad,  tipoDoc,
				 nroDoc,  direccionParticular, telefono);
		
	}

	
	
	

}
