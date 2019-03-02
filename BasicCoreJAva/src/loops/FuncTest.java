package loops;
import functions.AccessModifiers;

public class FuncTest extends AccessModifiers{

	public static void main(String[] args) {
		
		AccessModifiers am= new AccessModifiers();
		am.publicfunc();
		
		FuncTest fn = new FuncTest();
		fn.protectedfunc();
	}
}
