package functions;

public class AccessModifiers {

	
	public void publicfunc()
	{
		System.out.println("Public from AccessModifier");
	}
	
	private void privatefunc()
	{
		System.out.println("Private from AccessModifier");
	}
	
	protected void protectedfunc()
	{
		System.out.println("Protected from AccessModifier");
	}
	
	 void defaultfunc()
	{
		System.out.println("Default from AccessModifier");
	}
	 
	 public static void main(String[] args) {
		
		 AccessModifiers obj = new AccessModifiers();
		 obj.privatefunc();
		 obj.defaultfunc();
		 obj.protectedfunc();
		 
	}
}

