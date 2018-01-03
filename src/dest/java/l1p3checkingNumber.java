package dest.java;
import java.util.Scanner;
public class l1p3checkingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("Enter The Number:");
		
		int n=input.nextInt();
		
		if(n%5==0&&n%6==0)
		{
			System.out.println(+n+"is dividible by both 5 & 6");
		}
		else if(n%5==0)
			System.out.println(+n+"is dividible by 5");
		else if(n%6==0)
			System.out.println(+n+"is dividible by 6");
	}

}
