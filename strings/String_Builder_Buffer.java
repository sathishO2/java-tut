class String_Builder_Buffer{
	public static void main(String[] arg) {
		// Synchronized (support multi-threads)
		StringBuilder sbl = new StringBuilder("StringBuilder");
		
		//non-Synchronized (thread safe single-thread environment)
		StringBuffer sbf = new StringBuffer("StringBuffer");


		String t = " test";

		sbl.append(t);
		//sbl.setCharAt(0, 'R');

		System.out.println(sbl.hashCode());

		System.out.println(sbl.reverse());

		System.out.println(sbl.capacity());

		System.out.println(sbl.delete(0, 5));
		
		// sb.reverse();
		// sb.setCharAt(0, 'R');
		// sb.insert(6,"Builder");
		// sb.replace(6,sb.length(),"Builder");
		// String s = new String(sb);

		sbl.setCharAt(0, 'R');
		System.out.println(sbl.replace(7,sbl.length(), "Integer"));

	}
}