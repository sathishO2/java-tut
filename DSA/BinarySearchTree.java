
public class BinarySearchTree {
	
	Node root;
	
	class Node{
		int value;
		Node left;
		Node right;
	
		Node(int value){
			this.value = value;
		}
		
	}
	
	public boolean insert(int value) {
		Node nnode = new Node(value);
		if(root == null) {
			root = nnode;
			return true;
		}
		Node temp = root;
		while(true) {
			if(temp.value == nnode.value) return false;
			if(temp.value > nnode.value) {
				if(temp.left == null) {
					temp.left = nnode;
					return true;
				}
				temp = temp.left;
			}else {
				if(temp.right==null) {
					temp.right = nnode;
					return true;
				}
				temp = temp.right;
			}
		}
	}
	
	public boolean contains(int value) {
		if(root==null) return false;
		Node temp = root;
		while(temp!=null) {
			if(temp.value>value) {
				temp = temp.left;
			}else if(temp.value<value){
				temp = temp.right;
			}else {
				return true;
			}
		}
		return false;
	}

}


//class Main{
//	public static void main(String[] args) {
//		BinarySearchTree bst = new BinarySearchTree();
//		
//		bst.insert(2);
//		bst.insert(1);
//		bst.insert(3);
//		
//		System.out.println(bst.root.value);
//		System.out.println(bst.root.right.value);
//		System.out.println(bst.root.left.value);
//		
//	}
//}
