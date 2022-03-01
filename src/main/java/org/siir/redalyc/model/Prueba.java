package org.siir.redalyc.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement//Permite generar XML a partir de este bean
public class Prueba {
	private String clave;
	private String nombre;
	private String apellidos;
	private String revista;
	private int anio;
	
	public Prueba(String clave, String nombre, String apellidos, String revista, int anio) {
		this.clave = clave;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.revista = revista;
		this.anio = anio;
	}
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getRevista() {
		return revista;
	}
	public void setRevista(String revista) {
		this.revista = revista;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
}
