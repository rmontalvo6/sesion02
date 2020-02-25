package com.mitoscode.ejercicio3.scope;

public class Programa2 {
	public void variablesLocales() {
		
		int z =10;
	IOPereaciones op = new IOPereaciones() {
		
		@Override
		public int suma(int x, int y) {
			// TODO Auto-generated method stub
//			z = 20;
			return x+y+z;
			}
		};	
		System.out.println("CLASE ANONIMA: " + op.suma(10, 15));
		IOPereaciones op2= (x,y) ->{
			return x+y+z;
		};
		System.out.println("CLASE LAMBDAD: " + op2.suma(20, 20));

		
		
	}
	
	
	public static void main(String[] args) {
		Programa2 p= new Programa2();
		p.variablesLocales();
	}

}
