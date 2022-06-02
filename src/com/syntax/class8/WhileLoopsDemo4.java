package com.syntax.class8;

import java.util.Scanner;

public class WhileLoopsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * take the input from the user 
		 * increment it by 2 print it 
		 * if value is 10 terminate the program 
		 * break till 840
		 */
 int x=0;
 Scanner scanner=new Scanner(System.in);
 while(x!=10) {
	 System.out.println("please enter the number");
	 x=scanner.nextInt();
	 System.out.println(x+2);
 }
     scanner.close();
	}

}
