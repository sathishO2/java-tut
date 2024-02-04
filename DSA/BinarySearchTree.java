
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
	
	// recursive methods
	
	private boolean rContains(Node root,int value) {
		if(root == null) return false;
		if(root.value == value) return true;
		
		if(root.value > value) {
			return rContains(root.left,value);
		}else {
			return rContains(root.right,value);
		}
	}
	
	public boolean rContains(int value) {
		return rContains(root,value);
	}
	
	
	
	private Node rInsert(Node cnode,int value) {
		if(cnode == null ) return new Node(value);
		if(value < cnode.value) {
			cnode.left = rInsert(cnode.left,value);
		}else {
			cnode.right = rInsert(cnode.right,value);
		}
		
		return cnode;
	}
	
	public void rInsert(int value) {
		if(root == null) root = new Node(value);
		rInsert(root,value);
	}
	
	public Node rDelete(Node cnode,int value) {
		if(cnode == null ) return null;
		
		if(value > cnode.value) {
			cnode = rDelete(cnode.right,value);
		}else if(value < cnode.value) {
			cnode = rDelete(cnode.left,value);
		}else {
			if(cnode.left==null && cnode.right==null) return null;
			else if(cnode.left == null) cnode = cnode.right;
			else if(cnode.right == null) cnode = cnode.left;
			else {
				int subTreeMin = min(cnode.right);
				cnode.value = subTreeMin;
				cnode.right = rDelete(cnode.right,subTreeMin);
			}
			
		}
		
		return cnode;
	}
	
	public void rDelete(int value) {
		rDelete(root,value);
	}
	
	public int min(Node node) {
		while(node.left != null) {
			node = node.left;
		}
		return node.value;
	}
	
}


//class Main{
//	public static void main(String[] args) {
//		
//		BinarySearchTree bst = new BinarySearchTree();
//		
////		bst.insert(47);
////		bst.insert(21);
////		bst.insert(76);
////		bst.insert(18);
////		bst.insert(27);
////		bst.insert(52);
////		bst.insert(82);
//		
//		bst.insert(2);
//		bst.insert(1);
//		bst.insert(3);
//		
//		System.out.println("before: ");
//		System.out.println("Root : "+bst.root.value);
//		System.out.println("Left : "+bst.root.left.value);
//		System.out.println("Right : "+bst.root.right.value);
//		
//		
//		bst.rDelete(2);
//		
//		System.out.println("before: ");
//		System.out.println("Root : "+bst.root.value);
//		System.out.println("Left : "+bst.root.left.value);
//		System.out.println("Right : "+bst.root.right);
//		
//		
//	}
//}



