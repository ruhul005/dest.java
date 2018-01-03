package assignment;

import java.util.Scanner;

public class SearchVowel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String str= input.nextLine();
		
		int a=0,e=0,ee=0,o=0,u=0;
		for(int i=0;i <str.length();i++)
		{
			if(str.charAt(i) == 'a')
			{
				a++;
			}
			else if(str.charAt(i) == 'e')
			{
				e++;
			}
			else if(str.charAt(i) == 'i')
			{
				ee++;
			}
			else if(str.charAt(i) == 'o')
			{
				o++;
			}
			else if(str.charAt(i) == 'u')
			{
				u++;
			}
		}
		System.out.println("a="+a+"\ne="+e+"\ni="+ee+"\no="+o+"\nu="+u);
		

	}

}
