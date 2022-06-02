package com.syntax.class02;

import java.awt.SystemColor;

public class NonPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//part A 
		String name="Gio";
		
		String lastName="Donis";
		
		String student= "student";
		
		String state= "California";
		
		String phoneNumber= "7035555555";
		
		String newCity= "Miami";
		
		long phone= 123456789;
		
		//xxx-xxx-xxx will not work 
		
		//String phoneNumber="123-123-123-123";
		String address= "123 washingotn str";
		
		int age =30;
		String city= "Los Angeles";
		
		//shortcut for printing 
		//sysco +ctrl + space --> hit enter 
		
		/*
		 * we can use + --> works as concatenation operator 
		 * 
		 */
		
		/*
		 * when we want to attch String to String we can use + 
		 * to attach String to String 
		 */
		//System.out.println(name + lastName);//Gio Donis
		
		//Gio lives in Miami
		//System.out.println(name + " lives in " + city);
		
		//System.out.println(name + " is " + age + " years old ");
		
		System.out.println(" My name is " + name + " and my last name is " + lastName);
		
		System.out.println(" I am a " + student );
		
		System.out.println(" I live in city " + city + " and state " + state);
		
		System.out.println(" And my phone number is " + phone );
		
		//Gio is 30 years old 
		
		//pa
		
		//grade= 'A';
		state= "Florida";
		city= "Miami";
		
		System.out.println("My name is " + name + "and I moved to new city" + city + "and new state" + state+".");
		
		String words="years old";
		System.out.println(name + "is" + age+ "" + words);
		
		/* 
		 * Rules for identifiers 
		 * 1. no space 
		 * 2. no keywords 
		 * 3. cannot start with numbers (numbers can be used after the 
		 * 4. cannot have with special characters ( except _, $)
		 *
		 */
		// string break= "Hello"; error 
		//int 2number=10; error 
		
		int number1=10;
		
		// int num%=20; error 
		
		double $price= 3.99;
		float f_=2.09f;
		
		/*
		 * Naming Conventions:
		 * follow camer casing 
		 * variable names should star twith lowercase and then follow camel casing 
		 * 
		 * 
		 */
		
		String MyCity= "Tysons";
		
		
		
		
	}

}
