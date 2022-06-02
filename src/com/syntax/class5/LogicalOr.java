package com.syntax.class5;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Monday and Friday ---> No class 
		 * Tues and Wed --Manual test 
		 * Thurs--> review 
		 * Sat and sunday --Java 
		 */
		
		String day ="Monday";
		
		if (day.equals("Monday") || day.equals( "Friday")) {
			System.out.println(" I have no class ");
		}else if (day.equals ( "Tuesday ") || day.equals ("Wednesday")) {
			System.out.println(" I have manyal testing class ");
		
		}else if (day.equals(" Thursday ")) {
			System.out.println(" I have a review class");
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println(" I have java class ");
		}
		
		

	}

}
