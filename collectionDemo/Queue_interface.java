import java.util.ArrayDeque;
import java.util.Queue;

class Queue_interface{
	public static void main(String[] arg) {
		Queue<String> q = new ArrayDeque<>();
		
		q.offer("a"); // add()
		q.offer("b");
		q.offer("c");
		q.add("d");

		q.poll(); // remove()
		q.remove("d");
		
		System.out.println(q.element());
		System.out.println(q.peek());
		
		System.out.println(q);
		
	}
}