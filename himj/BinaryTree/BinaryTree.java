package BinaryTree;

public class BinaryTree {
	 public Node root;

	  public BinaryTree() {
	  }
	  
	  public boolean isEmpty() {
	    return root ==null;
	  }
	  
	  //Add Node to a tree
	  public void insert(int value) {
	    this.root = addRecursive(root,value);
	  }
	  
	  // Calling by insert method internally
	  private Node addRecursive(Node current, int value) {
	    if(current == null) {
	      return new Node(value);
	    }
	    if(value < current.value) {
	      current.left = addRecursive(current.left, value);
	    }
	    else if(value > current.value) {
	      current.right = addRecursive(current.right, value);
	    }
	    else {
	      return current;
	    }
	 
	    return current;
	  }
	  
	  // search a node value in binary search tree
	  public boolean search(int value) {
	    return search(root,value);
	  }

	  // private method of search method
	  private boolean search(Node rootElement, int value) {
	    // TODO Auto-generated method stub
	    if(rootElement.value == value) {
	      return true;
	    }
	    if(rootElement.left != null) {
	      if(search(rootElement.left,value))
	      return true;
	    }
	    if(rootElement.right != null) {
	      if(search(rootElement.right,value))
	        return true;
	    }
	    return false;
	  }
	  
	  // preorder traversal
	  public void preorder() {
	    preorder(root);
	  }
	  
	  private void preorder(Node node) {
	    if(node != null) {
	      System.out.print(node.value+" ");
	      preorder(node.left);
	      preorder(node.right);
	    }
	 
	  }
	  
	  // inorder traversal
	  public void inorder() {
	    inorder(root);
	  }
	  
	  private void inorder(Node node) {
	    if(node != null) {
	      inorder(node.left);
	      System.out.print(node.value+" ");
	      inorder(node.right);
	    }
	   
	  }
	  
	  // postorder traversal
	  public void postorder() {
	    postorder(root);
	  }
	  
	  private void postorder(Node node) {
	    if(node != null) {
	      postorder(node.left);
	      postorder(node.right);
	      System.out.print(node.value+" ");
	    }
	  }
	
	  public int countNodes()
	  {
	      return countNodes(root);
	  }
	  
	  private int countNodes(Node node) {
	    if (node == null)
	      return 0;
	  else
	    {
	      int l = 1;
	      l += countNodes(node.getLeft());
	      l += countNodes(node.getRight());
	      return l;
	    }
	  }
	  
	  @Override
	  public String toString() {
	    return "BinaryTree [root=" + root + "]";
	  }
	}