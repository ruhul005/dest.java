package dest.java;
import java.util.Scanner;

public class usingMethod {
	
	public static int sum(int i1, int i2)
	{
		int sum=0;
		for(int i=0;i<=i2;i++)
			sum+=i;
		return sum;
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter start:");
		
		int x=input.nextInt();
		System.out.println("Enter End:");
		int y=input.nextInt();
		System.out.println("Sum from" +x+" to "+y+" is " + sum(x, y));
		
		
	}
}
