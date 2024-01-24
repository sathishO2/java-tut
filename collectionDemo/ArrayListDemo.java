import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/** List(I) is the Child of Collection(I). 
 * ArrayList (C) is one of the classes provides implementation for the List(I).
 * In list duplicate values are allowed and the insertion order is maintained. 
 * The underlying DS is resizeable Array or Growable Array. We can insert Heterogeneous objects as well.
 * NOTE: All the collections can store Heterogeneous objects can be stored except TREE SET and TREE MAP.
 * ArraList and vector implements RandomAccess, Serializable and Cloneable Interfaces
 * Synchronized-> No
 * Thread safe-> NO
 * Default capacity-10
 * Fill Ratio or Load factor:1 or 100%
 * Growth Rate: current_size + current_size/2
 */

/* ArrayList is non-synchronized.It should not be used in multi-threaded 
 * environment without explicit synchronization.Hence,
 * adding an element to the list when traversing through it
 * will give concurrent modification exception.
 * This is happening because when a thread is trying to read the elements
 * from the list another thread is trying to add or remove an element from the same. 
 */

class ArrayListDemo{
	public static void main(String[] arg) {
		List<String> al = new ArrayList<>();
		al.add("idly"); al.add("poori");
		al.add("dhosai"); al.add("tea");
		al.add("coffee"); al.add("vada");
		al.add("samosa");

		al.set(3,"pall");
		al.remove(1);
		al.size();
		System.out.println(al.isEmpty());
		System.out.println(al.get(0));
		System.out.println(al.indexOf("coffee"));
		System.out.println(al.lastIndexOf("tea"));
		System.out.println(al.contains("vada"));

		System.out.println("\nUsing for each:");
		for(String i:al) {
			System.out.println(i);
		}
		System.out.println("******************************************");
		System.out.println("Using for loop:");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("******************************************");

		System.out.println("Using ListItaretor");
		ListIterator<String> li = al.listIterator();
		System.out.println("***forward***");
		while(li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("***back-ward***");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

		System.out.println("******************************************");

		System.out.println("***Iterator***");
		Iterator<String> it = al.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}


		System.out.println("\n"+al.size());
		System.out.println(al.subList(1,4));
		System.out.println(al);
	}
}