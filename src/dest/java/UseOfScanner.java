package dest.java;
import java.util.Scanner;

public class UseOfScanner {

	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		int seconds,minutes;
		System.out.println("Input Seconds:");
		seconds =input.nextInt();
		
		minutes=seconds/60;
		int remseconds=seconds%60;
		
		System.out.println(+seconds+" seconds is = "+minutes+"minutes and "+remseconds+" seconds");
	}
}
