package com.syntax.class5;

import java.util.Scanner;

public class ScannerHeight {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println(" Please enter your height in inches ");
	int height = input.nextInt ();
	
	if (height < 60) {
		System.out.println(" You are short ");
	}else if (height >=60 && height <=72) {
		System.out.print(" You are medium ");
	}else if (height > 72) {
		System.out.println(" You are tall ");
	}
	
}

}
