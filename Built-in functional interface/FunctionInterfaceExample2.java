import java.util.function.Function;

class MaFunctionInterfaceExample2{

	public static void strlen(String str) {
		Function<String,Integer> len = (inpu) -> str.length();
		System.out.println(len.apply(str));
	}

	public static void checkEmpty(String s) {
		Function<String,Boolean> ce = (str) -> str.isEmpty() 
				|| str.equals("");
		System.out.println(ce.apply(s));
	}

	public static void main(String[] arg) {
		strlen("hello world");
		checkEmpty("");
	}
}