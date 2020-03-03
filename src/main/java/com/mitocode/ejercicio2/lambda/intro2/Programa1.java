package com.mitocode.ejercicio2.lambda.intro2;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOperacion op = new IOperacion() {

			@Override
			public int operacion(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1 + n2;
			}

//		@Override
//		public int resta(int n3, int n4) {
//			// TODO Auto-generated method stub
//			return n3-n4;
//		}

		};

		int resultado = op.operacion(5, 4);
		System.out.println("Resutadlo: " + resultado);

//		int resultado1 = op.resta(5, 4);
//			System.out.println("Resutadlo: "+ resultado1);

		IOperacion o2 = (x, y) -> x + y;
		System.out.println("Suma:" + o2.operacion(5, 6));
		IOperacion o3 = (x, y) -> x - y;
		System.out.println("Resta:" + o3.operacion(9, 6));

//	IOperacion o3 = (m,n) -> m-n;
//	System.out.println("Resultado:" + o2.resta(5, 6));
	}

}
