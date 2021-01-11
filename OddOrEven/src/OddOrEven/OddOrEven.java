package OddOrEven;
import java.util.Scanner;
public class OddOrEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Enter the number you want to check: ");
		n = input.nextInt();
		if(n % 2 == 0)
			System.out.printf("The given number %d is even",n);
		else 
			System.out.printf("The given number %d is odd",n);
	}
}
