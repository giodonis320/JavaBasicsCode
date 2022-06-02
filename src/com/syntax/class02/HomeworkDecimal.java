package com.syntax.class02;

public class HomeworkDecimal {
	public static void main (String [] args) {
		
		double a1= 5.5;
		double a2= 10.3;
		double sum,sub,multi,div;
		
		sum=a1+a2;
		sub=a1-a2;
		multi=a1*a2;
		div=a1/a2;
		
		System.out.println("The sum of 2 numbers "  + a1 + " and "  + a2 + " is equal to " +sum);
		System.out.println("The sub of 2 numners " + a1 + " and " + a2 + " is equal to " +sub);
		System.out.println("The multi of 2 numbers " + a1 + " and " + a2 + "is equal to " + multi);
		System.out.println("The div of 2 numers " + a1 + "and " + a2 + "is euql to " +div);
		
		double a3= 1.5;
		double square=a3*a3;
		
		System.out.println("The square root of " + a3 + " is " + square );
		
		int width, height;
		width= 5;
		height= 7;
		
		int area= width*height;
		int perimeter=(width*height)*2;
		
		System.out.println("The perimiter of a rectangle with width" + width + "and height" + height + "is equal to " + perimeter + "and the are is" + area );
		
	
		
		
		
		
		

}
}