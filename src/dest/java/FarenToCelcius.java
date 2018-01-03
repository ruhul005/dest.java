package dest.java;
import java.util.Scanner;

public class FarenToCelcius {

	public static void main(String[]args){
		//Scanner input = new Scanner (System.in);
		Scanner input = new Scanner(System.in);
		double faren,celcs;
		System.out.print("Enter Farenhite");
		faren=input.nextDouble();
		
		celcs=(5.0/9)*(faren-32);
		
		System.out.print("Converting that into celcius"+celcs);
		
	}
}
