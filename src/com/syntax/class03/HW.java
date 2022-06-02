package com.syntax.class03;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		int weight = 112;
		
		if (age>=18) {
			if (weight>110) {
				System.out.println("You are eligible to donate your blood");
			}else {
				System.out.println("We cannot accept such a patient");
			}
		} else {
		System.out.println("We cannot accept such a patient");
		}
		
		/*write a program to find largest number among three numbers you provided by a user (numbers must be distinct/*
		 * 
		 */
		
		int num1=55;
		int num2=44;
		int num3=23;
		
		if (num1 >= num2) {
			if (num1 >= num3) {
				System.out.println(num1 + " is largest number ");
			} else {
				System.out.println(num3 + " is largest numer ");
				
			}
		}else {//otherwise num2>num1
			if (num2>num3) {
				System.out.println(num2 + " is largest number ");
			}else { //num3>num2
				System.out.println(num3 + " is the largest numer ");
			}
		}
	}

}
