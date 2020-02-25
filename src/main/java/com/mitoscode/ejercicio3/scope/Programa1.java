package com.mitoscode.ejercicio3.scope;

public class Programa1 {
	int entero;
	float flotante;
	double decimal;
	String cadena;
	boolean estado;
	
	public void variablesGlobales() {
		System.out.println("int = "+ entero);
		System.out.println("float = "+ flotante);
		System.out.println("decimal = "+ decimal);
		System.out.println("String = "+ cadena);
		System.out.println("bolean = "+ estado);


	}
	public void variablesLocales() {
		//varialbes locales -> necesitan ser inicialidads con un valor
	}
	
	public static void main(String[] args) {
		
		Programa1 p= new Programa1();
		p.variablesGlobales();
		
	}
}
