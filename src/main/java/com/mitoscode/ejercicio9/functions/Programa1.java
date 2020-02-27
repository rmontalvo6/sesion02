package com.mitoscode.ejercicio9.functions;

import java.util.function.Function;

public class Programa1 {

	public static void main(String[] args) {
		
		IFunction <Integer, Integer>fn = (x)-> x*x;
		int resultado = fn.apply(5);
		System.out.println(resultado);
		
		//objeto reservado Function
		Function<Double, Double> fn1 = (x)-> x*x;
		double resultado1 = fn1.apply(5.4);
		System.out.println(resultado1);
		

	}
}
