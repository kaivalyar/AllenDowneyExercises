/**
 * Exercise 18.7 Write an implementation of a Heap based on the array implementa-
 * tion of a tree. The run time of the add and remove operations should be proportional
 * to log n, where n is the number of elements in the Heap.
 */
class Heap {
    Comparable [] ar;
    //int size;
    //int max;
    final static int root = 1;
    
    public Heap () {
        ar = new Comparable[128];
        //size = 0;
        //max = 0;
        //root = 0;
    }
    
    public Comparable getCargo (int i) {
        try {
            return ar[i];
        } catch (Exception e) {
            return null;
        }
    }
    
    private void setCargo (int i, Comparable obj) {
        //if (max < i) max = i;
        //if (obj == null && i == max) {
        //    max = this.getParent(i);
        //}
        //if (root == 0) root = i;
        ar[i] = obj;
    }
    
    public int getLeft (int i) {
        return 2*i;
    }
    
    public int getRight (int i) {
        return 2*i + 1;
    }
    
    public int getParent (int i) {
        return i/2;
    }
    
    public void add (Comparable o) {
        /*int i = 1; // root; FINDING THE RIGHT MOST NODE
        while (this.getCargo(this.getRight(i)) != null) {
            i = this.getRight(i);
        }* /// the rightmost node is at max
        int i = 1;
        int index = -1;
        while (i <= max+1) {
            if (this.ar[i] != null) index = i;
        }
        this.setCargo(index, o);
        this.reheapify(index);*/
        for (int i = 1; i < this.ar.length; i++) {
            if (ar[i] == null) {
                this.setCargo(i, o);
                this.trickleUp(i);
                break;
            }
        }
    }
    
    private void trickleUp (int i) {
        if (i == root) return;
        int p = this.getParent(i);
        if (this.getCargo(i).compareTo(this.getCargo(p)) > 0) {
            Comparable t = this.getCargo(p);
            this.setCargo(p, this.getCargo(i));
            this.setCargo(i, t);
            trickleUp(p);
        }
    }
    
    /*public void reheapify (int i) {
        if (i == 0 || i == 1) return;
        int p = this.getParent(i);
        if (this.getCargo(i).compareTo(this.getCargo(p)) > 0) {
            Comparable temp = this.getCargo(i);
            this.setCargo(i, this.getCargo(p));
            this.setCargo(p, temp);
            reheapify(p);
        }
    }
    
    public void reHeapify (int i) {
        if (i == max) return;
        int r = this.getRight(i);
        if (this.getCargo(i).compareTo(this.getCargo(r)) < 0) {
            Comparable temp = this.getCargo(i);
            this.setCargo(i, this.getCargo(r));
            this.setCargo(r, temp);
            reHeapify(r);
        }
    }*/
    
    public Comparable remove () {
        /*Comparable result = this.getCargo(root);
        this.setCargo(root, this.getCargo(max));
        this.setCargo(max, null);
        this.reHeapify(root);
        return result;*/
        for (int i = ar.length-1; i > 0; i--) {
            if (this.getCargo(i) != null) {
                Comparable result = this.getCargo(root);
                this.setCargo(root, this.getCargo(i));
                this.setCargo(i, null);
                trickleDown(root);
                return result;
            }
        }
        return null;
    }
    
    private void trickleDown (int i) {
        if (ar[i] == null) return;
        int r = this.getRight(i);
        int l = this.getLeft(i);
        if (ar[r] == null && ar[l] == null) return;
        if (ar[r] == null || this.getCargo(l).compareTo(this.getCargo(r)) > 0) {
            Comparable temp = this.getCargo(l);
            this.setCargo(l, this.getCargo(i));
            this.setCargo(i, temp);
            trickleDown(l);
        } else {
            Comparable temp = this.getCargo(r);
            this.setCargo(r, this.getCargo(i));
            this.setCargo(i, temp);
            trickleDown(r);
        }
    }
    
    /**
     * Exercise 18.1 Write a method that takes a Tree as a parameter and checks whether
     * it is complete.
     */
    public boolean isComplete () {
        if (this.ar[root] == null) return true;
        int li = -1;
        for (int i = this.ar.length-1; i > 0; i--) {
            if (this.ar[i] != null) {
                li = i+1;
                break;
            }
        }
        for (int i = 1; i < this.ar.length; i++) {
            if (this.ar[i] == null) {
                if (i == li) return true;
                else return false;
            }
        }
        return false;// impossible to reach?
    }
    
    /**
     * Exercise 18.2 Write a method that takes a Tree as a parameter and checks whether
     * it has the heap property.
     */
    public boolean isHeap () {
        return (isHeap(this, this.getCargo(root), root));
    }
    
    private static boolean isHeap (Heap h, Comparable max, int i) {
        if (h.ar[i] == null) return true;
        if (h.getCargo(i).compareTo(max) > 0) return false;
        return (isHeap(h, h.getCargo(i), h.getLeft(i)) && isHeap(h, h.getCargo(i), h.getLeft(i)));
    }
}










