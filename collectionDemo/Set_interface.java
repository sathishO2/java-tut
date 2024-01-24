import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Main{
	public static void main(String[] arg) {
		Set<String> set = new HashSet<>();
		set.add("sky");
		set.add("is");
		set.add("blue");
		set.add("sky");
		
		set.remove("is");
		set.contains("blue");
		
		System.out.println(set);
		
		
		// **SET**
		
		Collection<Integer> s = new ArrayList<>();
		Collections.addAll(s, 1,2,3,4,5);
		
		// pass list elements
		Set<Integer> set0 = new HashSet<>(s);
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));
		
		// set operations
		
		// Union
		// set1.addAll(set2);
		
		// Intersection
		// set1.retainAll(set2);
		
		// Difference
		set1.removeAll(set2);
		
		System.out.println(set1);
		
	}
}