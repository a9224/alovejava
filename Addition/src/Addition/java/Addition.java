package Addition.java;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		num2 = input.nextInt();
		
		sum = num1+num2;
		System.out.printf("Sum is %d", sum);
	}
}
