package com.leidyRivas.ipoo.practicaParaElParcial.personas;

import java.util.Date;

//Cliente es una herencia de Persona
public class Beneficiario extends Persona{
	
	
	public Beneficiario(){
		
		//sirve para llamar al constructor de la clase padre
		super();
	}
	
	
	public Beneficiario(String nombre, String lugarDeNacimiento, Date fechaNacimiento, String nacionalidad, String tipoDoc,
			String nroDoc, String direccionParticular, String telefono) {
		super( nombre,  lugarDeNacimiento, fechaNacimiento, nacionalidad,  tipoDoc,
				 nroDoc,  direccionParticular, telefono);
		
	}

	
	
	

}
