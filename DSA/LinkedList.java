
public class LinkedList<T> {
	
	class Node{
		T value;
		Node next;
		Node(T value){
			this.value = value;
		}
	}
	
	Node head;
	Node tail;
	int len;
	
	LinkedList(T value){
		Node nnode = new Node(value);
		
		head = nnode;
		tail = nnode;
		len = 1;
	}
	
	public void append(T value) {
		Node nnode = new Node(value);
		if(len==0) {
			head = nnode;
			tail = nnode;
		}
		else {
			tail.next = nnode;
			tail = nnode;
		}
		len+=1;
	}
	
	public void prepend(T value) {
		Node nnode = new Node(value);
		if(len == 0) {
			head = nnode;
			tail = nnode;
		}else {
			nnode.next = head;
			head = nnode;
		}
		len+=1;
	}
	
	public Node removeFirst() {
		if(len==0) return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		len-=1;
		if(len==0) {
//			head = null;
			tail = null;
		}
		return temp;
	}
	
	public Node removeLast() {
		if(len==0) return null;
		Node temp = head;
		Node pre = head;
		while(temp.next !=null ) {
			pre = temp;
			temp = temp.next;
		}
		pre.next = null;
		tail = pre;
		len-=1;
		if(len==0) {
			head = null;
			tail = null;
		}
		return temp;
		
	}
	
	public Node get(int indx) {
		if(len <= indx || indx<0) return null;
		Node temp = head;
		for(int i=0;i<indx;i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean set(int indx,T value) {
		Node temp = get(indx);
		if(temp != null) {
			temp.value = value;
		}
		return false;
	}
	
	public boolean insert(int indx,T value) {
		if(indx>len || indx<0 ) return false;
		if(indx==0) {
			prepend(value);
			return true;
		}
		if(indx==len) {
			append(value);
			return true;
		}
		Node temp = get(indx-1);
		Node nnode = new Node(value);
		nnode.next = temp.next;
		temp.next = nnode;
		len+=1;
		return true;
	}
	
	public Node remove(int indx) {
		if(indx>=len || indx<0) return null;
		if(indx==0) {
			return removeFirst();
		}
		if(indx==len-1) {
			return removeLast();
		}
		Node prev = get(indx-1);
		Node temp = prev.next;
		prev.next = temp.next;
		temp.next = null;
		len-=1;
		return temp;
		
	}
	
	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node befor = null;
		
		for(int i=0;i<len;i++) {
			after = temp.next;
			temp.next = befor;
			befor = temp;
			temp = after;
		}
	}
	
	
	public void show() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void getHead() {
		if(head==null) System.out.println("Head : null");
		else System.out.println("Head : "+head.value);
	}
	
	public void getTail() {
		if(tail==null) System.out.println("Tail : null");
		System.out.println("Tail : "+tail.value);
	}
	
	public void getLength() {
		System.out.println("Length : "+len);
	}

}


//class Main{
//	public static void main(String[] arg) {
//		LinkedList<String> ll = new LinkedList<>("a");
//		
//		ll.append("b");
//		ll.append("c");
//		ll.append("d");
//		
//		ll.show();
//		ll.reverse();
//		ll.show();
//		
////		ll.prepend("!");
////		ll.prepend("@");
//		
////		ll.insert(3, "k");
////		ll.remove(3);
////		
////		System.out.println(ll.removeLast().value);
////		System.out.println(ll.removeFirst().value);
////		
////		System.out.println(ll.get(1).value);
//		
////		ll.getHead();
////		ll.getTail();
////		ll.getLength();
////		ll.show();
//		
//		
//		
//	}
//}
