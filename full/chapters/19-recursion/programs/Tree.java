public class Tree {
    private static class Node {
        public String value;
        public Node left = null;
        public Node right = null;
    }
    
    private Node root = null;
        
    // Proxy add
    public void add(String value) {
        root = add(value, root);
    }
    
    private static Node add(String value, Node tree) {
        if(tree == null) { // Base case <.>
            tree = new Node();
            tree.value = value;
        }
        // Left recursive case    <.>
        else if(value.compareTo(tree.value) < 0)
            tree.left = add(value, tree.left);
        // Right recursive case   <.>
        else if(value.compareTo(tree.value) > 0)
            tree.right = add(value, tree.right);
        return tree; 			  //<.>
    }
    
    // Proxy print
    public void print() {
        print(root);
    }
        
    private static void print(Node tree) {
        if(tree != null) {
            print(tree.left); 				//<.>
            System.out.println(tree.value);	//<.>
            print(tree.right);				//<.>
        }
    }
}
