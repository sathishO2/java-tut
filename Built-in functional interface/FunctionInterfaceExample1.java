import java.util.function.Function;

class FunctionInterfaceExample1{
	public static void lamdafun() {
		//      <ip-type,re-type>
		Function<Integer,Double> usd2inr = (usd) -> usd*81.1;

		// apply function in Function interface
		System.out.println(usd2inr.apply(5));
	}

	public static void icfun() {
		Function<Integer,Double> u2i = new Function<>() {
			@Override
			public Double apply(Integer v) {
				return v*81.2;
			}
		};

		System.out.println(u2i.apply(5));
	}

	public static void main(String[] arg) {
		lamdafun();
		icfun();
	}
}