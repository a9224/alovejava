package MathematicsGrade;

import java.util.Scanner;

public class MathematicsGrade {
	private String name;
	public MathematicsGrade(String string) {
		name = string;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayWelcomeMsg() {
		System.out.printf("Welcome to %s Class\n\n",getName());
	}
	public void CalculateAVG(){
		Scanner input = new Scanner(System.in);
		int counter =0;
		int grade;
		int total =0;
		int avg;
		System.out.print("Enter grade: ");
		grade = input.nextInt();
		while (grade!=0) {
			System.out.print("Enter grade: ");
			grade = input.nextInt();
			total = total + grade;
			counter = counter +1;
		}
		System.out.printf("\nTotal of all class grade is %d\n", total);
		avg = total/10;
		System.out.printf("Class average is %d\n", avg);
	}
	
}
