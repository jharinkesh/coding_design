public class BinaryTree {

    public static void main(String... args){
        Node root = new Node(7);
        Node n1 = new Node(6);
        Node n2 = new Node(8);
        Node n3 = new Node(5);
        Node n4 = new Node(9);
        Node n5 = new Node(10);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n4.right = n5;
        //preOrder(root);
        //inOrder(root);
        //postOrder(root);
        // System.out.println(findMax(root));
        // System.out.println(search(root,81));
        // System.out.println(height(root));
        System.out.println(count(root));
    }

    static int count(Node root){
        if(root == null)
            return 0;
        int n1 = count(root.left);
        int n2 = count(root.right);
        return n1 + n2 + 1;
    }
    
    static int height(Node root){
        if(root == null ||(root.left == null && root.right == null) )
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        int max = lh>rh ? lh: rh;
        return max + 1;
    }

    static boolean search(Node root, int k){
        boolean found = false;
        if(root!=null){
            if(root.key == k)
                return true;
            return search(root.left,k) || search(root.right,k);
        }
        return found;
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

