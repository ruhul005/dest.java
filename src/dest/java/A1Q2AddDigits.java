/**
 * (Sum the digits in an integer) Write a program that reads an integer 
 * between 0 and 1000 and adds all the digits in the integer. For example, 
 * if an integer is 932, the sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove 
the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
Here is a sample run:
 */

package dest.java;
import java.util.Scanner;
public class A1Q2AddDigits {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter an integer:");
		
		int n= input.nextInt();
		
		int x=0,sum=0;
		x=n%10;
		n=n/10;
		sum=sum+x;
		
		x=n%10;
		n=n/10;
		sum=sum+x;
		
		x=n%10;
		n=n/10;
		sum=sum+x;
		
		x=n%10;
		n=n/10;
		sum=sum+x;
		
		System.out.println("after adding "+sum);
		

	}

}
