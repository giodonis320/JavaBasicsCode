package com.syntax.class6;

public class SwitchLimitations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* switch can work with byte, short, int, char, string
		 * switch has a datatype limitation
		 * switch cannot work with double, float, long, boolean
		 */
		
		double price= 10;
		switch(price) {
		
		/*
		 * /CE: cannot swith on a value of type double.
		 */
		
		boolean hungry=true;
		
		/*swtich(hungry){ -> CE: Cannot swith on a value of type boolean
		 * switch has a operators limitations 
		 * 
		 */
		
		char choice= 'Y';
		String meaning;
		
		/*switch(choice) {
		
		case 'Y' || 'y':
			meaning= "Yes";
			break;
		}
		*/
		
		int day=5;
		
		/*swtich(day) {
			
			case >5:
			}
		*/
				
		}
		
		}
	}

}
