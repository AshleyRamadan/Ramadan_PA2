package p2;
import java.util.Scanner;
public class p2 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// read weight + height
		System.out.println("Do you want your BMI in pounds or kilograms?");
		
		String option = scan.nextLine();
		
		System.out.println("Please enter your weight and height (in inches or centimeters).");
		
		double weight = scan.nextDouble();
		double height = scan.nextDouble();
		double bmi = 0;
		
		// calculate BMI
		if ((option.compareTo("pounds")) == 0)
		{
			bmi = (703 * weight) / (Math.pow(height, 2));
		}
		else
		{
			bmi = (weight) / (Math.pow(height, 2));
		}
		
		// BMI categories
		if (bmi < 18.5)
			System.out.println("Underweight: " + bmi);
		else if ((bmi >= 18.5) && (bmi <= 24.9))
			System.out.println("Normal weight: " + bmi);
		else if ((bmi >= 25) && (bmi <= 29.9))
			System.out.println("Overweight: " + bmi);
		else
			System.out.println("Obese: " + bmi);
	}
}
