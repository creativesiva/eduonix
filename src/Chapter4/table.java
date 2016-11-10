package Chapter4;

import java.util.Scanner;


public class table {

	public static void main(String args[]){
		int a;
		 
		
		System.out.println("Enter your number");
		Scanner in = new Scanner(System.in); 
		a = in.nextInt();
		
		if((a % 2) == 1){
			System.out.println("ODD Number");
		}else 
			System.out.println("Even Number");
		
		
	}
	
}
