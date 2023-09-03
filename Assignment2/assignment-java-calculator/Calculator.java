// Java program for simple calculator
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

// Driver class
public class Calculator {
	// main function
	public static void main(String[] args)
	{
		// Stores two numbers
		double num1, num2;

		// Take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers:");

		// Take the inputs
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/):");

		char op = sc.next().charAt(0);
		double o = 0;

        o = calculate(num1, num2, op);

		System.out.println("The final result:");
		System.out.println();

		// print the final result
		System.out.println(num1 + " " + op + " " + num2
						+ " = " + o);
	}

	// Add function to perform calculation
	public static double calculate(double num1, double num2, char op)
	{
		switch (op) {
		case '+':
			return add(num1, num2);
		case '-':
			return subtract(num1, num2);

		case '*':
			return multiply(num1, num2);

		case '/':
			return divide(num1, num2);
		}
		return 0;
	}

	// Add function to perform addition
	public static double add(double num1, double num2)
	{
		return num1 + num2;
	}

	// Subtract function to perform subtraction
	public static double subtract(double num1, double num2)
	{
		return num1 - num2;
	}

	// Multiply function to perform multiplication
	public static double multiply(double num1, double num2)
	{
		return num1 * num2;
	}

	// Divide function to perform division	
	public static double divide(double num1, double num2)
	{
		return num1 / num2;
	}
}
