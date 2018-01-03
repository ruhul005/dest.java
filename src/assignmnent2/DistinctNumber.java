package assignmnent2;
import java.util.Scanner;

public class DistinctNumber {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		  int[] n = new int[10];
		  int number, i = 0, j, k = 0;
		  System.out.print("Enter ten numbers:");
		 
		  while (k < 10) {
		   number = input.nextInt();
		   k++;
		 
		   for (j = 0; j <= i; j++) {
		    if (number == n[j]) {
		     break;
		    }
		   }
		 
		   if (j - i == 1) {
		   n[i] = number;
		   i++;
		   }
		 
		  }
		 
		  System.out.print("The distinct numbers are:");
		 
		  for (int j2 = 0; j2 < i; j2++) {
		  System.out.print(n[j2] + " ");
		  }
		 
		 }
		}
