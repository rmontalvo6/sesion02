package com.mitoscode.ejercicio6.referencias.metodos;


public class Programa2 {

	public static void main(String[] args) {
	IEmpleado iemp = new IEmpleado() {
		
		@Override
		public Empleado crear(String nombres, double sueldo, int edad) {
 			return new Empleado(nombres,sueldo,edad);
		}
	};
	//usando clase anonima
	Empleado e1=	iemp.crear("Renzo", 400.0, 28);
	System.out.println(e1);
	
	//usando expresiones lamda
	IEmpleado emp2 = (nombres,sueldo,edad) -> 
	new Empleado(nombres,sueldo,edad);
	Empleado e2 = emp2.crear("Alejandro", 4000.0, 18);
	System.out.println(e2);
	
	//usando referencias de metodos
	IEmpleado iemp3 = Empleado::new;
	Empleado e4 = iemp3.crear("Manual", 10000.0, 19);
	System.out.println(e4);


	}
}
