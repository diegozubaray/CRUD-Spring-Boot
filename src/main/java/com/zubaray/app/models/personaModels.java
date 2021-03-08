package com.zubaray.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class personaModels {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String edad;
	
	@Column(name = "tipo_dni")
	private String tipoDni;
	
	@Column
	private String numeroDni;

	public personaModels() {

	}

	

	public personaModels(int id, String nombre, String apellido, String edad, String tipoDni , String numeroDni) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.tipoDni = tipoDni;
		this.numeroDni = numeroDni;
	}



	
	
	public String getNumeroDni() {
		return numeroDni;
	}



	public void setNumeroDni(String numeroDni) {
		this.numeroDni = numeroDni;
	}



	public String getTipoDni() {
		return tipoDni;
	}



	public void setTipoDni(String tipoDni) {
		this.tipoDni = tipoDni;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	
	
	

}
