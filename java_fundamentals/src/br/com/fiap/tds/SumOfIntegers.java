package br.com.fiap.tds;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the first number: ");
		int firstNumber = scanner.nextInt();
		System.out.print("Type the second number: ");
		int secondNumber = scanner.nextInt();
		
		int sum = firstNumber + secondNumber;
		
		System.out.println("The sum is " + sum);
		scanner.close();
		
		int rest = sum % 2;
		
		if(rest == 0) {
			System.out.println(sum + " is an even number.");
		} else {
			System.out.println(sum + " is an odd number.");
		}
		
	}
}
