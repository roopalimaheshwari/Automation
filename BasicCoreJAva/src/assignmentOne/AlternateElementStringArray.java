package assignmentOne;

public class AlternateElementStringArray {

	//Alternate element of string array
	
	public static void main(String[] args) {
		
		String[] str = {"one","two","three","four","five"};
		System.out.println("Original array is:");
		for(int i=0; i<str.length; i++)
		{
			System.out.print(str[i] + " ");
		}
		
		//Alternate Elements
		System.out.println("\nAlternate elements are: ");
		for(int i=0; i<str.length; i= i+2)
		{
			System.out.print(str[i]+ " ");
		}
	}
}
