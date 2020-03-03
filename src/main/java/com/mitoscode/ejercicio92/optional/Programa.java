package com.mitoscode.ejercicio92.optional;

import java.util.Optional;

public class Programa {

	public static void main(String[] args) {
		String nombre =null;
//		nombre = "Renzo";
//		System.out.println(nombre.toUpperCase());
		
		Optional<String> op = Optional.ofNullable(nombre);// en vez de utilizar difrente de null(IF) controlar exception NULLPOINTER
//		String nombre2 = op.get(); //devolver
		
			System.out.println(op.isPresent());

		nombre = op.orElse("juan");
		System.out.println(nombre);
	}

}
