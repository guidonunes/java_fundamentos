package br.com.fiap.tds;

import java.util.Scanner;

public class DataReader {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		System.out.println("Your age is " + age);
		scanner.close();
		
	}
	
	
}
