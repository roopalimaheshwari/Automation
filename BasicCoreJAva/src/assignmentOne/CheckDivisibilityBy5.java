package assignmentOne;

public class CheckDivisibilityBy5 {

	public static void main(String[] args) {
		
		/*for loop to print numbers 1 to 100 but if the number is divisible by 5, 
		it prints 'divisible by 5 followed by that number'*/
		
		for(int i=0; i<=100; i++)
		{
			
			if(i%5==0)
			{
			System.out.println("Divisible by 5: " + i);
			}else
			System.out.println(i);
		}
	}
}
