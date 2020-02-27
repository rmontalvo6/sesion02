package com.mitoscode.ejercicio9.functions;

@FunctionalInterface
public interface IFunction<T, R> {
	
//	Integer aaplly(Integer i);
	R apply(T t);
}
