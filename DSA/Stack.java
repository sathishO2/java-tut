
public class Stack<T> {
	Node top;
	int len;
	
	class Node{
		T value;
		Node next;
		Node(T value){
			this.value = value;
		}
	}
	
	Stack(T value){
		Node nnode = new Node(value);
		top = nnode;
		len = 1;
	}
	
	public void push(T value) {
		Node nnode = new Node(value);
		if(len==0) {
			top = nnode;
		}
		else {
			nnode.next = top;
			top = nnode;
		}
		len+=1;
	}
	
	public Node pop() {
		if(len==0) return null;
		Node temp = top;
		top = temp.next;
		temp.next = null;
		len-=1;
		return temp;
	}
	
	public void show() {
		Node temp = top;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public void getTop() {
		if(top!=null) System.out.println("Top : "+top.value);
		else System.out.println("Top : null");
	}
	public void getLength() {
		System.out.println("Length : "+len);
	}
	
}


//class Main{
//	public static void main(String[] args) {
//		Stack<Character> st = new Stack<>('a');
//		st.push('b');
//		st.push('c');
//		st.push('d');
//		st.push('e');
//		
//		st.pop();
//		st.pop();
//		st.pop();
//
//		st.show();
//		st.getTop();
//		st.getLength();
//	}
//}
