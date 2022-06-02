package com.syntax.class6;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * let's ask a user where is he from 
		 * based on the country we eill define fav. food 
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where are you from");
	    country = scan.nextLine();
	    
	    swtich (country.) {
	    	
	    	case "Mexico":
	    		favoriteFood="tacos";
	    		break;
	    	case "Canada":
	    		favoriteFood="poutine";
	    		break;
	    	case "Turkey":
	    		favoriteFood="lahmacun";
	    		break;
	    	case "Pakistan":
	    		favoriteFood="pati chai";
	    		break;
	    	case "Egypt":
	    		favoriteFood="koshary";
	    		break;
	    	case "USA":
	    		favoriteFood="burgers";
	    		break;
	    	default:
	    		favoriteFood="unknown";
	    		break;
	    }
	    
	    System.out.println(" you are from " + country + " and your favorite food is "+ fav);
	    
 		
	    }

}
