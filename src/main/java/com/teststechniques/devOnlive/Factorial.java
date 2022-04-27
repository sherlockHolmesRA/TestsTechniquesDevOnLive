package com.teststechniques.devOnlive;

public class Factorial {

	public static int factorial(int n) {
		int res = 1;
		for (int i = n; i > 1; i--) {
			res *= i;
		}
		return res;
	}
	
	public static void ResultFactorial(int f) {
		System.out.println(factorial(f));
	}
	
}
