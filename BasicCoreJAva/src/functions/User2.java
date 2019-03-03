package functions;

public class User2 {

	public static void main(String[] args) {
		
		Car car1 =new Car("Swift","sedan", 4, "white");
	/*	car1.name="Swift";
		car1.wheels=4;
		car1.model="Sedan";
		car1.colour="white";*/
		car1.transport();
		car1.specification();
		
		Car car2 = new Car("i20","magna", 4, "black");
		/*car2.name="i20";
		car2.wheels=4;
		car2.model="magna";
		car2.colour="black";
		car2.transport();*/
		car2.specification();
		
		Car car3=new Car();
		
	}
	
	
}
