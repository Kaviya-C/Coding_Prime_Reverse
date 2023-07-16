package com.kaviya.workout.coding;
import java.util.Scanner;
public class Prime1To100 {
	public static void main(String...a) {

		try(Scanner input=new Scanner(System.in)){
			System.out.println("enter the start value ");
			int start=input.nextInt();

			System.out.println("enter the end value ");
			int end=input.nextInt();

			int count=0;
			System.out.println("value range from "+start +" to"+end);
			for(int index=start;index<=end;index++) {
				if(checkPrime(index)) {
					count++;
				System.out.print("Prime: "+index+"\n");
				}
			}
			System.out.println("Prime numbers count betwn "+start+ " to "+end +" is"+ count);
		}

	}
	public static boolean checkPrime(int no) {
		if(no<=0) {
			return false;
		}
		else {
			for(int index=2;index<=Math.sqrt(no);index++) {
				if(no%index==0) {
					return false;}
			}
		}
		return true;
	}

}
