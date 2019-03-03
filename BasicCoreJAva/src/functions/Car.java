package functions;

public class Car {
	
	String name;
	String model;
	int wheels;
	String colour;
	
	public Car(String name, String model, int wheels, String colour)
	{
    this.colour=colour;
	this.name=name;
	this.wheels=wheels;
	this.model=model;
	
	}
	
	public Car()
	{
		
	}
	
	public void drive()
	{
		System.out.println("The " +name+ " car of "+ model +" have "+wheels+ "wheels and in" +colour);
	}
	
	public void transport()
	{
		System.out.println("the " +name+" car transports people from Pune to Mumbai");
	}
	
	public void specification()
	{
		System.out.println("The " +name+ " car of"+ model +" have "+wheels+ "wheels and in" +colour);
	}

}
//the variables which has static keywords in the description are known as class variables
//the variables which are nonstatic are know as instance variables