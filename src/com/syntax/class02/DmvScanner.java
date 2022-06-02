package com.syntax.class02;

import java.util.Scanner;

public class DmvScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, 
		 * otherwise you will offer them to get a learners permit
		 * 
		 */
		
		Scanner dmv= new Scanner(System.in);
		
		System.out.println("Please Enter your age");
		int age=dmv.nextInt(); //usesr enters the number and hits the enter key
		
		if (age>18) { System.out.println(" I will issue you a driverse license");
		
		}else {
				System.out.println(" I will issue you lerners permit ");
		}
	
	}

}
