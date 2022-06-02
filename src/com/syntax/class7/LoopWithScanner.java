package com.syntax.class7;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * we are going to ask you if you got a job
		 * we will continously ask if you get a jon until you say yes! 
		 * one you say yes ---> Congrats!
		 */
	Scanner scan=new Scanner(System.in);
	String job;
	
	do {
		System.out.println("Did you get a job");
		job=scan.nextLine();
	}while(!job.equalsIgnoreCase("yes"));
	System.out.println("Congradulations");
	System.out.println("--------------");
	
	Scanner input=new Scanner (System.in);
	String offer;
	
	System.out.println("Did you get a job");
	offer=input.nextLine();
	
	while (!offer.equalsIgnoreCase("yes")) {
		System.out.println("did you get a job");
		offer=input.nextLine();
		
	}
	System.out.println("congradulations");
}
}


