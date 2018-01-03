package assignment;

class AgeException extends Exception 
{

	  private int p;
	  AgeException(int x) 
     
 {
     p = x;
 }
public String toString()
 {
     return "MyExceptionAge[" + p + "]";
 }
}
class Example_02
{
  static void age(int y) throws AgeException 
  {
     System.out.println("Romzan age(" + y + ")");
     if(y >=30)

   throw new AgeException(y);
   System.out.println("Now, this  Romzan age ");
  }
public static void main(String args[]) 
{
try 
{
	age(25);
	age(30);
} 
catch (AgeException result) 
{
  System.out.println("It's work " + result);
}
}
}
