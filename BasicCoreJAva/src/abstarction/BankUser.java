package abstarction;

public class BankUser {

	public static void main(String[] args) {
		RBI obj = new HDFC();
		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
	 obj = new PnB();
		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
	 obj = new ICICI();
		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
	}
}
