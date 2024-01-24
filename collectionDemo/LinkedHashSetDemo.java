import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class LinkedHashSetDemo{
	public static void main(String[] arg) {
		// LinkedHashSet (HashTable + LinkedList) - it maintains insertion order
		
		Set<Character> set = 
				new LinkedHashSet<Character>(List.of('s','a','t','h','i','s','h'));
		
		set.add('n');
		set.remove('o');
		set.isEmpty();
		set.size();
		
		Iterator<Character> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(set);
	}
}