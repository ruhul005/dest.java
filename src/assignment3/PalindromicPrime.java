package assignment3;

public class PalindromicPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1,number=2;
		String result="";
		while(count<=100)
		{
			if(Prime(number)&&Palindromic(number))
			{
				if(count%10==0)
				{
					result+=" "+number+"\n";
				}
			else{
				result+= " "+number;
			}
			count++;
			}
			number++;
		}
		
		System.out.print(result);
	}

			

				public static boolean Prime(int num)

				{
					int count=0;
							for(int divisor=2;divisor<=num/2;divisor++)
							{
								if(num%divisor==0)
								{
									return false;
								}
							}
					return true;
				}
				public static boolean Palindromic(int num)
				{
					int result=0;
					int number=num;
					while(num!=0)
					{
						int lastDigit=num%10;
						num/=10;
					}
					if(number==result)
					{
						return true;
						
					}
					return false;
				}
}

