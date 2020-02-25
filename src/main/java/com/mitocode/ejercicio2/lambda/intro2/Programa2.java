package com.mitocode.ejercicio2.lambda.intro2;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa2 {

	public static void main(String[] args) {
		IOperacion op1 = new IOperacion() {
			
			@Override
			public int operacion(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1 - n2;
			}
		};
		System.out.println("Suma OP: "+ op1.operacion(8, 4));
		
		
		IOperacion o2 = (x,y) -> {
			int z= 3;
			return x +y + z;
		};
		System.out.println("Suma:" + o2.operacion(5, 6));
		
		//lamda sin argumentos
		IOPeracionSinParametros op3 = () -> Math.PI;
		System.out.println("PI: "+ op3.operacion());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
