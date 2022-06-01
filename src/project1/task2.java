package project1;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
int[] array=new int[5];
int sum=0;
		
	for(int i=0; i<5; i++) {
		
		
		System.out.println("Enter a number to add to array");
		array[i]=input.nextInt();
		
		sum+=array[i];
		
		
		
	}
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
