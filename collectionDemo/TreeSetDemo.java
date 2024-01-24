import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

class TreeSetDemo{
	public static void main(String[] arg) {
		TreeSet<Character> ts = 
				new TreeSet<Character>(List.of('s','a','t','h','i','s','h'));

		System.out.println(ts);
		System.out.println(ts.descendingSet());
		ts.add('n');
		System.out.println();
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet('i'));
		System.out.println(ts.tailSet('i'));
		System.out.println(ts.subSet('h', 't'));
		System.out.println(ts.higher('i'));
		System.out.println(ts.lower('h'));
		System.out.println();

		System.out.println("*********************************");
		Iterator<Character> dit = ts.descendingIterator();
		while(dit.hasNext()) {
			System.out.println(dit.next());
		}
		System.out.println("*********************************");
		Iterator<Character> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*********************************");

		ts.remove('i');
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());


		System.out.println(ts);
	}
}