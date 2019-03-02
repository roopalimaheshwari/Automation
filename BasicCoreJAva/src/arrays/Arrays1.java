package arrays;

public class Arrays1 {

	public static void main(String[] args) {
		
		String[] str= new String[4];
		
		str[0]="Swapnil";
		str[1]="Pradnya";
		str[2]="Anjali";
		str[3]="Roopali";
		
				//System.out.println(str[2]);
				
				/*for(int i=0; i<str.length ; i++)
				{
					System.out.println(str[i]);
			}*/
		//enhanced for loop
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
	}
}
