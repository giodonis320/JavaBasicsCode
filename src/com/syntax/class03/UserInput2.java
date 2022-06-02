package com.syntax.class03;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Please enter name ");
		String name=scan.next(); //capture string 
		
		System.out.println(" Please enter age ");
		int age=scan.nextInt();//capture int
		System.out.println(age);
		
		System.out.println(" Please enter price ");
		double price=scan.nextDouble();//capture double
		
		System.out.println(" Please enter boolean ");
		boolean boo=scan.nextBoolean();//capture boolean
		
		System.out.println(" Please enter any char ");
		scan.next().charAt(0);//capture 1 character 
		
		
	}

}
