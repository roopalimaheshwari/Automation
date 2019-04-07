package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		/*HashSet<String> hs = new HashSet<>();
		hs.add("Priyanka");
		hs.add("Priyanka");
		hs.add("Nilima");
		hs.add("Lokesh");
		hs.add("abc");
		
		for(String s:hs)
		{
			System.out.println(s);
		}
	
		LinkedHashSet<String> hs1 = new LinkedHashSet<>();
		hs1.add("Priyanka");
		hs1.add("Priyanka");
		hs1.add("Nilima");
		hs1.add("Lokesh");
		hs1.add("abc");
		
		for(String s:hs1)
		{
			System.out.println(s);
		}*/
	
		TreeSet<String> hs2 = new TreeSet<>();
		hs2.add("Priyanka");
		hs2.add("Priyanka");
		hs2.add("Nilima");
		hs2.add("Lokesh");
		hs2.add("abc");
		
		for(String s:hs2)
		{
			System.out.println(s);
		}
	
	}

}
