public class Tree {
    private static class Node {
        String value;
        Node left = null;
        Node right = null;
    }
    
    private Node root = null;
        
    //proxy add
    public void add(String value) {
        root = add( value, root );
    }
    
    private static Node add(String value, Node tree) {
        if( tree == null ) {    //base case
            tree = new Node();
            tree.value = value;
        }
        //left recursive case
        else if( value.compareTo(tree.value) < 0 )
            tree.left = add( value, tree.left );
        //right recursive case
        else if( value.compareTo(tree.value) > 0 )
            tree.right = add( value, tree.right );
        return tree;        
    }
    
    //proxy print
    public void print() {
        print( root );
    }
        
    private static void print(Node tree) {
        if( tree != null ) {
            print( tree.left );
            System.out.println( tree.value );
            print( tree.right );
        }
    }
}
