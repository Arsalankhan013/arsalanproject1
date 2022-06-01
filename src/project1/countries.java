
   
package project1;

import java.util.Scanner;

public class countries {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
				
		String [] array=new String[3];
		
		
		System.out.println("please enter the name of the countries");
		
		
		for(int i=0; i<array.length; i++) {
			
			array[i]=scan.nextLine();}
			
		for(int j=0; j<array.length;j++) {System.out.println("name of the countries in array are: " + array[j]);
			
			
		if(array[j].equals("pakistan")) {System.out.println(array[j] + " capital city is Islamabad");
		
		}else if(array[j].equals("India")) {System.out.println(array[j]+ "Capital city is New Delhi");
		
		
		}else if(array[j].equals("canada")) {System.out.println(array[j] + "capital city is Ottawa");
		
		
		
		}
		
		
		
		

	
		
				
		}
				
	}
}