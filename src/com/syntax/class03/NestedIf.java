package com.syntax.class03;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean vaccine=true;
		//int dose = 2;
		
		//if(vaccine) {
			//System.out.println("Let me check if you got a secong doese");
			//if (dose==1) {
			//System.out.println("You need 1 more shot");
			//}
		
		String month ="July";
		int day =9;
		
		if (month.equals("May")) {
			System.out.println("Let me check what is todays date");
			if (day==8) {
				System.out.println("Today is Mothers day");
			}
		} else if (month.equals("June")) {
			System.out.println("Let me check what is todays date");
			
			if (day ==19) {
				System.out.println("Todays is fathers day");
			}
		}
		
		}
	}
		

	


