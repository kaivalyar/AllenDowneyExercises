import java.util.StringTokenizer;

//15.2 a)
public class LinkedList {

    int length;
    Node head;

    public LinkedList () {
        length = 0;
        head = null;
    }

    public LinkedList (Node node, int l) {
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

    public void addFirst (Object i) {
        Node node = new Node (i, head);
        head = node;
        length++;
    }

    public Object removeFirst () {
        Object r= this.head.cargo;
        this.head = this.head.next;
        this.length--;
        return r;
    }

    public void set (int i, Object n) { // wrapper method
        if ( i >= this.length) return;
        else this.head.set(i, n);
    }

    public void add (int i, Object n) { // wrapper method
        if (this.head == null && i == 0) {
            this.head = new Node (n, null);
            this.length++;
            return;
        }
        if ( i >= this.length) return;
        else {
            this.length++;
            this.head= this.head.add(i, n);
        }
    }

    public void addLast (Object n) {
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

    public void reverse () {
        LinkedList r = new LinkedList();
        while (this.length > 0) {
            Object t = this.removeFirst();
            r.add(0, t);
        }
        this.length = r.length;
        this.head = r.head;
    }

    public void append (LinkedList l) {
        this.length += l.length;
        for (Node i = this.head; i != null; i = i.next) {
            if (i.next == null) {
                i.next = l.head;
                return;
            }
        }
    }

    public boolean checkLength () {//doesn't work for looped lists!
        int c = 0;
        for (Node i = this.head; i != null; i = i.next) {
            c++;
        }
        if (c == this.length) return true;
        return false;
    }

    //15.2 b)
    public LinkedList split (String s) {
        StringTokenizer st = new StringTokenizer(s);
        for (int i = 0;i < st.countTokens(); i++) {
            this.addFirst(null);
        }
        for (Node i = this.head; st.hasMoreTokens(); i = i.next) {
            i.cargo = st.nextToken();
        }
        return this;
    }

    //15.2 c)
    public String join () {
        String r = " ";
        for (Node i = this.head; i!=null; i = i.next) {
            r+= " " + (String)i.cargo;
        }
        return r.replaceAll("  ", "");
    }

    //15.2 d)
    public String toString () {
        String r = "(";
        for (Node i = this.head; i!=null; i = i.next) {
            r += i.cargo.toString();
            if (i.next != null) r += ", ";
        }
        return r + ")";
    }

    /**
     * Exercise 16.5 Write an object method for the LinkedList class named maximum
     * that can be invoked on a LinkedList object, and that returns the largest cargo object
     * in the list, or null if the list is empty.
     * You can assume that every cargo element belongs to a class that belongs to the meta-
     * class Comparable, and that any two elements can be compared to each other.
     */
    public Object maximum () {
        if (this.length == 0) return null;
        //else if (this.length == 1) return this.head;
        Object hold = this.head.cargo;
        for (Node i = this.head.next; i != null; i = i.next) {
            if ( ((Comparable)(i.cargo)).compareTo(hold) > 0) hold = i.cargo;
        }
        return hold;
    }
}