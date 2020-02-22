package assignmentthree;

import java.util.LinkedList;

public class LevelOrder {

	public static void main(String[] args) {
		Node root = new Node(11);
		Node n1 = new Node(9);
		Node n2 = new Node(6);
		Node n3 = new Node(5);
		Node n4 = new Node(8);
		Node n5 = new Node(30);
		
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.right = n5;
		//preOrder(root);
		leveOrder(root);
		
	}
	static void leveOrder(Node root) {
		LinkedList<Node> q = new LinkedList();
		q.add(root);
		while(!q.isEmpty()) {
			Node e = q.poll();
			System.out.println(e.data);
			if(e.left!=null) {
				q.add(e.left);
			}
			if(e.right!=null) {
				q.add(e.right);
			}
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
