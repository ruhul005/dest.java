package assignment;
import java.util.Scanner;


public class electricityBillMeasurement {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		double bill=0;
		System.out.println("Enter Used Unit:");
		int usedUnit=input.nextInt();
		
		if(usedUnit<=50)
		{
			bill=(50*0.50);
			bill=bill+bill*.20;
			
		}
		else if(usedUnit>50&&usedUnit<=150)
		{
			bill=(50*0.50)+ (0.75*(usedUnit-50));
			bill=bill+bill*.20;
			
		}
		else if(usedUnit>150)
		{
			bill=(50*0.50)+(.75*100) +(1.20*(usedUnit-150));
			bill=bill+bill*.20;
			
		}
		System.out.println("Your bill is: "+bill);
	}

}
