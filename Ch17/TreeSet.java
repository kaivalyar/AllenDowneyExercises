import java.util.Iterator;
import java.util.Vector;

public class TreeSet extends SearchTree implements Set{
    TreeSet left, right;//, parent;
    
    public TreeSet (Comparable c, TreeSet l, TreeSet r) {
        this.cargo = c;
        this.left = l;
        this.right = r;
    }
    
    private TreeSet (Comparable c) {
        this.cargo = c;
    }
    
    public TreeSet () {
        
    }
    
    /*public boolean add2 (Comparable c) {
        /* *if (this.cargo == null) {
            this.cargo = c;
            return true;
        }
        if (this.contains(c)) return false;
        int decide = this.cargo.compareTo(c);
        //int c = t.cargo.compareTo(target);
        if (decide < 0) {// i.e. should be added to t.left
            if (this.left == null) {
                this.left = new TreeSet(c);
                return true;
            } else {
                /*int choice = this.left.cargo.compareTo(c);
                if (choice >= 0) {
                    TreeSet ts = new TreeSet(c, this.left, null);
                    this.left = ts;
                }* /
                return this.left.add(c);
            }
        } else if (decide > 0) {// i.e. should be added to t.right
            if (this.right == null) {
                this.right = new TreeSet(c);
                return true;
            } else {
                /*int choice = this.right.cargo.compareTo(c);
                if (choice <= 0) {
                    TreeSet ts = new TreeSet(c, null, this.right);
                    this.right = ts;
                }* /
                return this.right.add(c);
            }
        } else {
            return false;
        }** /
        if (c == null) {
            return false;
        }
        if (this.cargo == null) {
            this.cargo = c;
            return true;
        }
        if (this.contains(c)) {
            return false;
        }
        if (this.cargo.compareTo(c) > 0) {//leftwards
            boolean b = this.between(c, true);// is c between this and this.left
            if (b) {
                TreeSet temp = this.left;
                this.left = new TreeSet(c);
                this.left.left = temp;
                return true;
            } else {
                return this.left.add(c);
            }
        } else if (this.cargo.compareTo(c) < 0) {//rightwards
            boolean b = this.between(c, false);// is c between this and this.right
            if (b) {
                TreeSet temp = this.right;
                this.right = new TreeSet(c);
                this.right.right = temp;
                return true;
            } else {
                return this.right.add(c);
            }
        } else {
            return false;
        }
    }*/
    
    /* *
     * checks if c can be put to the immediate left or right of this, ie if it can be parent of this.left or this.right
     * /
    private boolean between (Comparable c, boolean left) {
        if (left) {
            if (this.left == null) return true;
            else {
                if (this.left.cargo.compareTo(c) > 0) {// can c be the parent of this.left?
                    return false;// ie move further left
                } else {
                    return true;
                }
            }
        } else {
            if (this.right == null) return true;
            else {
                if (this.right.cargo.compareTo(c) < 0) {// can c be the parent of this.right?
                    return false;// ie move further right
                } else {
                    return true;
                }
            }
        }
    }*/
    
    public boolean add (Comparable target) {
        if (target == null) {
            return false;
        }
        if (this.cargo == null) {
            this.cargo = target;
            return true;
        }
        int c = this.cargo.compareTo(target);
        if (c > 0) {// i.e. cargo is in t.left
            if (this.left == null) {
                this.left = new TreeSet(target);
                //this.left.parent = this;
                return true;
            }
            return this.left.add(target);
        } else if (c < 0) {// i.e. cargo is in t.right
            if (this.right == null) {
                this.right = new TreeSet(target);
                //this.right.parent = this;
                return true;
            }
            return this.right.add(target);
        } else {
            return false;
        }
    }
    
    //public boolean contains (Comparable c) {
        //INHERITED
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
    
    public boolean containsAll (Set set) {
        if (set == null) return true;
        if (set instanceof TreeSet) {
            TreeSet t = (TreeSet) set;
            if (!this.contains(t.cargo)) return false;
            if (!this.containsAll(t.left)) return false;                
            if (!this.containsAll(t.right)) return false;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean remove (Comparable target) {
        int c = this.cargo.compareTo(target);
        if (c > 0) {// i.e. cargo is in t.left
            if (this.left == null) return false;
            if (this.left.cargo.compareTo(target) == 0) {
                parent = this;
            }
            return this.left.remove(target);
        } else if (c < 0) {// i.e. cargo is in t.right
            if (this.right == null) return false;
            if (this.right.cargo.compareTo(target) == 0) {
                parent = this;
            }
            return this.right.remove(target);
        } else {
            // this.cargo = this.right.leftMost().cargo;
            remove(this);
            return true;
        }
    }
    private static TreeSet parent = null;
    
    public static void remove (TreeSet tree) {
        /**if (tree == null) return false;
        if (tree.cargo.compareTo(c) > 0) {// tree.right
            return remove(c, tree.right, tree);
        } else if (tree.cargo.compareTo(c) < 0) {// tree.left
            return remove(c, tree.left, tree);
        } else {
            tree.cargo = null;
            if (tree.left == null) {// connect parent to this.right
                if (parent.left == tree) {
                    parent.left = tree.right;
                } else {
                    parent.right = tree.right;
                }
            } else if (tree.right == null) {// connect parent to this.left
                if (parent.left == tree) {
                    parent.left = tree.left;
                } else {
                    parent.right = tree.left;
                }
            } else {
                //connect tree.right.leftmost to tree.left
                //     ie tree.right.leftmost.left = tree.left
                tree.right.leftMost().left = tree.left;
                System.out.println("Result\t" + tree.right);
            }
            return true;
        }**/
        if (parent == null) {
            tree.cargo = tree.right.leftMost().cargo;
            //System.err.println("found\t" + tree.cargo + "\t(root)");
            TreeSet lParent = tree;
            if (lParent.right == tree.right.leftMost()) {
                lParent.right = tree.right.leftMost().right;
            } else {
                lParent = tree.right;
                while (lParent.left != tree.right.leftMost()) {
                    lParent = lParent.left;
                }
                lParent.left = tree.right.leftMost().right;
            }
            /*System.err.println("###" + tree.toString() + "###");
            System.err.println("$$$" + tree.right.toString() + "$$$");
            copy(tree, tree.right);
            System.err.println("####" + tree.toString() + "####");
            System.err.println("$$$$" + tree.right.toString() + "$$$$");*/
        } else {
            //System.err.println("found\t" + tree.cargo + "\tparent: " + (((Token)(parent.cargo)).str));
            boolean left = (parent.left == tree);
            if (left) {// ie tree == parent.left
                if (tree.left == null) parent.left = tree.right;
                else if (tree.right == null) parent.left = tree.left;
                else {
                    tree.cargo = tree.right.leftMost().cargo;
                    //tree.right.remove(tree.right.leftMost().cargo);
                    TreeSet lParent = tree;
                    if (lParent.right == tree.right.leftMost()) {
                        lParent.right = tree.right.leftMost().right;
                    } else {
                        lParent = tree.right;
                        while (lParent.left != tree.right.leftMost()) {
                            lParent = lParent.left;
                        }
                        lParent.left = tree.right.leftMost().right;
                    }
                    //tree.right.leftMost().cargo = new Token("null");
                }
            } else {// tree == parent.right
                if (tree.left == null) parent.right = tree.right;
                else if (tree.right == null) parent.right = tree.left;
                else {
                    tree.cargo = tree.right.leftMost().cargo;
                    //tree.right.remove(tree.right.leftMost().cargo);
                    TreeSet lParent = tree;
                    if (lParent.right == tree.right.leftMost()) {
                        lParent.left = tree.right.leftMost().right;
                    } else {
                        lParent = tree.right;
                        while (lParent.left != tree.right.leftMost()) {
                            lParent = lParent.left;
                        }
                        lParent.left = tree.right.leftMost().right;
                    }
                    //tree.right.leftMost().cargo = new Token("null");
                }
            }
            parent = null;
        }
        ////return false;
    }
    
    private TreeSet leftMost() {
        if (this == null) return null;
        if (this.left == null) {
            return this;
        }
        else {
            return this.left.leftMost();
        }
    }
    
    public int size () {
        return this.size(0);
    }
    
    private int size (int count) {
        count++;
        if (this.left != null) count += this.left.size(0);
        if (this.right != null) count += this.right.size(0);
        return count;//this.left.size(0) + 1 + this.right.size(0);
    }
    
    public Iterator iterator () {
        Vector v = new Vector();
        helpIterator(this, v);
        return v.iterator();
    }
    
    private static void helpIterator (TreeSet tree, Vector v) {
        if (tree == null) return;
        
        //v.add(tree.left);
        //v.add(tree.right);
        helpIterator(tree.left, v);
        v.add(tree.cargo);
        helpIterator(tree.right, v);
    }
    
    //17.8
    public static TreeSet union (Set set1, Set set2) {
        TreeSet t1 = (TreeSet) set1;
        TreeSet t2 = (TreeSet) set2;
        TreeSet r = new TreeSet(t1.cargo);
        copy(r, t1.left);
        copy(r, t1.right);
        copy(r, t2);
        return r;
    }
    
    private static void copy (TreeSet copy, TreeSet t) { // copy t into copy
        if (t == null) return;
        if (copy != null) {
            copy.add((t.cargo));
        } else {
            copy = new TreeSet(t.cargo);
        }
        copy(copy, t.left);
        copy(copy, t.right);
    }
    
    //17.9
    public static TreeSet intersection (Set set1, Set set2) {
        TreeSet t1 = (TreeSet) set1;
        TreeSet t2 = (TreeSet) set2;
        TreeSet r = new TreeSet(null);
        copyCommon(r, t1, t2);
        return r;
    }
    
    private static void copyCommon (TreeSet copy, TreeSet t, TreeSet ref) { // copy t into copy if common with ref
        if (t == null) return;
        /*copy.add((t.cargo));
        copy(copy, t.left);
        copy(copy, t.right);*/
        if (ref.contains(t.cargo)) {
            //copy.add(t.cargo);
            if (copy != null) {
                if (copy.cargo == null) {
                    copy.cargo = t.cargo;
                } else {
                    copy.add((t.cargo));
                }
            } else {
                copy = new TreeSet(t.cargo);
            }
        }
        copyCommon(copy, t.left, ref);
        copyCommon(copy, t.right, ref);
    }
    
    public String toString () {
        String result = "";
        //result += " | ";
        if (this.cargo == null) result += "null";
        else result += this.cargo.toString();
        //result += "\n";
        //result += " | ";
        if (this.left != null) {
            //result += " | ";
            result += " " + this.left.toString();
            //result += " | ";
            //result += "\n";
        } else {
            //result += "\t";
            //result += "|";// CAN BE USED TO DECONSTRUCT THE ENTIRE TREE
            result += " ";
        }
        if (this.right != null) {
            //result += " | ";
            result += " " + this.right.toString();
            //result += " | ";
            //result += "\n";
        } else {
            //result += "\t";
            //result += "|";// CAN BE USED TO DECONSTRUCT THE ENTIRE TREE
            result += " ";
        }
        //System.out.println(result);
        result = result.replaceAll("   ", "  ");
        result = result.replaceAll("  ", " ");
        return result;
        //return this.left.toString() + " | " + this.cargo.toString() + " | " + this.right.toString();
    }
}