public class IntegerTree {
    private static class Node {
        Integer value;
        Node left = null;
        Node right = null;
    }
    
    private Node root = null;
        
    // Proxy add
    public void add(Integer value) {
        root = add(value, root);
    }
    
    private static Node add(Integer value, Node tree) {
        if(tree == null) { // Base case
            tree = new Node();
            tree.value = value;
        }
        // Left recursive case
        else if(value.compareTo(tree.value) < 0)
            tree.left = add(value, tree.left);
        // Right recursive case
        else if(value.compareTo(tree.value) > 0)
            tree.right = add(value, tree.right);
        return tree;        
    }
    
    // Proxy print
    public void print() {
        print(root);
    }
        
    private static void print(Node tree) {
        if(tree != null) {
            print(tree.left);
            System.out.println(tree.value);
            print(tree.right);
        }
    }
}
