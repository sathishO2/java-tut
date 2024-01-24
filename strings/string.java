class string{
	public static void main(String[] args) {
		
//		String s = new String("hello"); // Heap Memory(HM)
//		String ss = "hello"; // String Constant Pool(SCP) 
//		(heap memory << string constant pool)
		
//		System.out.println(ss.isEmpty());
//		System.out.println(ss.isBlank());
//		System.out.println(ss.length());
		
//		String s1 = new String("ja");
//		String s2 = s1;
//		
//		s1 = s1+"va";
//		s2 = "ja"+"va";
//		
//		System.out.println(s1+"\n"+s2+"\n");
//		if(s1.equals(s2)) System.out.println("yes");
//		else System.out.println("no");
//		
//		if(s1==s2) System.out.println("Yes");
//		else System.out.println("No");
		
//		@Comparison methods
		
//		String s1 = new String("Java");
//		String s2 = "Java";
//		StringBuffer sb = new StringBuffer("Java");
		
//		boolean result = s1.equals(s2);
//		boolean result = s1.equalsIgnoreCase(s2);
//		int result = s1.compareTo(s2); // -ve,0,+ve values
//		int result = s2.compareToIgnoreCase(s1);
// 		boolean result = s2.startsWith("Ja");
//		boolean result = s1.endsWith("va");
//		boolean result = s1.startsWith("Pro",4);
//		boolean result = s1.contentEquals(sb);
//		
//		System.out.println(result);
		
		
//		@ searching
		
//		String s1 = "i love java programming, java is greate";
		
//		int result = s1.indexOf('i');    // lastIndexOf('i');
//		int result = s1.indexOf("java"); // lastIndexOf("java");
//		int result = s1.indexOf('o',5);  // lastIndexOf('o',14);
//		int result = s1.indexOf("java",11); //lastIndexOf("java",25);
		
//		System.out.println(result);
		
//		@ Character Extraction 
		
//		String s1 = "java is wonderful language";
		
//		char result = s1.charAt(2);
//		String result = s1.substring(8,18); // last index exclusive
//		CharSequence result = s1.subSequence(8,18);
		
//		System.out.println(result);
		
//		@ string forms
		
//		String s1 = "  Java Programing ";
		
//		String result = s1.toUpperCase();
//		String result = s1.toLowerCase();
//		String result = s1.strip();
//		String result = s1.trim();
//		String result = s1.repeat(3);
//		String result = s1.stripLeading();
//		String result = s1.stripTrailing();
//		String result = s1.indent(20);
		
//		System.out.println(result);
		
//		@ Text Processing
		
//		String s1 = "Java is Greatest Of All Time of the king of the sun of the";
		
//		String[] result = s1.split(" ");
//		String[] result = s1.split(" ",2);
//		boolean result = s1.matches("\\w{4}");
//		String result = s1.replace(" ","-");
//		String result = s1.replace('a','*');
//		String result = s1.replaceAll("of","*");
//		String result = s1.replaceFirst("of", "*");

//		String result = String.join("-", s1.split(" "));
		
//		String result = String.valueOf(true);
		
//		System.out.println(result);
		
		
		
	}
}