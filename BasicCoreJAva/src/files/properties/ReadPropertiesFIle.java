package files.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFIle {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream file = new FileInputStream("F:\\Automation\\BasicCoreJAva\\src\\files\\properties\\objectrepo.properties");
		Properties p=new Properties();
		p.load(file);
		
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("login"));
		//Thread.sleep(4000);
	}
}
