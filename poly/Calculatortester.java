package com.xworkz.Polymorphism;

public class Calculatortester { 
	public static void main(String []args) {  
		
		package com.xworkz.coreJava;

		import java.util.Scanner;
		import com.xworkz.coreJava.Oops.Polymerphism.Calculator.ScientificCalculator;

		public class CalculatorTester {
			public static void main(String[] args) {
				ScientificCalculator scCalculator = new ScientificCalculator("Casio", "Scientific");
				Scanner scanner = new Scanner(System.in);
				
				
				System.out.println("__________________________________________________________");
				System.out.println("Enter the Two values Non-Decimal Values for Addition :");
				int str = scCalculator.addition(scanner.nextInt(), scanner.nextInt());
				System.out.println("Additon of Two Non-Decimal : " + str);

				System.out.println("Enter the Two values Decimal Values for Addition :");
				double str1 = scCalculator.addition(scanner.nextDouble(), scanner.nextDouble());
				System.out.println("Additon of Two Decimal : " + str1);

				System.out.println("Enter the Two values Non-Decimal Values for Subtraction :");
				int str2 = scCalculator.subtraction(scanner.nextInt(), scanner.nextInt());
				System.out.println("Subtraction of Two Non-Decimal : " + str2);

				System.out.println("Enter the Two values Decimal Values for Subtraction :");
				double str3 = scCalculator.subtraction(scanner.nextDouble(), scanner.nextDouble());
				System.out.println("Subtraction of Two Decimal : " + str3);

				System.out.println("Enter the Two values Non-Decimal Values for Division :");
				int str4 = scCalculator.division(scanner.nextInt(), scanner.nextInt());
				System.out.println("Division of Two Non-Decimal : " + str4);

				System.out.println("Enter the Two values Decimal Values for Division :");
				double str5 = scCalculator.division(scanner.nextDouble(), scanner.nextDouble());
				System.out.println("Division of Two Decimal : " + str5);

				System.out.println("Enter the Two values Non-Decimal Values for Multiplication :");
				int str6 = scCalculator.multipication(scanner.nextInt(), scanner.nextInt());
				System.out.println("Multiplication of Two Non-Decimal : " + str6);

				System.out.println("Enter the Two values Decimal Values for Multiplication :");
				double str7 = scCalculator.multipication(scanner.nextDouble(), scanner.nextDouble());
				System.out.println("Additon of Two Decimal : " + str7);
				
				System.out.println("Enter the Number Which should be get Squared : ");
				int str8 = scCalculator.square(scanner.nextInt());
				System.out.println("The Square  is "+str8);
				
				System.out.println("Enter the Number to get Square Root : ");
				double str9 = scCalculator.squareRoot(scanner.nextDouble());
				System.out.println("The Square Root  is "+str9);
				
				System.out.println("Enter the two numbers to find percentage : ");
				double str10 = scCalculator.percentage(scanner.nextDouble(), scanner.nextInt());
				System.out.println("The percentage of  is "+str10);
				
				System.out.println("Enter the number to get Average : ");
				int str11 = scCalculator.average(scanner.nextInt(), scanner.nextInt());
				System.out.println("The Average is "+str11);
				System.out.println("__________________________________________________________");
				
				
			}
		}

	}

}
