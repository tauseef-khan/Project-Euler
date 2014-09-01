/**************************************************
* Problem 1: Multiples of 3 and 5                                                   
*
* Link to Problem: http://projecteuler.net/problem=1
**************************************************/

import java.util.Date;

class PEP1{
	
	public static void main(String[] args){
		
		long time1,time2;
		
		time1 = new Date().getTime();
		System.out.println("This is the sum of the multiples of 3 and 5 below 1000 : " + sumOfMultiples());
		time2 = new Date().getTime();
		
		System.out.println("Time taken: " + (time2 - time1) + "ms");
	}
	
	/**************************************************
  	* sumOfMultiples()                                                         
  	*
  	* Input(s): None
	* Output(s): The sum of all the multiples of 3 or 5 below 1000
	*
	* Description: Loops from 1 to 1000 to check if count is
	*			   multiple of 3 and 5. If it is, then add to sum.
	*			   Then increment count by 1.
  	**************************************************/
	
	private static int sumOfMultiples(){
		
		int count = 1;
		int sum = 0;
		
		while(count < 1000){
			
			if(count % 5 == 0 || count % 3 == 0){
				
				sum += count;
			}
			
			count++;
		}
		
		return sum;
	}
}