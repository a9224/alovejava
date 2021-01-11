package GradeLetter;
import java.util.Scanner;
public class GradingScale {
	public static void main(String[] args) {
		ClassJava java = new ClassJava();
		ClassMath math = new ClassMath();
		Scanner input = new Scanner(System.in);
		int gradeJava, gradeMath;
		System.out.println("Enter your gardes of Fall 2020/2021\n"
				+ "___________________________________\n");
		System.out.print("Enter the grade of Java Class: ");
		gradeJava = input.nextInt();
		java.setGrade(gradeJava);		
		// now check the grading scale
		if (java.getGrade()>=90 && java.getGrade()<=100)
			System.out.println("Your grade letter is A\n");
		else if (java.getGrade()>=80 && java.getGrade()<=89)
			System.out.println("Your grade letter is B\n");
		else if (java.getGrade()>=70 && java.getGrade()<=79)
			System.out.println("Your grade letter is C\n");
		else if (java.getGrade()>=60 && java.getGrade()<=69)
			System.out.println("Your grade letter is D\n");
		else if (java.getGrade()>=0 && java.getGrade()<=59)
			System.out.println("Your grade letter is F\n");
		else
			System.out.println("Invalid Value");
		// For Math
		System.out.print("Enter the grade of Math Class: ");
		gradeMath = input.nextInt();
		math.setGrade(gradeMath);
		// just change java to math
		if (math.getGrade()>=90 && math.getGrade()<=100)
			System.out.println("Your grade letter is A\n");
		else if (math.getGrade()>=80 && math.getGrade()<=89)
			System.out.println("Your grade letter is B\n");
		else if (math.getGrade()>=70 && math.getGrade()<=79)
			System.out.println("Your grade letter is C\n");
		else if (math.getGrade()>=60 && math.getGrade()<=69)
			System.out.println("Your grade letter is D\n");
		else if (math.getGrade()>=0 && math.getGrade()<=59)
			System.out.println("Your grade letter is F\n");
		else
			System.out.println("Invalid Value");
		
		
	}
}