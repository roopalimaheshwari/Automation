package assignmentOne;

public class Class3 {

	public static void main(String[] args) {
		
		int[] arr ={1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
		 
		 for(int i=0; i< arr.length ; i++)
		 {
			 int count=0;
			 for(int j= 1; j<arr.length ; j++)
			 {
				 if(arr[i] == arr[j])
				 {
					 count++;
				 }
				 
			 }
			 System.out.println(arr[i] +" Repeated "+count+" times");
		 }
	}
}
