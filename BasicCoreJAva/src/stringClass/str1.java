package stringClass;

public class str1 {

	public static void main(String[] args) {
		
		String str ="Roopali";
		
		//length of string;
		
		System.out.println(str.length());
		
		//trim the spaces
		String str4=" Roopali ";
		System.out.println(str4.trim());
		
		//char At certain index
		System.out.println(str.charAt(3));
		
		//sub string
		String str2 = str.substring(0, 4);
		System.out.println(str.substring(0, 4));

		//concat
		
		String str3 ="Maheshwari";
		System.out.println(str.concat(str3));
		
		//replace
		
		String str6 ="Roopali Maheshwari";
		String str7 = str6.replace(" ", "");
		System.out.println(str7);
		
		//split
		String[] arr = str6.split(" ");
		int l = arr.length;
		System.out.println(l);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//equals
		
		String a="Anand";
		String b="anand";
		
		System.out.println(a.equals(b));
		
		System.out.println(a.equalsIgnoreCase(b));

		
	//	System.out.println(a.compareTo(b));
		
		
	}
}
