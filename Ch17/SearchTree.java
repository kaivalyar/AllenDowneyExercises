public class SearchTree { //Should actually extend ComparableTree
    Comparable cargo;
    SearchTree left, right;
    
    protected SearchTree () {
        //System.err.println("error");
        //System.exit(0);
    }
    
    public SearchTree (Comparable c, SearchTree l, SearchTree r) {
        this.cargo = c;
        this.left = l;
        this.right = r;
    }
    
    //17.6
    public static boolean contains (SearchTree t, Comparable target) {
        if (t == null) return false;
        int c = t.cargo.compareTo(target);
        if (c > 0) {// i.e. cargo is in t.left
            return contains(t.left, target);
        } else if (c < 0) {// i.e. cargo is in t.right
            return contains(t.right, target);
        } else {
            return true;
        }
    }
    
    // OO version:
    public boolean contains (Comparable target) {
        int c = this.cargo.compareTo(target);
        if (c > 0) {// i.e. cargo is in t.left
            if (this.left == null) return false;
            return this.left.contains(target);
        } else if (c < 0) {// i.e. cargo is in t.right
            if (this.right == null) return false;
            return this.right.contains(target);
        } else {
            return true;
        }
    }
}
