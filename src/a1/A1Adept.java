package a1;

import java.util.Scanner;

public class A1Adept {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		int lengthHolder = count;
		String[] foodNames = new String[count];
		double[] costFood = new double[count];
		int subitems;
		
		for(int i = 0; i < count; i++) {
			foodNames[i] = scan.next();
			costFood[i] = scan.nextDouble();
		}
		int peopleNumber = scan.nextInt();
		String[] name = new String[peopleNumber];
		double[] value = new double[peopleNumber];
		
		for(int i =0; i < peopleNumber; i++) {
			name[i] = scan.next() + scan.next();
			subitems = scan.nextInt();
			for(int j =0; i < subitems; i++) {
				
			}
			
		}
		}
		
		
	}
		

