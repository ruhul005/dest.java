package dest.java;
import java.util.Scanner;

public class AddTwoValue {

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Eenter value for x:");
		double x,y,sum;
		
		 x = input.nextDouble();
		System.out.println("Enter Value for y;");
		 y = input.nextDouble();
		 sum=x+y;
		
		System.out.println("The value of x is= "+x+" and y is= "+y);
		System.out.println("The sum of x and y is="+sum);
		
	}
}
