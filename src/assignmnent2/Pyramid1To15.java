package assignmnent2;


import java.util.Scanner;

public class Pyramid1To15 {

	public static void main(String[] args) {
		  System.out.print("Enter the number of lines:");
		  Scanner input = new Scanner(System.in);
		   
		  int n = input.nextInt();
		   
		  for (int i = 1; i <= n; i++) {
		   for (int j = 1; j <= (n - i); j++) {
		    System.out.print("  ");
		   }
		    
		   for (int j = i; j >= 1; j--) {
		    System.out.print(j + " ");
		   }
		    
		   for (int j = 2; j <= i; j++) {
		    System.out.print(j + " ");
		   }
		   System.out.println();
		 
		  }
		 
		 }

	}


