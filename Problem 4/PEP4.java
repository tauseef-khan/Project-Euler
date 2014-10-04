/**************************************************
* Problem 4: Largest palindrome product                                        
*
* Link to Problem: https://projecteuler.net/problem=4
**************************************************/

import java.lang.StringBuffer;
import java.util.Date;

class PEP4{
	
	static int num1 = 0;
	static int num2 = 0;
	
	public static void main(String[] args){
		
		long time1,time2;
		
		time1 = new Date().getTime();
		System.out.println("Largest palindrome made from the product of two 3-digit numbers: " + palindromeProduct());
		time2 = new Date().getTime();
		
		System.out.println("It was made from " + num1 + " and " + num2);
		System.out.println("Time taken: " + (time2 - time1) + "ms");

	}
	
	/**************************************************
  	* findLargestPrimeFactor()                                                         
  	*
  	* Input(s): 
	* Output(s): The largest 3-digit palindrome product 
	*
	* Description: Uses a for lopp with another for loop. The inner loop
	*			   checks all for all the results of the outer loop from 1 to 1000
	*			   for a match. The calculation is made and reversed and bith the values are
	*			   checked for equality and  and if they match then are further checked if its
	*			   larger than the current value in 'largest'.
  	**************************************************/
	
	private static int palindromeProduct(){
		
		int largest = 0;
		
		for(int i=100; i<1000; i++){
			
			for(int j=100; j<1000; j++){
				
				int A = i * j;
				
				String normal = Integer.toString(A);
				String backwards = new StringBuffer(normal).reverse().toString();
				
				if(normal.equals(backwards) && A > largest){
					
					num1 = i;
					num2 = j;
					largest = A;
				}
			}
		}
		
		return largest;
	}
}