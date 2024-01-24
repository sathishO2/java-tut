
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class List_Interface{
	public static void main(String[] arg) {
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		Collections.addAll(l,"d","e","f","g");
		
		// List Operations
		l.add(0, "!");
		l.remove(0);
		l.set(0, "a+");
		List<String> sl = l.subList(0, 4);
		
		System.out.println(l.indexOf("e"));

		System.out.println(l.equals(sl));
		
		System.out.println(l.get(0));
		
		System.out.println(l.contains(sl.get(0)));
		
		System.out.println(l.containsAll(sl));
		
		System.out.println(l.isEmpty());
		
		for(String i:l) {
			System.out.print(i+" ");
		}System.out.println();
		
		System.out.println(sl);
		System.out.println(l);
		
	}
}