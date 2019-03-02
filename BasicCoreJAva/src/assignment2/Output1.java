package assignment2;

public class Output1 {

		public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println(a.x);
		System.out.println(a.y); //superclass cannot access subclass variable
		System.out.println(b.x);
		System.out.println(b.y);

		}

		}

		class A{

		String x="Parent";
		}

		class B extends A{
		String y="Child";

		}


