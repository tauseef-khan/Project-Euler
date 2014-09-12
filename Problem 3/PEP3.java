/**************************************************
* Problem 3: Largest prime factor                                             
*
* Link to Problem: https://projecteuler.net/problem=3
**************************************************/

import java.util.Scanner;
import java.util.Date;

class PEP3{
	
	public static void main(String[] args){
		
		long time1,time2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find out it's largest prime factor:");
		String userInput = input.nextLine();
		double number = Double.parseDouble(userInput);
		
		System.out.println("");
		time1 = new Date().getTime();
		System.out.println("The largest prime factor of " + userInput + " is: " + findLargestPrimeFactor(number));
		time2 = new Date().getTime();
		
		System.out.println("Time taken: " + (time2 - time1) + "ms");
	}
	
	/**************************************************
  	* findLargestPrimeFactor()                                                         
  	*
  	* Input(s): The user input converted into a double
	* Output(s): The largest prime factor of the number passed in
	*
	* Description: Uses integer factorization. 
	*				- Variable A is the number you are tring to factor
	*				- Variable B is current divisor 
	*				- Variable C is largest divisor store
	*			   I used the method posted bi the user xist is the following
	*			   post for this method: http://math.stackexchange.com/questions/389675/largest-prime-factor-of-600851475143
  	**************************************************/
	
	private static int findLargestPrimeFactor(double A){
		
		double B = 2.0;
		double C = 0.0;
		
		while(B != A){
			
			// if no remainder, B is largest divisor, A's value is the answer to A/B, reset the current divisor to 2, allowing to repeat process on new A
			if(A%B == 0){
				
				C = B;
				A = A / B;
				B = 2;
			}
			else{
				B++;
			}
		}
		
		
		return (int) A;
	}
}