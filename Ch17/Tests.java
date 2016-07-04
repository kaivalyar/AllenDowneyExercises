import java.util.*;

class Tests {

    public static void test2 () {
        TreeSet t = new TreeSet();
        System.out.println( "Token\t" + "tok6\t" + t.add(new Token("tok6")));
        System.out.println( "Token\t" + "tok2\t" + t.add(new Token("tok2")));
        System.out.println( "Token\t" + "tok0\t" + t.add(new Token("tok0")));
        System.out.println( "Token\t" + "tok4\t" + t.add(new Token("tok4")));
        System.out.println( "Token\t" + "tok9\t" + t.add(new Token("tok9")));
        System.out.println( "Token\t" + "tok6\t" + t.add(new Token("tok6")));
        System.out.println( "Token\t" + "tok6\t" + t.add(new Token("tok6")));
        System.out.println( "Token\t" + "tok7\t" + t.add(new Token("tok7")));
        System.out.println( "Token\t" + "tok9.8\t" + t.add(new Token("tok9.8")));
        System.out.println( "Token\t" + "tok6.5\t" + t.add(new Token("tok6.5")));
        System.out.println( "Token\t" + "tok4.7\t" + t.add(new Token("tok4.7")));
        System.out.println(t);
        Iterator it = t.iterator();
        int j = 1;
        while (it.hasNext()) {
            System.out.println(" " + j + " * " + it.next());
            j++;
        }
        System.out.println("\n");
        System.out.println(t);
        System.out.println("\n");
        System.out.println("Token\t" + "tok2\t" + t.remove(new Token("tok2")));
        System.out.println(t);
        System.out.println("Token\t" + "tok4.7\t" + t.remove(new Token("tok4.7")));
        System.out.println(t);
        System.out.println("Token\t" + "tok6\t" + t.remove(new Token("tok6")));
        System.out.println(t);
        Iterator it2 = t.iterator();
        int i = 1;
        while (it2.hasNext()) {
            System.out.println(" " + i + " * " + it2.next());
            i++;
        }
        System.out.println(t);
    }
    
    public static TreeSet test1 () {
        Token t1 = new Token ("tok1");
        Token t2 = new Token ("tok2");
        Token t3 = new Token ("tok3");
        Token t4 = new Token ("tok4");
        Token t5 = new Token ("tok5");
        Token t6 = new Token ("tok7");
        Token t7 = new Token ("tok8");
        TreeSet tr1 = new TreeSet (t1, null, null);
        TreeSet tr3 = new TreeSet (t3, null, null);
        TreeSet tr5 = new TreeSet (t5, null, null);
        TreeSet tr7 = new TreeSet (t7, null, null);
        TreeSet tr2 = new TreeSet (t2, tr3, tr1);
        TreeSet tr6 = new TreeSet (t6, tr7, tr5);
        
        //System.out.println(TreeSet.union(tr2, tr6));
        TreeSet tree = new TreeSet (t4, tr6, tr2);
        /*System.out.println(TreeSet.intersection(tree, tr6));*/
        /*System.out.println(tree);
        System.out.println(tree.size());
        System.out.println(tr1.size());
        System.out.println(tr2.size());
        tree.add(new Token("tok0"));
        System.out.println(tree);
        tree.add(new Token("tok8"));
        System.out.println(tree);
        System.out.println(new Token("tok8"));
        System.out.println(tree.contains(new Token("tok8")));
        System.out.println(t6);
        System.out.println(tree.contains(t6));
        System.out.println();
        System.out.println(tree.containsAll(tr6));
        System.out.println(tree.size());
        tree.remove(t3);
        System.out.println(tree);*/
        System.out.println(tree);
        tree.add(new Token("tok6"));
        System.out.println(tree);
        TreeSet result = null;
        //TreeSet.remove(new Token("tok6"), tree, null, result, false);//Comparable c, TreeSet ts, TreeSet parent, TreeSet result, boolean left)
        ////System.out.println("removal successful?\t" + TreeSet.remove(new Token("tok6"), tree, null));
        //System.out.println(tree);
        //System.out.println("removal successful?\t" + TreeSet.remove(new Token("tok7"), tree, null));
        //System.out.println(tree);
        return tree;
    }
    
    /**
     * if (!this.contains(c)) return false;
        //if (this.cargo.compareTo(c) == 0) {
        //    this.cargo = null;
        //} else {
            /*String s1 = "", s2 = "";
            if (this.left == null) {
                s1 = "null";
            } else {
                s1 = this.left.toString();
            }
            if (this.right == null) {
                s2 = "null";
            } else {
                s2 = this.right.toString();
            }
            System.out.println("\nleft: \t" + s1 + "\nright: \t" + s2);* /
            /*
        boolean t1 = false;
        if (this.left != null) t1 = this.left.remove(c);
        boolean t2 = false;
        if (this.right != null) t2 = this.right.remove(c);
        
        return (t1 || t2);* /
        //}
        //return false;
        //if (! this.cargo.equals(c)) result.add(this.cargo);
        TreeSet tr = null;
        boolean result = false;
        Iterator it = this.iterator();
        //Iterator it = vector.iterator ();
        while (it.hasNext()) {
            Comparable temp = (Comparable) it.next();
            if (temp.compareTo(c) == 0) {
                result = true;
            } else {
                add(tr, temp);
            }
        }
        //this = tr;
        return result;
        
        public void remove (TreeSet tree, TreeSet parent, boolean l/*left* /, Comparable c) {
        /*int decision = tree.cargo.compareTo(c);
        if (decision == 0) {
            /*
             * connect parent to grandchildren:
             * /
            if (l) parent.left = null;
            else parent.right = null;
            
        } else if (decision < 0) {// tree.left
            remove (tree.left, tree, true, c);
            //return;
        } else if (decision > 0) {// tree.right
            remove (tree.right, tree, false, c);
            //return;
        }* /
    }
    
    static TreeSet tobeReturned = null;
    public static boolean remove (Comparable c, TreeSet ts, TreeSet parent, boolean left) {
        if (ts.cargo.compareTo(c) == 0) {
            //ts.cargo = null;
            if (parent == null) {
                if (ts.right != null) {
                    TreeSet i = ts.right;
                    while (i.left != null) {
                        i = i.left;
                    }
                    i.left = ts.left;
                    //TreeSet toBeReturned = ts.right;
                    //result = ts.right;
                    return true;
                } else {
                    //TreeSet toBeReturned = ts.left;
                    result = ts.left;
                }
            } else {
                if (ts.right != null) {
                    TreeSet i = ts.right;
                    while (i.left != null) {
                        i = i.left;
                    }
                    i.left = ts.left;
                    if (left) {
                        parent.left = ts.right;
                        result = parent;
                    } else {
                        parent.right = ts.right;
                        result = parent;
                    }
                    return true;
                } else {
                    if (left) {
                        parent.left = ts.right;
                        result = parent;
                    } else {
                        parent.right = ts.right;
                        result = parent;
                    }
                }
            }
            return true;
        } else {
            return (remove(c, ts.left, ts, result, true) || remove(c, ts.right, ts, result, false));
        }
    }
    
    
    public static boolean remove (TreeSet t, Comparable c) {
        TreeSet tr = null;
        boolean result = false;
        Iterator it = t.iterator();
        //Iterator it = vector.iterator ();
        Comparable temp;
        while (it.hasNext()) {
            temp = (Comparable) it.next();
            if (temp.compareTo(c) == 0) {
                result = true;
            } else {
                if (tr == null) {
                    tr = new TreeSet(temp);
                } else {
                    tr.add(temp);
                }
            }
        }
        System.out.println("t\t" + t.toString());
        System.out.println("tr\t" + tr.toString());
        //t = tr;
        t = null;
        copy(t, tr);
        System.out.println("t\t" + t.toString());
        System.out.println("tr\t" + tr.toString());
        return result;
    }
    
    /*public boolean remove (Comparable c, TreeSet t) {
        return false;
    }* /
        
        
     */
}