
class Method_reference{
//	static method
//	public static void print(String msg) {
//		
//	}
	// instance method
	public void print(String msg) {
		
	}
	
	// constructor
	public Method_reference(String msg){
		
	}
	public static void main(String[] args) {
		// Method Referencing
		// class/Object name :: method name
		
		// greet(msg -> System.out.println(msg));
		// greet(System.out::println);
		
		// static method passing(Class passing)
		// greet(msg -> print(msg));
		// greet(Main::print);
		
		// instance method passing(Object passing)
//		 var demo = new Method_reference();
//		 greet(msg -> demo.print(msg));
//		 greet(demo::print);
		
		// passing value to the constructor
		greet(msg -> new Method_reference(msg));
		greet(Method_reference::new);
		
		
	}
	
	public static void greet(Printable p) {
		System.out.println("hello java");
	}
}

interface Printable{
	void print(String msg);
}