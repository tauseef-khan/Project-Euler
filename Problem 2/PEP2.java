/**************************************************
* Problem 2: Even Fibonacci numbers                                                
*
* Link to Problem: https://projecteuler.net/problem=2
**************************************************/

import java.util.ArrayList;
import java.util.Date;

class PEP2{
	
	public static void main(String[] args){
		
		long time1,time2;
		
		time1 = new Date().getTime();
		System.out.println("This is the sum of the even fibonacci numbers below 4 million : " + sumOfEvenFibonacci());
		time2 = new Date().getTime();
		
		System.out.println("Time taken: " + (time2 - time1) + "ms");
	}
	
	/**************************************************
  	* sumOfEvenFibonacci()                                                         
  	*
  	* Input(s): None
	* Output(s): The sum of all the even fibonacci numbers below 4 million
	*
	* Description: Adds the values to the last and second last elements in the
	*			   arraylist together to form the next number in the sequence.
	*			   Then adds thats value to the end of the Arraylist 
	*			   'fibonacciNumbers'. Finally, checks if the number is even or odd.
	*			   The cycle repeats itself until 4 million is exceeded.
  	**************************************************/
	
	private static int sumOfEvenFibonacci(){
		
		ArrayList<Integer> fibonacciNumbers = new ArrayList<Integer>();
		
		fibonacciNumbers.add(1);
		fibonacciNumbers.add(2);
		
		int count = 0;
		int sum = fibonacciNumbers.get(1);
		
		while(count < 4000000){
			
			int listSize = fibonacciNumbers.size();
			
			// finds next number in sequence and adds it to the arraylist (adds to the arraylist if it is even or odd number) 
			count = fibonacciNumbers.get(listSize - 1) + fibonacciNumbers.get(listSize - 2);
			fibonacciNumbers.add(count);
			
			// checks if the number is even, if so adds the value to sum
			if(count % 2 == 0){
				sum = sum + count;
			}
			
			count = count;
		}
		
		return sum;
	}
}