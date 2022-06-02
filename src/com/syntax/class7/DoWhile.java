package com.syntax.class7;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop first checks condition 
				//and only then executes block of code
		
		int num=10;
		while (num<=3){
			System.out.println(num+"");
			num++;
			
		}
	System.out.println("----------------");
	//do while first executes the code 
	//and only then checks the condition 
	int num1=10;
	
	do {
		System.out.println(num1 + "");
		num1++;
	}while (num1<=3);
	
	//print numbers 1 to 30 using do while 
	int b=1;
	
	do {
		System.out.print(b);
		b++;
	}while (b<=30);
	System.out.println("----------");
	//print even numbers from 70 to 30
	
	int num3=70;
	
	do {
		System.out.print(num3+"");
		num3-=2; //68,66,64
	} while (num3>=30);
	}
	
	}
	
	
	

	


