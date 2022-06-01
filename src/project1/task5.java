package project1;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int[][] numbers={
				
				{1, 2, 3,4,5},
				{2, 2, 2, 4}, 
				{3, 5, 4},
				};
			
			
		int sumodd=0;
		int sumeven=0;
			
			for (int[] numb:numbers) {for(int nu:numb) {
				
				
				if (nu%2==0)
				
				sumeven+=nu;
		
		
				if(nu%2!=0)
				
				sumodd+=nu;
		
		
			}
		
		
		
		
		
		

	}System.out.println("sum of even numbers from 2D array= " + sumeven);
	System.out.println("sum of odd numbers from 2D array= " + sumodd);
	}
}
