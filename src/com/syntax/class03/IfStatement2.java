package com.syntax.class03;

public class IfStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * declare a variable rate. 
		 * if rate is more than 5 ---> i am not buying a house
	
		 *
		*/
	
	double mortgageRate=4.5;
	if (mortgageRate>5) {
		System.out.println("I am not buying a house");
	}
	
	/*
	declare 2 varibales and check if num1 dis bigger than num2
	*/
	
	int num1=99;
	int num2=10;
	
	if (num1>num2) {
		
		System.out.println(num1 + " is bigger than " + num2);
		
	}
	
  /*
  * declare temperature, 
  * is temp is higher than 75--> i will go for a walk 
  */
	
	int temp=78;
	if (temp>75) {//if code goes inside if {} 
					//when condition is true 
	}
		
		System.out.println("I will go for a walk");
	} else { //otherwise.code comes to else {} when condition is false 
		
		System.out.println("I am going to study java");
		
	}
	
	System.out.println("---------------");
	
	char gender= 'f';
	
	if (gender== 'f') {
		System.out.println("You like shopping");
		
	}else {
		System.out.println("you like watching sports");
		
	}
	
	{
		
	}
	
	}

}
