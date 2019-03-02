package conditionalStatements;

public class Testing4 {

	//logical operators
	public static void main(String[] args) {
		
		int a=40;
		int b=40;
		int c=30;
		
		if(a>b && a>c)
			System.out.println(" a is greatest");
		else
			System.out.println("false");
		
		if (a>b || a>c )
			System.out.println("a is greatest");
	}
}
