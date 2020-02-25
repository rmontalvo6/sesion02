package com.mitoscode.ejercicio5.funcionales;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOPereaciones op = (x,y) -> x+y;
		System.err.println(op.suma(5, 4));
		System.out.println("PI: "+ op.valorPI());
		op.metodoDefecotoConParametros("suma");
		System.out.println("Resta:" + op.resta(8, 6));
		
		
	}

}
