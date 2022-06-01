package project1;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Write a java program to check whether a given number is prime or not?
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number to check whether it's a prime number");
		
		int number=scan.nextInt();
		int count=0;
		
		
		
		for(int i=1; i<=number; i++) {if (number%i==0) {count++;
		
		
		}
		
		
		
		
		
		
		}if (count==2){System.out.println(number + " its a prime number");
		
		}else{System.out.println(number + " Its not prime");}
			
			
			
			
			
			
		
		
	}

}
