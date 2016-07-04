public class IntList {

    int length;
    Node head;

    public IntList () {
        length = 0;
        head = null;
    }
    
    public IntList (Node node, int l) {
        length = l;
        head = node;
    }
    
    public void printBackward () {
        System.out.print ("(");
        if (head != null) {
            Node tail = head.next;
            Node.printBackward (tail);
            System.out.print (head);
        }
        System.out.println (")");
    }
    
    public void print () {// method written only for testing!
        this.reverse();
        this.printBackward();
        this.reverse();
    }
    
    public void addFirst (int i) {
        Node node = new Node (i, head);
        head = node;
        length++;
    }
    
    /*
     * Chapter 14 - Linked Lists
     * 
     * Beginning Chapter exercises,14.13
     */
    
    //14.1 a)
    public int removeFirst () {
        if (this.head == null) System.err.println("no more elements");
        int r= this.head.cargo;
        this.head = this.head.next;
        this.length--;
        return r;
    }
    
    //14.1 b)
    public void set (int i, int n) { // wrapper method
        if ( i >= this.length) return;
        else this.head.set(i, n);
    }
    
    //14.1 c)
    public void add (int i, int n) { // wrapper method
        if (this.head == null && i == 0) {
            this.head = new Node (n, null);
            this.length++;
            return;
        }
        if ( i > this.length) return;
        else if (i == this.length) {
            this.addLast(n);
        } else {
            this.length++;
            this.head= this.head.add(i, n);
        }
    }
    
    //14.1 d)
    public void addLast (int n) {
        this.length++;
        Node node = new Node (n, null);
        for (Node i = this.head; i != null; i = i.next) {
            if (i.next == null) {
                i.next = node;
                return;
            }
        }
        if (this.head == null) this.head = new Node (n, null);
    }
    
    //14.1 e)
    public void reverse () {
        IntList r = new IntList();
        while (this.length > 0) {
            int t = this.removeFirst();
            r.add(0, t);
        }
        this.length = r.length;
        this.head = r.head;
    }
    
    //14.1 f)
    public void append (IntList l) {
        this.length += l.length;
        for (Node i = this.head; i != null; i = i.next) {
            if (i.next == null) {
                i.next = l.head;
                return;
            }
        }
    }
    
    //14.1 g)
    public boolean checkLength () {//does work for looped lists!
        int c = 0;
        outer:
        for (Node i = this.head; i != null; i = i.next) {
            c++;
            if (i == i.next) break;
            for (Node j = this.head; j != i; j=j.next) {
                if (j == i.next) break outer;
            }
        }
        if (c == this.length) return true;
        return false;
    }
    
    //14.2
    public int compareList (IntList l) {// works only if each list represents a positive integer
        if (this.length > l.length) return 1;// this has more digits
        else if (this.length < l.length) return -1;// l has more digits
        else {// both have equal length
            this.reverse();
            l.reverse();
            for (Node i = this.head, j = l.head; i != null; i = i.next, j = j.next) {
                if (i.cargo > j.cargo) return 1;// this has greater value
                else if (i.cargo < j.cargo) return -1;// l has greater value
                //else next digit will get checked in the coming iteration
            }
            return 0;// for loop completion implies identical lists
        }
    }
}








