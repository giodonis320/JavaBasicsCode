package com.syntax.class7;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print numbers from 1 to 10 
		
		int num=1;
		
		while(num<=10) {
			System.out.println(num+ "");
			num++;
			
		}
		//print numbers form 1 to 10
		System.out.println();
		int a=10;
		while (a<=100) {
			System.out.println(a+"");
			a++;
			
		}
		//print numbers from 10 to 1 
		
		System.out.println();
		int b=1;
		while(b<=10) {
			System.out.print(b+"");
			b--;
		}
		//print numbers from 100 to 50 
		int c=100;
		
		while (c>=50) {
			System.out.print(c+"");
			c--;
		//print numbers from -1 to -10 
			System.out.println();
			int d=-1;
			while(d>=-10) {
				System.out.println();
				
		//print numbers from 1 to 20 but only even numbers
			System.out.println();
			
			int f =1;
			while (f <=20) {
				if (f % 2 ==0) {
					System.out.print(f + "");
			f++;
				}
			
			}
			int r=100;
			while (r>=1) {
				if (r%2!=0) {
					System.out.println(r + " ");
				}
			r--;
			}
			//another way 
			System.out.println();
			int y=99;
			while (y>=1) {
				System.out.print(y+"");
				y-+2;
			}
			}
			
		}
		
	}
	

}
