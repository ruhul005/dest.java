/**(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree 
 * in a double value from the console, 
 * then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
         fahrenheit = (9 / 5) * celsius + 32
Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8. Here is a sample run:*/

package dest.java;

import java.util.Scanner;

public class A1Q1CelciusToFarenhite {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Celcius:");
		double celcius = input.nextDouble();
		
		double farenhite=(9.0 / 5.0) * celcius + 32;
		System.out.println(+celcius+" celcius is "+farenhite+" farenhite");
		
		input.close();
	}

}
