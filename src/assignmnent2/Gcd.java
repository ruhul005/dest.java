package assignmnent2;

import java.util.Scanner;

public class Gcd {
	 public static void main(String[] args) {
		  System.out.println("Enter two intergers:");
		  Scanner input = new Scanner(System.in);
		  int n1 = input.nextInt();
		  int n2 = input.nextInt();
		 
		  // find the minimum
		  if (n2 < n1) {
		   int temp = n2;
		   n2 = n1;
		   n1 = temp;
		  }
		 
		  for (int d = n1; true; d--) {
		 
		   if (n1 % d == 0 && n2 % d == 0) {
		    System.out.println("The GCD is:" + d);
		    break;
		   }
		 
		  }
	 }
		 

}
