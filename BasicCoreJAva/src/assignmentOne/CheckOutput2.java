package assignmentOne;

public class CheckOutput2 {

		public static void main(String[] args) {
		int x=0;
		while(true){
		x = increment(x);

		System.out.println("Value of x is --"+x);

		if(x>10) //as soon as 11>10 the code breaks
		break;

		}
		}

		public static int increment(int i){
		return i+1;
		}
		}

