package com.strings;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		for(int i=1;i<=n;i++) {
			testMethod(i);
			System.out.println(i+":"+testMethod(i));
		}
	}

	private static int testMethod(int n) {
		// TODO Auto-generated method stub
		
		if(n<=1) {
			return n;
		}else {
			return testMethod(n-1)+testMethod(n-2);
		}
	}

}
