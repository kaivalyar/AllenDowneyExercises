/**
 * 16.4
 * 
 * @author Kaivalya Rawal
 * @version 1.0
 */
public class SortedList extends LinkedList {
    
    /*public SortedList () {
        
    }*/

    /**Exercise 16.4 Write a class definition for SortedList, which extends LinkedList.
     * A SortedList is similar to a LinkedList; the difference is that the elements have to be
     * Comparable, and the list is sorted in decreasing order.
     * Write an object method for SortedList called add that takes a Comparable as a
     * parameter and that adds the new object into the list, at the appropriate place so that
     * the list stays sorted.
     * If you want, you can write a helper method in the Node class.
     */
    public void add (Comparable c) {
        this.length++;
        Node n = new Node(c, null);
        if (this.head == null) {
            this.head = n;
            return;
        } else if (this.head.next == null) {
            if ( ((Comparable)(this.head.cargo) ).compareTo(c) < 0) this.head.next = n;
            else {
                n.next = this.head;
                this.head = n;
            }
            return;
        }
        if ( ((Comparable)(this.head.cargo)).compareTo(c) >= 0) {
            n.next = this.head;
            this.head = n;
            return;
        }
        for (Node i = this.head; i.next!= null; i = i.next) {
            int comp1 = ((Comparable)(i.cargo)).compareTo(c);
            int comp2 = ((Comparable)(i.next.cargo)).compareTo(c);
            if (comp1 <= 0 && comp2 >= 0) {
                n.next = i.next;
                i.next = n;
                return;
            }
        }
        for (Node i = this.head; i!= null; i = i.next) {
            if (i.next == null) {
                i.next = n;
                return;
            }
        }
    }
    /*
    public static SortedList y () {
        SortedList eq = new SortedList();
        eq.add("1");
        eq.add("2");
        eq.add("3");
        eq.add("4");
        return eq;/*
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());*
    }*/
}
