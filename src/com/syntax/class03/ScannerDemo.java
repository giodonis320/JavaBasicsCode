package com.syntax.class03;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Please Enter your age");
		int age=scanner.nextInt();//usesr enters the number and hits the enter key
		
		scanner.nextLine();//consumes the enter that user press after the number 
		
		String newLine=scanner.nextLine();
		
		System.out.println("please enter your name");
		String name=scanner.nextLine();
		
		System.out.println(age+newLine+name);
		
		
		

	}

}
