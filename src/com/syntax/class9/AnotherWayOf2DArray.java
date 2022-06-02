package com.syntax.class9;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //create 2D arrat of states 
		/*
		 * 1 array 2d array of states 
		 * 2 array ---> ca ---> all cities of CA state 
		 * 3 Array ---> fl--> all cities of FL 
		 * 4 array --> VA--> all cities of VA state 
		 * 
		 */
		
		String [] [] usa= {
		{"New York, "Albany", "Buffalo"},
		{"LA", "SF", "SJ", "SD","Redding"},
		{"Miami", "Oralndo", "Niceville", "Tampa"},
		{"McLean", "Richmond", "Leesburg"}
		
		};
		System.out.println(usa[1][2]); //San Jose 
		System.out.println("I want to go to "+usa [2] [0]); //miami
		
		System.out.println("Total # of 1D arrays in array usa = "+usa.length);//4
		
		//I want to see my first array 
		int num1array=usa[0].length;
		System.out.println("# of elemets in 1 array = "+elem1array);
		
		//I want to see how many elemt inside my 2 array 
		int elem2array=usa[1].length;
		System.out.println("# of elemets in 2 array = "+elem2array);
		
		}
		
		
	}

}
