package com.xworkz.Polymorphism.Polymorphismexamples;

public class Scientificcalculator extends Calculator { 
	package com.xworkz.coreJava.Oops.Polymerphism.Calculator;

	public class ScientificCalculator extends Calculator {

		public String calculatorBrandName;
		public String calculatorType;
		

		public ScientificCalculator(String calculatorBrandName, String calculatorType) {
			super("ATL DIGIMON", "Basic");
			this.calculatorBrandName = calculatorBrandName;
			this.calculatorType = calculatorType;

		}

		// Overriding the method from parent class
		@Override
		public int addition(int num1, int num2) {
			System.out.println("--------Overriding Method for Addition------");
			return num1 + num2;
		}

		// Overriding the method from parent class
		@Override
		public int subtraction(int num1, int num2) {
			System.out.println("--------Overriding Method for subtraction------");
			return num1 - num2;
		}

		// Method for Square
		public int square(int value) {
			value = value * value;
			return value;
		}
		
		//Method for SquareRoot
		public double squareRoot(double x) {
			double a = Math.sqrt(x);
			return a;
		}
		
		//Method for Percentage
		public double percentage(double a, int b) {
			return (a/b)*100;
		}

		// Method for Average
		public int average(int a, int b) {
			a = (a + b) / 2;
			return a;
		}

		
	}

		
		
	}

}
