class Node {
    int val;
    Node left;
    Node right;
    Node(int x) { val = x; }
}
public class SymmetricOrNot {

    // Definition for a binary tree node.
    
    public static boolean isSymmetric(Node root) {
        if(root == null) return true;
        return isSymmetricHelper(root.left, root.right);
    }
    public static boolean isSymmetricHelper(Node leftMost, Node rightMost){
        if(leftMost==null && rightMost==null)
            return true;
        if(leftMost==null || rightMost==null)
            return false;
        if(isSymmetricHelper(leftMost.left,rightMost.right) &&
                isSymmetricHelper(leftMost.right,rightMost.left)) {
            if(leftMost.val == rightMost.val)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(2);
        node.left.right = new Node(3);
        node.right.right = new Node(3);

        System.out.println(isSymmetric(node));
    }
    /*
            1
         2     2
      n    3  n   3
    */
}
