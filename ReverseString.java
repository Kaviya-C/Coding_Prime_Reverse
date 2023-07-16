package com.kaviya.workout.coding;
import java.util.Scanner;
public class ReverseString {
	public static void main(String...args) {
		
		
		try(Scanner input=new Scanner(System.in)){
		System.out.println("enter the string: ");
		
		String word=input.nextLine();String reverse="";
		StringBuffer sb=new StringBuffer(word);
		//int length=word.length()-1;
		
		reverse=sb.reverse().toString();
		System.out.println(reverse);
		
		if(word.equals(reverse)) {
			System.out.println("palindrome "+ word);
		}
		else
			System.out.println("not a palindrome "+word);
		}
	}

}
