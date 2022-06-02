package com.syntax.class5;

import java.util.Scanner;

public class TaskCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.println(" Do you have a CC? ");
		String answer=input.nextLine();
		
		if (answer.equals ("No")) {
			System.out.println(" We will offer you a credit card");
			
		}else {
			System.out.println(" What is the balance on the card ");
			int balance = input.nextInt();
			
			if (balance > 1000) {
				System.out.println(" pay it off immediatly");
			} else {
				System.out.println("you can spend more");
			}
		}
		
	}

}
