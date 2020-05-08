package com.strings;

public class Exeception {

	public static void main(String[] args) {
		int sum;
		try {
			System.out.println("in try block");
			sum=1/0;
			System.out.println("sum is --" + sum);
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero error");
			
		}
		finally {
			System.out.println("inside finally block");
		}
		System.out.println("outside finally");
		System.out.println("tasmiya");
		
	}

}
