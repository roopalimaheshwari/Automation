package oops;

public class User {
	
	public static void main(String[] args) {
		
		SmartPhones sm = new SmartPhones();
		sm.internet();
		sm.texting();
		sm.calling();
		
		Telephone tp =new Telephone();
		tp.calling();
	}

}
