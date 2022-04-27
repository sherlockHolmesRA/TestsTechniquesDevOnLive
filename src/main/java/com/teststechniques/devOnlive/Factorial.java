package com.teststechniques.devOnlive;

import java.util.stream.IntStream;

public class Factorial {

	public static int factorial(int n) {
		int res = 1;
		for (int i = n; i > 1; i--) {
			res *= i;
		}
		return res;
	}
	
	public static int factorial2(int n) {
		int res = IntStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
		return res;
	}
	
	public static void ResultFactorial(int f) {
		System.out.println(factorial(f));
		System.out.println(factorial2(f));
	}
	
}
