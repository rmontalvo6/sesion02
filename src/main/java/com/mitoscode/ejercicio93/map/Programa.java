package com.mitoscode.ejercicio93.map;

import java.util.HashMap;
import java.util.Map;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> paises = new HashMap<>();

		paises.put("1", "Argentina");
		paises.put("2", "Brasil");
		paises.put("3", "Peru");

		// imprimir con lambda
		paises.forEach((k, v) -> System.out.println("Key:" + k + "\nValue:" + v));
		System.out.println();
		// otra forka
		paises.entrySet().stream().forEach(System.out::println);
		System.out.println();


		paises.putIfAbsent("2", "Peru");
		paises.entrySet().stream().forEach(System.out::println);
		System.out.println();
		
		
		String valor = paises.getOrDefault("PE", "Africa");
		System.out.println("valor : "+valor);

		
	}

}
