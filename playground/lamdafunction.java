class lamdafunction{

	public static void treditional() {
		car c = new myCar();
		c.start();
	}

	public static void anonymousClass() {
		car c = new car() {
			@Override
			public void start() {
				System.out.println("start from anonymous inner class");
			}
		};

		c.start();
	}

	public static void lambdaMethod() {
		car c = ()-> System.out.println("start from lambada function");
		c.start();
	}

	public static void main(String[] arg) {
		treditional();
		anonymousClass();
		lambdaMethod();
	}
}

@FunctionalInterface
interface car{
	public abstract void start();
}

class myCar implements car{
	@Override
	public void start() {
		System.out.println("start from treditional method");
	}
}