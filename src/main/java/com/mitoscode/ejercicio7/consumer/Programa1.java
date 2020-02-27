package com.mitoscode.ejercicio7.consumer;

import java.util.function.Consumer;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	IConsumer<String> ie = (v) ->System.out.println(v);
	ie.accept("hola");

	IConsumer<Integer> ie2 = (v) ->System.out.println(v);
	ie2.accept(50);
	
	
	Consumer<String> c1 = (v) ->System.out.println(v);
	c1.accept("HOLITAS");
	
	Consumer<Integer> c2 = (v) ->System.out.println(v);
	c2.accept(5);
	
	
	}

}
