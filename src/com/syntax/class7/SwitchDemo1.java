package com.syntax.class7;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country="Pakistan";
		
		swtich(country) {
		
			case "Turkey";
			System.out.println("Ankara");
			break;
			case "USA:"
			System.out.println("DC");
			break;
			case "Serbia";
			System.out.println("Bergrade");
			break;
			case "Albania";
			System.out.println("Tirana");
			break;
			case "Afghanistan":
			System.out.println("Kabul");
			break;
			case "Pakistan":
			System.out.println ("Islamabad");
			break:
			default:
			System.out.println("Not a valid country");
			
		}
	}

}
