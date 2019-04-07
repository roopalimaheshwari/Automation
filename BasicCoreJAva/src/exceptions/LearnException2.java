package exceptions;

import java.io.FileInputStream;

import abstarction.HDFC;

public class LearnException2 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		try
		{
		System.out.println(a/b);
		
		HDFC hdfc= new HDFC();
		hdfc.demonitization();
		//FileInputStream file = new FileInputStream("asdf");
		
		throw new Error("Testing Error");
		
		}catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch(RuntimeException re)
		{
			//System.out.println("exceptions runtime");
			System.out.println(re.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Excepetion ");
		System.out.println(e.getMessage());
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		
		
		System.out.println("Testing");
	}
}
