package com.mitoscode.ejercicio8.supplier;

import java.util.function.Supplier;

public class Programa1 {

	public static void main(String[] args) {
		ISupplier<String> is= () -> "Hola";
		String nomString = is.get();
		System.out.println("Nombres:" +nomString);

		ISupplier<Integer> is2=  () -> 10 ;
		int edad = is2.get();
		System.out.println("EDAD:" +edad);
		
		Supplier<String> sp1=()-> "Holitas";
		nomString = sp1.get();
		System.out.println("Nombres:" +nomString);
		
		Supplier<Integer> sp2=()-> 50;
		edad = sp2.get();
		System.out.println("EDAD:" +edad);
		
		Supplier<Double> sp3=()-> Math.PI;
		double pi = sp3.get();
		 
		System.out.println("\nPI: "+pi);
		
		
	}
}
