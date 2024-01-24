import java.util.Iterator;
import java.util.LinkedList;

class LinkedListDemo{
	public static void main(String[] arg) {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		// throw Exception
		ll.add(2);
		ll.add(3);
		ll.addLast(5);
		ll.addFirst(1);

		ll.add(3,4);

		// throw null
		ll.offer(6);
		ll.offerFirst(0);
		ll.offerLast(7);

		// throw Exception
		ll.remove(); // from first
		ll.remove(0);
		ll.removeFirst();
		ll.removeLast();

		// throw null
		ll.poll();
		ll.pollLast();
		ll.pollFirst();

		ll.get(0);
		ll.getFirst();
		ll.getLast();

		ll.set(0, 1);

		ll.peek();
		ll.peekFirst();
		ll.peekLast();

		for(Integer i: ll) System.out.println(i);

		Iterator<Integer> it = ll.iterator();

		while(it.hasNext()) System.out.println(it.next());

		System.out.println();
		System.out.println(ll);

	}
}