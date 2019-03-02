package functions;

public class FuncCalling {

	public static void main(String[] args) {
		
		Functions.sum(10, 20); //sum is static and whenever you want to call static function from another class you can directly call usinf class name
		Functions.multiply(10, 20);
	//Static functions can only call static variables and static functions.
		
		// To call nonstatic func and variables we have to create instance of that particular class
		Functions f= new Functions();
		f.mod(20, 10);
	
		int a= f.interestCalc(1000, 8, 100);
		System.out.println(a);
		
		AccessModifiers am= new AccessModifiers();
		am.publicfunc();
		am.protectedfunc();
		am.defaultfunc();
		
		
	}
	
	
}
