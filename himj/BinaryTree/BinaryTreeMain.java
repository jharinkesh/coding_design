package BinaryTree;

public class BinaryTreeMain {
	 public static void main(String[] args) {
		    BinaryTree bt = new BinaryTree();
		    System.out.println("Binary tree is empty = "+bt.isEmpty());
		    System.out.println("Count Nodes = "+bt.countNodes());
		    bt.insert(5);
		    bt.insert(3);
		    bt.insert(1);
		    bt.insert(9);
		    bt.insert(10);
		    bt.insert(4);
		    System.out.println("Binary tree is empty = "+bt.isEmpty());
		    System.out.println("Count Nodes = "+bt.countNodes());
		    System.out.println("search for element "+3+" = "+bt.search(3));
		    System.out.println("preorder traversal");
		    bt.preorder();
		    System.out.println();
		    System.out.println("inorder traversal");
		    bt.inorder();
		    System.out.println();
		    System.out.println("postorder traversal");
		    bt.postorder();
		  }
}
