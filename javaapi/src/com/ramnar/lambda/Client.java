package com.ramnar.lambda;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathOperation sum = (a, b) -> a + b ;
		MathOperation product = (a, b) -> a * b;
		
		System.out.println("Sum is "  + new Client().operate(4, 3, sum));
		System.out.println("Product is "  + new Client().operate(4, 3, product));

	}
	interface MathOperation{
		public int operation( int a, int b);
	}
	
	public int operate(int a, int b, MathOperation operation) {
		return operation.operation(a, b);
	}

}

