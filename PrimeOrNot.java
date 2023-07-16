package com.kaviya.workout.coding;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String...args) {
		
		try(Scanner input=new Scanner(System.in))
		{
			System.out.println("enter the number: ");
			int number=input.nextInt();
			
			boolean isPrime=checkPrime(number);
			
			if(isPrime) {
				System.out.println("Given number is Prime "+number);
			}
			else
				System.out.println("given number is not prime "+number);
			
		}
		
		
	}

	private static boolean checkPrime(int no) 
	{
		if(no<=0)
			return false;
		else
			for(int start=2;start<=no/2;start++) {
				if(no%start==0)
					return false;
			}
		return true;
	}

}
