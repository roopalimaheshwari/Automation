package assignmentOne;

public class LeastNumber {

public static void main(String[] arrrgs) {
		
		int[] arr = {10,40,26,32,78,4,65,11};
		int temp;
		
		System.out.println("Original array is:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		for(int i=0; i<arr.length; i++)
		{
		for (int j = i + 1; j <arr.length; j++)   
        {  
            if (arr[i] < arr[j])   
            {  
                temp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = temp;  
            }  
        }
		
		}
		System.out.println("Least number is:" + arr[(arr.length -1)]);
	}
}
