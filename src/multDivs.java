//Maurice Hanns CSC 242 03/01/2018

import java.util.Scanner;

public class multDivs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean var1 ;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int divMe = input.nextInt();

		
		if (divMe % 2 == 0 && divMe % 3 == 0){
			var1 = true;
		}
		else {
			var1 = false;
		}
	
		System.out.println(var1);
	
	}

}
