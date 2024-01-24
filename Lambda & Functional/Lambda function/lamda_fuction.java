// ntn("this" reference  between inner class and lambda Expression)

class lamda_function{
	
	public static void fun() {
		greet(new conPrint());
	}
	
	public static void greet(Printer p) {
		p.print("hello");
	}
	
	public static void main(String[] arg) {
		String s = "- ";
		// functional interface is access by "inner class"
		Printer p = new Printer(){
			@Override
			public void print(String msg){
				System.out.println(s + msg);
				}	
		};
		
		// functional interface is access by "lambda function"
		Printer pl = msg -> System.out.println(s + msg);
		
		pl.print("hello lambda");
		p.print("hi java");
	}
}

@FunctionalInterface
interface Printer{
	void print(String msg);
}



// functional interface is access by "outer class"  
class conPrint implements Printer{
	
	@Override
	public void print(String msg) {
		System.out.println(msg);
	}
}
