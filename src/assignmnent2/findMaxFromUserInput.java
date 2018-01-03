package assignmnent2;
import java.util.Scanner;

public class findMaxFromUserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numbers,limit,i,max=0;
		System.out.println("Enter limits:");
		limit= input.nextInt();
		
		for(i=0;i!=limit;i++)
		{
			System.out.println("Enter number:");
			numbers=input.nextInt();
			max=findMax(numbers,max);
			
		}
		
		System.out.println("max is "+max);
		
	}
	

	
	
	
	public static int findMax(int number, int max)
	{	
		
		
		if(number>max)
		{	
			max=number;
			
		}
			
		return max;
	}
	
}
