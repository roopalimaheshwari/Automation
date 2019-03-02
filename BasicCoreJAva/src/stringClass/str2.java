package stringClass;

public class str2 { //counting number of A in the string

	public static void main(String[] args) {
		
		String str ="aanandaa";
	    String str1 = str.replace("a", "");
	    
		/*int replacedlenght =str1.length();
		
		int originallenght =str.length();
		
		int finallenght = originallenght - replacedlenght;
		System.out.println( finallenght);*/
	
	//	System.out.println(str.length()-str1.length());
		
	    System.out.println(str.length()-(str.replace("a", "")).length());
	    
	    /*int count=0;    using loop
	    
	    for (int i=0; i<str.length(); i++)
	    {
	    	if(str.charAt(i)=='a')
	    	count++;
	    }
	   System.out.println(count);*/
	}
}
