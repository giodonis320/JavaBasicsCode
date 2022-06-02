package com.syntax.class03;

public class StringConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName="gio";
		String lastName="donis";
		String fullName=firstName+lastName;
		int num=10;
		int num2=10;
		
		System.out.println(fullName);
		System.out.println(firstName+num);
		System.out.println(firstName+num+num2);//1st operation=firstName=num=>gio10+10=>gio1010
		System.out.println(firstName+(num+num2));
		System.out.println(num+firstName+num2);
		

	}

}
