package com.mitoscode.ejercicio91.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empleado> lista = new ArrayList<>();

		Empleado e1 = new Empleado("Dany", 1500, 18, "Tecnico");
		Empleado e2 = new Empleado("Renzo", 5522, 26, "Soporte");
		Empleado e3 = new Empleado("Alejandro", 1000, 28, "Java");
		Empleado e4 = new Empleado("Belinda", 2500, 26, "Java9");

		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		lista.add(e4);

		// usando consumer para listar con expresiones LAMBDAD
		lista.forEach(e -> System.out.println(e));

		int count = 0;
		for (int i = 0; i < lista.size(); i++) {
			count++;
		}
		System.out.println("# DE Empleados :" + count);

		// CONTADOR CORTO
		long c = lista.stream().count();
		System.out.println("# Contador corto : " + c);

		// ordenar

//		System.out.println("Lista ordenadas" + lista.stream()
//		.sorted((x,y)
//				-> x.getNombres().compareTo(y.getNombres()))
//		.forEach(e ->System.out.println(e));

		System.out.println("Empleados que empiezan con D O R");
		lista.stream().filter(e -> e.getNombres().startsWith("D") || e.getNombres().startsWith("R"))
				.forEach(e -> System.out.println(e));

		String nombre = "D";

		boolean estado = nombre.startsWith("D");
		System.out.println(estado);

		System.out.println("Empleados de Edad Mayor a 25 y Perfil Java");
		lista.stream().filter(e -> e.getEdad() > 25 && e.getskill().equals("Java")).forEach(e -> System.out.println(e));
		
		//Limitar
		
		System.out.println("\nEmpleados 2 primeros");
//		lista.stream().limit(2).forEach(e -> System.out.println(e));
		lista.stream().limit(2).forEach(System.out::println);
		
		
		System.out.println("\nEmpleados # 2 ");
		lista.stream().limit(2).forEach(e -> System.out.println(e));

		System.out.println("\nEmpleados 2 ultimos -Ordenados or nombre");

//		lista.stream().sorted((x,y)-> -x.getNombres().compareTo(y.getNombres())).limit(2).forEach(e -> System.out.println(e)); //desc
		lista.stream().sorted((x,y)-> x.getNombres().compareTo(y.getNombres())).limit(2).forEach(e -> System.out.println(e));
		
		
		System.out.println("\nLista Nueva");
		List<Empleado> listaNueva = lista.stream().filter(e -> e.getSueldo() > 1500).collect(Collectors.toList());
		listaNueva.forEach(System.out::println);
		
		//transformar
		System.out.println("\nLista empleados en MAYUSCULAS");
		lista.stream().map(e -> e.getNombres().toUpperCase()).forEach(System.out::println);
		
		//Nuevo
		System.out.println("\nLista empleados en MAs 200");
		List<Empleado> listanueva2=	lista.stream().map( e ->new Empleado(e.getNombres(), e.getSueldo() +200, e.getEdad(), e.getskill())).collect(Collectors.toList());
		listanueva2.forEach(System.out::println);
		
		
	}

}
