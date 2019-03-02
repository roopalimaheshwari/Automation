package assignment2;

public class Output2 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		a.parentMeth();
		a.childMeth();

		b.childMeth();
		a.parentMeth();

		}

		}

		class A{ // class already defined in Output1

		public void parentMeth(){

		}
		}

		class B extends A{
			public void childMeth(){

			}


}
