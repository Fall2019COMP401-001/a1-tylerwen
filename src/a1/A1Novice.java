package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		double total = 0;
		
		for (int i=1; i<=count; i++) {
			String firstname = scan.next();
			String lastname = scan.next();
			int items = scan.nextInt();
			total = 0;
		for (int j = 1; j<=items; j++) { 
			double amount = scan.nextInt();
			scan.next();
			double price = scan.nextDouble();
			double dynprice = amount * price;
			total = total + dynprice;
		}
		System.out.println(firstname.charAt(0) + ". " + lastname + ": " + total);
					
		}
		}
						
	}
;
	
