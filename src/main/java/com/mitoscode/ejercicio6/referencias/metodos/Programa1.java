package com.mitoscode.ejercicio6.referencias.metodos;

import java.util.Arrays;

public class Programa1 {
	
	static void referenciametodoStatic() {
		System.out.println("HOLA");
	}

	public static void main(String[] args) {
		IOPeracion op1 = () ->{
			int x=5;
			int y= 2;
			System.out.println("Hojas Impresas: "+ (x+y));
		};
		op1.imprimir();
		//Referencia a un metodo static
		IOPeracion op2 =() -> Programa1.referenciametodoStatic();
		op2.imprimir();
		// simplificado
		IOPeracion op3 = Programa1::referenciametodoStatic;
		op3.imprimir();
		
		
	
		
		String [] colores = {"Negro", "Azul", "Morado", "verde", "amarillo", "Anaranjado"};
		System.out.println("colores: ");
		
		for (String color : colores) {
			System.out.println(color);
		}
		Arrays.sort(colores, String::compareToIgnoreCase); //toma primero las minusculas ignora las mayusculas
		System.out.println("\ncolores compareTo: ");

		for (String color : colores) {
			System.out.println(color);
		}
		
	}

}
