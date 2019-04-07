package abstarction;

public class BAnkUser2 {
	
	public static void main(String[] args) {
		RBI obj =null;
		String bank="HDFC";
		
		if(bank.equals("ICIC"))
		{
			obj= new ICICI();
			
		}else if(bank.equals("PnB"))
		{
			obj=new PnB();
		}else if(bank.equals("HDFC"))
		{
			obj= new HDFC();
		}
		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
	}

}
