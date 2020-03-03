package com.mitoscode.ejercicio91.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {

		List<Empleado> lista = new ArrayList<>();
		
		Empleado e1 = new Empleado("Dany", 2000, 29, "Java");
		Empleado e2 = new Empleado("Juan", 1500, 25, ".Net");
		Empleado e3 = new Empleado("Pedro", 2300, 32, "Python");
		
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		
//		Listar
		lista.stream().forEach(e -> System.out.println(e));
		
//		Contar empleados
		int c = 0;
		for (int i = 0; i < lista.size(); i++) {
			c++;
		}
		System.out.println("# empleados: " + c);
//		Usan stream
		long count = lista.stream().count();
		System.out.println("# empleados: " + count);
		
//		Ordenar
		System.out.println("Lista ascendente: ");
		lista.stream()
			.sorted((x,y) -> x.getNombres().compareTo(y.getNombres()))
		.forEach(e -> System.out.println(e));
		
		System.out.println("Lista descendente: ");
		lista.stream()
			.sorted((x,y) -> y.getNombres().compareTo(x.getNombres()))
		.forEach(e -> System.out.println(e));
		
//		Filtros
		String nombre = "Dany";
		boolean estado = nombre.startsWith("D");
		System.out.println(estado);
		
//		Uso de predicate
		System.out.println("\nEmpleados que empiezan con D");
		lista.stream()
			.filter(e -> e.getNombres().startsWith("D"))
			.forEach(e -> System.out.println(e));
		
		System.out.println("\nEmpleados que empiezan con D o P");
		lista.stream()
			.filter(e -> e.getNombres().startsWith("D") || e.getNombres().startsWith("P"))
			.forEach(e -> System.out.println(e));
		
		System.out.println("\nEmpleados mayores de 25 y con skill Java");
		lista.stream()
			.filter(e -> e.getEdad() > 25 && e.getskill().equals("Java"))
			.forEach(e -> System.out.println(e));
		
//		Limitar
		System.out.println("\nEmpleados 2 primeros:");
		lista.stream().limit(2).forEach(System.out::println);
		
		System.out.println("\nEmpleados 2 ultimos - Nombres descendente: ");
		lista.stream()
			.sorted((x,y) -> -x.getNombres().compareTo(y.getNombres()))
		.limit(2)
		.forEach(e -> System.out.println(e));
		
		System.out.println("\nLista nueva:");
		List<Empleado> listaNueva = lista.stream()
				.filter(e -> e.getSueldo() > 1500)
				.collect(Collectors.toList());
		listaNueva.forEach(System.out::println);
		
//		Transformar
		System.out.println("\nLista empleados nombres en mayuscula:");
		lista.stream()
			.map(e -> e.getNombres().toUpperCase())
			.forEach(System.out::println);
	
		System.out.println("\nLista nueva empleados con sueldo + 200:");
		List<Empleado> listaNueva2 = lista.stream()
			.map(e -> 
			new Empleado(e.getNombres(),
					e.getSueldo() + 200, e.getEdad(), e.getskill()))
			.collect(Collectors.toList());
		listaNueva2.forEach(System.out::println);
	}

}
