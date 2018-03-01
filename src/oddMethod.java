//Maurice Hanns CSC 242 03/01/2018

import java.util.Scanner;

public class oddMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				
				Scanner input = new Scanner(System.in);
				System.out.println("Enter a string: ");
				String var1 = input.nextLine();
				boolean value = odd(var1);
				System.out.println("The number is even --->" + value);

							
	}//main

	public static boolean odd(String var){
		
		boolean value = false;	
		int length = var.length();
	
		System.out.println(length);
		System.out.println(var);

	
		if (length % 2 == 0) {
			value = true;
		}
		else if (length % 2 != 0){
			value = false;
		}
	
		return value;
	}//odd
	
}//class
