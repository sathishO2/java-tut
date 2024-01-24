
public class Queue<T> {
	Node First;
	Node Last;
	int len;
	
	class Node{
		T value;
		Node next;
		Node(T value){
			this.value = value;
		}
	}
	
	Queue(T value){
		Node nnode = new Node(value);
		First = nnode;
		Last = nnode;
		len = 1;
	}
	
	public void enqueue(T value) {
		Node nnode = new Node(value);
		if(len==0) {
			First = nnode;
			Last = nnode;
		}else {
			Last.next = nnode;
			Last = nnode;
		}
		len+=1;
	}
	
	public Node dequeue() {
		if(len==0) return null;
		Node temp = First;
		if(len==1) {
			First = null;
			Last = null;
		}else {
			First = temp.next;
			temp.next = null;
		}
		len-=1;
		return temp;
	}
	
	public void show() {
		Node temp = First;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void getFirst() {
		if(First!=null) System.out.println("First : "+First.value);
		else System.out.println("First : null");
	}
	
	public void getLast() {
		if(Last!=null) System.out.println("Last : "+Last.value);
		else System.out.println("Last : null");
	}
	
}
