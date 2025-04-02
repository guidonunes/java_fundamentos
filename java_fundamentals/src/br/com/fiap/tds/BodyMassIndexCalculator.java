package br.com.fiap.tds;

import java.util.Scanner;

public class BodyMassIndexCalculator {

		public static void main(String[]args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Type your weight in kilograms: ");
			double weight = scanner.nextDouble();
			System.out.print("Type your height (e.g.: 1.72): ");
			double height = scanner.nextDouble();
			
			double BMI = weight/(height * height);
			
			System.out.println("Your BMI is: " + BMI);
			
			if(BMI >= 18.5 && BMI <= 25) {
				System.out.println("Your weight is within the ideal range.");
			} else {
				System.out.println("Your weight is off the ideal range");
			}
			
		}
}
