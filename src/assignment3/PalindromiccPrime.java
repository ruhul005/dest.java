package assignment3;

public class PalindromiccPrime {

	public static void main(String[] args) {
		final int NUMBER_OF_PALINDROMIC_PRIMES = 100; 
		final int NUMBERS_PER_LINE = 10;

		int count = 0; 
		int n = 2;	

		
		while (count < NUMBER_OF_PALINDROMIC_PRIMES) {
			if (isPalindromicPrime(n)) {
				count++; 
				System.out.print(count % NUMBERS_PER_LINE == 0 ? n + "\n" : n + " ");
			}
			n++;
		}
	}

	public static boolean isPalindromicPrime(int number) {
		for (int divisor = 2; divisor <= number/2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return number == reverse(number) ? true : false;
	}
	public static int reverse(int number) {
		String reverse = ""; 	
		String n = number + ""; 
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse); 
}

}		



