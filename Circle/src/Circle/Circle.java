package Circle;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r;
		double diameter=0, circumference=0, area=0;
		double pi = 3.14159;
		
		System.out.print("Enter the raduis of the circle: ");
		r = input.nextDouble();
		diameter = 2*r;
		circumference = 2*pi*r;
		area = pi*r*r;
		System.out.printf("The diameter of the circle = %.3f\n", diameter);
		System.out.printf("The circumference of the circle = %.3f\n", circumference);
		System.out.printf("The area of the circle = %.3f\n", area);

	}
}
