import java.util.Arrays;

class StringMethods{
	public static void main(String[] arg) {
		String s = " This is String ";

		//String Methods

		System.out.println(s.charAt(1));

		System.out.println(s.length());

		System.out.println(s.contains("is"));

		System.out.println(s.equals("this is string"));
		System.out.println(s.equalsIgnoreCase("this is string"));

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		System.out.println(s.indexOf('s'));
		System.out.println(s.indexOf("is",3));
		System.out.println(s.indexOf("s",4));

		System.out.println(s.replace("T", "D"));
		System.out.println(s.replace('i', 'j'));

		System.out.println(s.substring(2));
		System.out.println(s.substring(2,10));

		System.out.println(s.isEmpty());
		System.out.println(s.concat("1234"));
		System.out.println(s.trim());

		System.out.println(String.join("-", "10","10","2010"));

		String ss = "this%is*a$string@for/spliting!porpus#uuf";
		String sp[] = ss.split("[%*@!#/]");

		System.out.println(Arrays.toString(sp));

	}
}