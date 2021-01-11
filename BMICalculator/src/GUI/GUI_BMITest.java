package GUI;
import java.util.Scanner;

import javax.swing.JOptionPane;

import BMICalculator.BMICalculator;

public class GUI_BMITest {
	public static void main(String[] args) {
		BMICalculator b = new BMICalculator();
		Scanner input = new Scanner(System.in);
		double w,h;
		double bmi;
		String wString = JOptionPane.showInputDialog("Enter your weight(kg):");
		w = Double.parseDouble(wString);
		b.setWeight(w);
		String hString = JOptionPane.showInputDialog("Enter your height(cm):");
		h = Double.parseDouble(hString);
		b.setHeight(h);
		
		bmi = b.getWeight()/(b.getHeight()*b.getHeight());
		JOptionPane.showMessageDialog(null, String.format("Your BMI Value is: "
				+ "%.2f", bmi));
		if(bmi<18.5)
			JOptionPane.showMessageDialog(null, String.format("%.2f is "
					+ "underweight", bmi));
		else if(bmi>=18.5 && bmi<=24.9)
			JOptionPane.showMessageDialog(null, String.format("%.2f is "
					+ "Normal", bmi));
		else if(bmi>=25 && bmi<=29.9)
			JOptionPane.showMessageDialog(null, String.format("%.2f is "
					+ "overweight", bmi));
		else if(bmi>=30)
			JOptionPane.showMessageDialog(null, String.format("%.2f is "
					+ "obese", bmi));
		
	}
}
