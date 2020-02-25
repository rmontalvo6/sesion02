package com.mitocode.ejercicio1.lambda.intro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String [] colores = {"AZUL","VERDE","ROJO","NEGRO","AMARILLO", "ROSADO"};
		List<String> lista = Arrays.asList(colores);
		
		Collections.sort(lista);
		
		System.out.println("Lista Ordenada") ;
		for (String color : lista) {
			System.out.println(color + " ");
		}
		
		Collections.sort(lista, Collections.reverseOrder());
		System.out.println("\nLista descendente");
		for (String color : lista) {
			System.out.println(color + " ");
		}
		
		
			Comparator<String>	compar= new Comparator<String>() {
			
			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1) ;
			}
		};
		
		Collections.sort(lista, compar);
		System.out.println("\nLista comparetor");
		for (String color : lista) {
			System.out.println(color + " ");
		}
		
		
		
		
		
		
		
	}

}
