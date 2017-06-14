package com.leidyRivas.ipoo.practicas.archivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leidyRivas.ipoo.practicaParaElParcial.personas.Persona2;



public class Archivos {

	// metodo
	public void copiar(String origen, String destino) {

		// leer desde un archivo en disco
		FileInputStream entrada = null;

		// escribir en un archivo en disco
		FileOutputStream salida = null;

		try {

			entrada = new FileInputStream(origen);
			salida = new FileOutputStream(destino);

			int c;

			// se lee hasta encontrar el fin de línea
			while ((c = entrada.read()) != -1) {
				salida.write(c);
			}

			// Un fallo en cualquier punto produce la excepción IOException
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (entrada != null)
				try {
					entrada.close();

					// catch(IOException e) algo fue mal al leer o cerrar el
					// fichero
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (salida != null)
				try {
					salida.close();

					// catch(IOException e) algo fue mal al leer o cerrar el
					// fichero
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	public String leerArchivo(String archivo) {

		// Las clases FileReader permite leer
		
		FileReader entrada = null;
		char[] buffer = new char[1024];
		StringBuilder sb = new StringBuilder();

		try {

			entrada = new FileReader(archivo);
			while (entrada.read(buffer, 0, 1024) > 0) {
				sb.append(buffer);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (entrada != null)
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

		return sb.toString();

	}

	public void escribirArchivo(String archivo, String contenido) {

		// FileWriter permite escribir
		FileWriter salida = null;
		char[] buffer = contenido.toCharArray();

		try {

			salida = new FileWriter(archivo);
			salida.write(buffer, 0, buffer.length);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (salida != null)
				try {
					salida.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	
public void testObjeto(){
		
		Persona2 p=new Persona2(1, "Leidy Rivas", "999");
		ObjectMapper mapper=new ObjectMapper();
		String json;
		
		try {
			json = mapper.writeValueAsString(p);
			escribirArchivo("C:\\438-IPOO-JAVA-OTO2017\\archivos\\persona2.txt", 
					json);
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(leerArchivo("C:\\438-IPOO-JAVA-OTO2017\\archivos\\persona2.txt"));
		
	}
	// ejecutar los metodos
	public static void main(String[] args) {
		Archivos a = new Archivos();

		// para el metodo copiar
		// a.copiar("C:\\438-IPOO-JAVA-OTO2017\\archivos\\origen.txt",
		// "C:\\438-IPOO-JAVA-OTO2017\\archivos\\destino.txt");

		// para el metodo test
		a.testObjeto();

		// para el metodo leer
		//String contenido = a.leerArchivo("C:\\438-IPOO-JAVA-OTO2017\\archivos\\destino.txt");
		//System.out.println(contenido);
		
		
		
	}

}
