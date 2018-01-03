package dest.java;
import java.util.Scanner;
public class Q1A2quardaticEquation {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		double a,b,c,r1,r2;
		System.out.println("Enter value for a  b  c :");
		
		a= input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		
		if(Math.pow(b, 2)-4*a*c>=0)
		{
			if(Math.pow(b, 2)-4*a*c>0)
			{
				r1=  ((-b+ Math.pow(Math.pow(b, 2)-4*a*c, 0.5))/2.0*a);
				r2=  ((-b- Math.pow(Math.pow(b, 2)-4*a*c, 0.5))/2.0*a);
				System.out.printf("r1=%.2f",r1);
				System.out.printf("r2=%.2f",r2);
			}
			else
			{
				r1= (int) ((-b+ Math.pow(Math.pow(b, 2)-4*a*c, 0.5))/2.0*a);
				System.out.printf("r=%.2f",r1);
			}
		}
		else
			System.out.printf("Not Root Available");
		
		input.close();
	}

}
