package dest.java;
import java.util.Scanner;
public class NnumberAvarage {

	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter The Limits of number:");
		
		double x,sum=0,avg;
		int i=0,n;
		n=input.nextInt();
		
		while(i<n)
		{
			System.out.println("Enter your number:");
			x=input.nextDouble();
			sum=sum+x;
			i++;
		}
		
		avg=sum/n;
		
		System.out.println("The average of "+n+" numbers is"+avg);
	}
}
