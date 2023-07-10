/**
* Calculates BMI, where: 
* weight in KG / height in metters * height in metters
*/

import javax.swing.JOptionPane;

public class BMICalculator {
	public static void main(String[] args){
		
		String weight = JOptionPane.showInputDialog("What is your weight in Kg? ");
		String height = JOptionPane.showInputDialog("What is your height in metters? ");

		double weightInKg = Double.parseDouble(weight);
		double heightInMetters = Double.parseDouble(height);
		double bmi = weightInKg / (heightInMetters * heightInMetters);
		
		String message = (bmi >= 18.5 && bmi <= 24.9) ? "Ideal weight." : "Out of ideal weight.";
		
		JOptionPane.showMessageDialog(null, "BMI: " + bmi + " - " + message);
		
	}
}