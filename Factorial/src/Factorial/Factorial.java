package Factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, fact;
		fact = 1;
		System.out.print("Enter the number to calculate factorial: ");
		n = input.nextInt();
		for (int i = 1; i <=n; i++) {
			fact*=i;
		}
		System.out.println("The Factorial number of "+n+" is: "+fact);
	}
}
