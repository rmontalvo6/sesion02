package com.mitoscode.ejercicio91.streams;

public class Empleado {
	private String nombres;
	private double sueldo;
	private Integer edad;
	private String skill;
	
	public Empleado() {
		super();
	}


	public Empleado(String nombres, double sueldo, Integer edad, String skill) {
		super();
		this.nombres = nombres;
		this.sueldo = sueldo;
		this.edad = edad;
		this.skill= skill;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public String getskill() {
		return skill;
	}


	public void setskill(String skill) {
		this.skill = skill;
	}


	@Override
	public String toString() {
		return "Empleado [nombres=" + nombres + ", sueldo=" + sueldo + ", edad=" + edad + ", skill=" + skill + "]";
	}
	
	

}
