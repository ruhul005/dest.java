package assignmnent2;


import java.util.Scanner;

public class SmallestFactor {

	public static void main(String[] args) {
		  System.out.print("Enter an intergers:");
		  Scanner input = new Scanner(System.in);
		  int n = input.nextInt();
		  int i = 2;
		  String s = "";
		 
		  while (n != 1) {
		   if (n % i == 0) {
		    // add i to s and start again for the next factor
		    s = s + ", " + i;
		    n = n / i;
		    i = 2;
		   } else {
		    i++;
		   }
		 
		  }
		 
		  System.out.print("The factors are:" + s.substring(2) + ".");
		 }
		 
		}

	

