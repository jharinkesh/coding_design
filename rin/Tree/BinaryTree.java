public class BinaryTree {

    public static void main(String... args){
        Node root = new Node(7);
        Node n1 = new Node(6);
        Node n2 = new Node(8);
        Node n3 = new Node(5);
        Node n4 = new Node(9);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        preOrder(root);

    }

    static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

}

class Node {
    int key;
    Node left;
    Node right;
    public Node(int data){
        this.key = data;
    }
}

