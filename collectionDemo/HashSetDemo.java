import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class HashSetDemo{
	public static void main(String[] arg) {
		HashSet<Character> set = 
				new HashSet<>(List.of('a','b','c','d','a','c','d'));
		
		set.add('o');
		set.remove('c');
		set.equals(set);
		
		
		Iterator<Character> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(set);
	}
}