package project1;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		//Maximum and minimum number in the array?
		
		
		
		int [] array= {1,2,30,4,5,6,7,8,9,10};
		
	
		int max=array[0];
		
		int min=array[0];
		int secondlargest=array[0];
		
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]> max) {max=array[i];
			
			
			} else if (array[i]<min) {min=array[i];
			
			}else if(array[i]>min && secondlargest<max) {secondlargest=array[i];
			
			
			
			
			
			
			
			}
			
			
			
			
			
			
		}System.out.println("max number in array = " + max + "       2 number = " + secondlargest);
		
		
		
		
		
	
	}

}
