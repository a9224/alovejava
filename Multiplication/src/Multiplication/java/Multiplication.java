package Multiplication.java;
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y,z;
		int product;
		System.out.print("Enter 1st integer: ");
		x = input.nextInt();
		System.out.print("Enter 2nd integer: ");
		y = input.nextInt();
		System.out.print("Enter 3rd integer: ");
		z = input.nextInt();
		
		product = x*y*z;
		System.out.printf("The result is %d",product);
	}
}
