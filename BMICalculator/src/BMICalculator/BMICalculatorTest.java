package BMICalculator;
import java.util.Scanner;
public class BMICalculatorTest {
	public static void main(String[] args) {
		BMICalculator b = new BMICalculator();
		Scanner input = new Scanner(System.in);
		double w,h;
		double bmi;
		System.out.print("Enter your weight(kg): ");
		w = input.nextDouble();
		b.setWeight(w);
		
		System.out.print("Enter your height(cm): ");
		h = input.nextDouble();
		b.setHeight(h);
		
		bmi = b.getWeight()/(b.getHeight()*b.getHeight());
		System.out.printf("Your BMI Value is: %.2f\n",bmi);
		if(bmi<18.5)
			System.out.printf("%.2f is underweight\n",bmi);
		else if(bmi>=18.5 && bmi<=24.9)
			System.out.printf("%.2f is Normal\n",bmi);
		else if(bmi>=25 && bmi<=29.9)
			System.out.printf("%.2f is overweight\n",bmi);
		else if(bmi>=30)
			System.out.printf("%.2f is obese\n",bmi);
	}
}
