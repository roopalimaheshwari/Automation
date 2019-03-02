package assignmentOne;

public class SumOfFirstHundred {
	
 //for loop to find the sum of first 100 numbers(1 to 100)
	
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0; i<=100 ; i++)
		{
			sum = sum+i;
			
		}
		System.out.println("Addition is: "+ sum);
	}
}
