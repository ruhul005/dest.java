//Write a program that prompts the user to enter three points
//(x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.


package dest.java;
import java.util.Scanner;
public class A1Q3TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1,x2,y1,y2,x3,y3;
		System.out.println("Enter value for (x1,y1)");
		 x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.println("Enter value for (x2,y2)");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		System.out.println("Enter value for (x3,y3)");
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		double side1= Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2), 0.5);
		double side2= Math.pow(Math.pow(x3-x1,2)+Math.pow(y3-y1, 2), 0.5);
		double side3= Math.pow(Math.pow(x3-x2,2)+Math.pow(y3-y2, 2), 0.5);
		
		double s=(side1+side2+side3)/2.0;
		double  area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		System.out.printf("area of the triangle is %.2f ", area);
		
		
		input.close();
	}

}
