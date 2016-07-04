public class ComparableTree {
    Comparable cargo;
    ComparableTree left, right;
    
    public ComparableTree (Comparable c, ComparableTree l, ComparableTree r) {
        this.cargo = c;
        this.left = l;
        this.right = r;
    }
    
    //17.5
    public static Comparable findMax (ComparableTree t) {
        if (t == null) return null;
        //Comparable result;
        Comparable largest = t.cargo;
        if (t.left != null) {
            Comparable c = findMax(t.left);
            int x = c.compareTo(largest);
            if (x < 0) largest = c;
        }
        if (t.right != null) {
            Comparable c = findMax(t.right);
            int x = c.compareTo(largest);
            if (x < 0) largest = c;
        }
        /*int c1 = t.cargo.compareTo(findMax(t.left));
        int c2 = t.cargo.compareTo(findMax(t.right));
        int c3 = findMax(t.right).compareTo(findMax(t.left));*/
        // assume convention: -ve means first tree was greater
        
        return largest;
    }
    
    /*public static void printInorder (Tree tree) {
        if (tree == null) return;
        printInorder (tree.left);
        System.out.print (tree + " ");
        printInorder (tree.right);
    }
    
    private int helpFindMax (ComparableTree t, ComparableTree l, ComparableTree r) {
        
    }
    
    public static int height (Tree t) {
        if (t == null) return -1;
        else return (1 + (Math.max( height(t.left) , height(t.right) )));
    }*/
}
