package com.mitoscode.ejercicio5.funcionales;


@FunctionalInterface
public interface IOPereaciones {
	int suma (int x, int y);
	
	default double resta (int x, int y) {
		return x-y;
	}
	
	default void metodoDefecto () {
		System.out.println("MEtodo defecto sin parametros");
		
		
	}
	default void metodoDefecotoConParametros(String operacion) {
		System.out.println("Metodo defecto sin parametros");
		
	}
	default double valorPI() {
		return Math.PI;
	}
}
