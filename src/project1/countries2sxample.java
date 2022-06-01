package project1;

import java.util.Scanner;

public class countries2sxample {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		String [] array=new String[3];
		
		
		System.out.println("please enter the name of the countries");
		
		
		for(int i=0; i<array.length; i++) {
			
			array[i]=scan.nextLine();}
			
		for(String cont: array) {
			
			
			
			String capital;
			switch(cont) {
			
			
			case "pakistan":capital="islamabad";
			break;
			
			case "india":capital="New delhi";
			break;
			
			case "turkey":capital="Istanbul";
			break;
			
			
			default:
				capital="invalid";
			
			
			
			
	
		
		
		}
			
		System.out.println("name of the countries in array are: " + cont + " its capital :" + capital);
	
		}
		
		
		
		
		
		
	
	}

}
