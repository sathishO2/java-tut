class lambdafunction1{
	public static void classicWay() {
		math fun = new doMath();
		System.out.println(fun.add(5, 3));
	}
	public static void anonymousClassWay() {
		math fun = new math() {
			@Override
			public int add(int a,int b) {
				return a+b;
			}
		};
		System.out.println(fun.add(5, 3));
	}
	public static void lamdafunctionWay() {
		math fun1 = (int a,int b)-> {return a+b;};
		math fun2 = (a,b)-> a+b;
		System.out.println(fun2.add(5, 3));
	}
	public static void main(String[] arg) {
		classicWay();
		anonymousClassWay();
		lamdafunctionWay();
	}
}

@FunctionalInterface
interface math{
	public abstract int add(int a,int b);
}

class doMath implements math{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
}