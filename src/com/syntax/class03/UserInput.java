package com.syntax.class03;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a scanner 
	//String str="hello";
	Scanner input=new Scanner (System.in);
	//send instruction to the console 
	
	System.out.println("Please enter your name");
	
	//we need to grab the values from console 
	String name=input.next();//after you type the value --> hit enter 

	System.out.println(name);
	
	//lets send instruction
	System.out.println(name + "please enter your age");
	
	//need to capture and store age 
	int age=input.nextInt();
	
	System.out.println(name + " is " + age + "years old");
	}

}
