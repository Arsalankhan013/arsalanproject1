package project1;

import java.util.Arrays;
import java.util.Scanner;

public class projectt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		
		System.out.println("please enter integer to add array");
		
		
		
		int [] array=new int[5];
		
		int sum=0;
		for (int i =0; i<5; i++) {
			
			
			array[i]=input.nextInt();
			
			sum+=array[i];
		
		}System.out.println("the sum of array is " + sum);
		
		for (int i=0; i<array.length; i++) {System.out.println("the array list is " +(array[i]));
		
		
		
	}
	
	
	}
	

}
