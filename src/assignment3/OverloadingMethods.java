package assignment3;
import java.util.Scanner;

public class OverloadingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner (System.in);
		System.out.println("1. max of two int number\n2.max of two double number\n3.max of three double number");
		System.out.println("Enter your Choice:");
		int s;
		s=input.nextInt();
		switch( s)
		{
			case 1: int number1,number2;
					System.out.print("Enter two value:");
					number1=input.nextInt();
					number2=input.nextInt();
			
			
					int max=maxOfTwoIntNumbers(number1,number2);
					System.out.println("Max of 2 is "+max);
			case 2: double n1,n2;
					System.out.print("Enter two value:");
					n1=input.nextDouble();
					n2=input.nextDouble();
	
	
					double dmax=maxOfTwoDoubleNumbers(n1,n2);
					System.out.println("Max of 2 is "+dmax);
			case 3:	double numbers,ddmax=0;
					for(int i=0;i!=3;i++)
			{
				
						
				 
				
						System.out.println("Enter number:");
						numbers=input.nextDouble();
				
						ddmax=findMax(numbers,ddmax);
				
			}
			
			System.out.println("max is "+ddmax);
			
		}
		
		
		
		

	}
	public static int  maxOfTwoIntNumbers(int num1, int num2)
	{
		
		int result;
		if (num1>num2)
			result=num1;
		else
			result=num2;
		
		return result;
		
		
	}
	public static double findMax(double number, double max)
	{	
		
		
		if(number>max)
		{	
			max=number;
			
		}
			
		return max;
	}
	public static double  maxOfTwoDoubleNumbers(double num1, double num2)
	{
		
		double result;
		if (num1>num2)
			result=num1;
		else
			result=num2;
		
		return result;

}
}


