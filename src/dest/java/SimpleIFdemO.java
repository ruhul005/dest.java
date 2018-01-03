package dest.java;
import java.util.Scanner;
public class SimpleIFdemO {

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int number = input.nextInt();
		
		if(number%5==0)
			System.out.println("HiFive");
		if(number%2==0)
			System.out.println("HiEven");
		
	}
}
