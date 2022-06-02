package com.syntax.class9;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] disney= {"Shrek", "Elsa","Goofy","Mulan","Tome & Jerry"};
		
		System.out.println(disney[1]); //elsa
		//to get all elemets from an array 
		
		for (int i=0; i<disney.length; i++) {
			System.out.println(disney[i]+"");
		}
		
		System.out.println("All elemets using regular for loop ------");
		
		for (String character:disney) {
			System.out.println( character+ "");
		}
	}

}
