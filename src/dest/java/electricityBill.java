package assignment;
import java.util.Scanner;

public class electricityBill {
	public static void main(String[] args){
	Scanner input= new Scanner (System.in);
	
	double bill=0;
	System.out.println("Enter Used Unit:");
	int usedUnit=input.nextInt();
	
	
	switch(usedUnit/50)
	{
		case 0:
		case 1:
			bill=(50*0.50);
			bill=bill+bill*.20;
			System.out.println("Your bill is: "+bill);break;
		case 2:
		case 3:
				bill=50*0.50+ (.75*usedUnit-50);
				bill=bill*.20;
				System.out.println("Your bill is: "+bill);break;
		case 4:
		case 5:
			bill=(50*0.50)+(.75*100) +(1.20*(usedUnit-150));
			bill=bill+bill*.20;
			System.out.println("Your bill is:"+bill);break;
			
			
		
	}
		
	
}
}
