package project1;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers={
			
			{1, 2, 3,4,5},
			{2, 2, 2, 4}, 
			{4, 4, 4},
			};
		
		int sum=0;
		
		for (int[] numb:numbers) {for(int nu:numb) {
			
			
			sum+=nu;
			
			
			}
			
			
		}
		
		
		System.out.println(sum);
		
		
	}

}
