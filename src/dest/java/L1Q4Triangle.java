package dest.java;
import java.util.Scanner;
public class L1Q4Triangle {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter first edge of triangle:");
		double firstEdge= input.nextDouble();
		System.out.println("Enter first edge of triangle:");
		double secondEdge= input.nextDouble();
		System.out.println("Enter first edge of triangle:");
		double thirdEdge= input.nextDouble();
		
		if(firstEdge+secondEdge>thirdEdge||thirdEdge+secondEdge>firstEdge||firstEdge+thirdEdge>secondEdge)
		{
			double perimeter=firstEdge+secondEdge+thirdEdge;
			System.out.println("Permeter is"+perimeter);
			
					
		}
		else
			System.out.println("Invalid input");
	}

}
