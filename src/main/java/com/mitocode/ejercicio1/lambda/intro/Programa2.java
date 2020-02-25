package com.mitocode.ejercicio1.lambda.intro;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa2 {

	public static void main(String[] args) {

		List<Empleado> lista = new ArrayList<>();

		Empleado e1 = new Empleado("Rio", 50.5, 12);
		Empleado e2 = new Empleado("Denber", 100, 54);
		Empleado e3 = new Empleado("Moscu", 12.2, 60);
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		
		//**********************************************************************

		Comparator<Empleado> comparetorEdad = new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				// TODO Auto-generated method stub
//						return o1.getNombres().compareTo(o2.getNombres());
				if (o1.getEdad() < o2.getEdad()) {
					return -1;
				}
				if (o1.getEdad() >o2.getEdad()) {
					return 1;
				} else {
					return 0;
				}
			}
		};
//		Collections.sort(lista, comparetorEdad);
//		System.out.println("lista de Empleados comparetorEdad");
//		for (Empleado empleado : lista) {
//			System.out.println(empleado);
//		}
		
		//**********************************************************************
		Comparator<Empleado> comparatorSueldo = new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				// TODO Auto-generated method stub
//						return o1.getNombres().compareTo(o2.getNombres());
				if (o1.getSueldo() < o2.getSueldo()) {
					return -1;
				}
				if (o1.getSueldo() > o2.getSueldo()) {
					return 1;
				} else {
					return 0;
				}
			}
		};
		Collections.sort(lista, comparatorSueldo);
		System.out.println("lista de Empleados + sueldo");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		lista.sort(comparetorEdad);
		System.out.println("lista.sort de empleados con compartoro:");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		//lambdad
		lista.sort(( o1, o2) -> o1.getNombres().compareTo(e2.getNombres()));
			
			
		
		lista.sort((o1,o2)-> o1.getEdad().compareTo(e2.getEdad()));
		}

}
