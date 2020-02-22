package assignmentthree;

public class SearchTree {
	
	public static void main(String[] args) {
		Node root = new Node(7);
		Node n1 = new Node(6);
		Node n2 = new Node(8);
		Node n3 = new Node(5);
		Node n4 = new Node(9);
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		//preOrder(root);
		int key = 10;
		search(key, root);
	}
	static void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	static void search(int key,Node root) {
		if(root!=null) {
			if(key==root.data) {
				System.out.println("true");
			}
			search(key,root.left);
			search(key,root.right);
		}
		
	}

}

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
