package com.java.operators;

public class LogicalOperators {
	public static void main(String[] args) {
		int x = 11, y = 11;
		
		boolean test = x > 10 ^ y > 10;
		
		System.out.println(test);
	}
}
