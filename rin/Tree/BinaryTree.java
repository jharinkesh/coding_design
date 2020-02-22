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
        //preOrder(root);
        //inOrder(root);
        //postOrder(root);
        System.out.println(findMax(root));

    }

    static int findMax(Node root){
        int max = 0;
        if(root!=null){
            max = root.key;
            int lmax = findMax(root.left);
            int rmax = findMax(root.right);
            int m = lmax>rmax?lmax:rmax;
            max = m>max?m:max;
        }
        return max;
    }

    static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+ " ");
        }
    }

    static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.key+ " ");
            inOrder(root.right);
        }
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

