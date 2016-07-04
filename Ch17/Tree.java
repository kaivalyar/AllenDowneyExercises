import java.util.Vector;

public class Tree {
    Visitable cargo;
    Tree left, right;
    
    public Tree (Visitable c, Tree l, Tree r) {
        this.cargo = c;
        this.left = l;
        this.right = r;
    }
    
    public static void print (Tree tree) {
        if (tree == null) return;
        System.out.print (tree + " ");
        print (tree.left);
        print (tree.right);
    }
    
    public static void printPostorder (Tree tree) {
        if (tree == null) return;
        printPostorder (tree.left);
        printPostorder (tree.right);
        System.out.print (tree + " ");
    }
    
    public static void printInorder (Tree tree) {
        if (tree == null) return;
        printInorder (tree.left);
        System.out.print (tree + " ");
        printInorder (tree.right);
    }
    
    // 17.1
    public static void visitPreorder (Tree t) {
        if (t == null) return;
        t.cargo.visit();
        visitPreorder(t.left);
        visitPreorder(t.right);
    }
    
    //17.2
    public static PreIterator preorderIterator (Tree t) {
        Vector v = new Vector();
        helpPreIterator(t, v);
        return new PreIterator(v);
    }
    
    private static void helpPreIterator (Tree tree, Vector v) {
        if (tree == null) return;
        v.add(tree.cargo);
        //v.add(tree.left);
        //v.add(tree.right);
        helpPreIterator(tree.left, v);
        helpPreIterator(tree.right, v);
    }
    
    //17.3
    /*
     * a) 9
     * b) 2 3 * 1 +                 |               1 2 3 * +
     * c) 3
     */
    
    /**/
    
    //17.4 
    public static int height (Tree t) {
        if (t == null) return 0;
        else return (1 + (Math.max( height(t.left) , height(t.right) )));
    }
    
    //17.5 (actaully requires a new class, with Comparables instead of Visitables)
    /*
     * DONE IN ComparableTree.java - [NOT COMPLETE YET]
     */
    
    //17.7 (actaully requires a new class, with Comparables instead of Visitables)
    /*
     * DONE IN SearchTree.java
     */
    
    //17.8
    /*
     * DONE IN TreeSet.java
     */
    
    //17.9
    /*
     * DONE IN TreeSet.java
     */
    
    
}


























