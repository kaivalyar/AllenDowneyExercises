/**
 * Class for Sample Output generation.
 */
import java.util.*;
public class Main {
    public static void main (String[] args) throws Exception{
        System.out.println("BEGINNING SAMPLE CASES FOR CHAPTER 16: \"QUEUES\"...");
        
        System.out.println("\n\n16.1 and 16.2 - Array implementation (circular buffer) of a Queue");
        Queue q = new Queue();
        System.out.println("\nAdding \"c\", \"e\", \"a\", \"d\", and \"b\" to the queue.");
        q.add("c");
        q.add("e");
        q.add("a");
        q.add("d");
        q.add("b");
        
        System.out.println("\nChecking if the queue is empty, the result from the \"isEmpty\" method - " + q.isEmpty());
        
        System.out.println("\nRemoving from the queue:");
        System.out.println("Removed element 1:\t\"" + q.remove() + "\"");
        System.out.println("Removed element 2:\t\"" + q.remove() + "\"");
        System.out.println("Removed element 3:\t\"" + q.remove() + "\"");
        System.out.println("Removed element 4:\t\"" + q.remove() + "\"");
        System.out.println("Removed element 5:\t\"" + q.remove() + "\"");
        System.out.println("Removed element 6:\t\"" + q.remove() + "\"");
        System.out.println("\nChecking if the queue is empty, the result from the \"isEmpty\" method - " + q.isEmpty());
        
        System.out.println("\n\n16.3 - Making the \"Rational\" class implement \"Comparable\"");
        Rational r = new Rational(2, 3);
        Rational s = new Rational(3, 4);
        System.out.println("Initialising rationals R and S as " + r + " and " + s + " respectively, the result from R.comapreTo(S) is:\t" + r.compareTo(s));
        
        System.out.println("\n\n16.4 - SortedList");
        SortedList sl = new SortedList();
        System.out.println("\nAdding \"c\", \"e\", \"a\", \"d\", and \"b\" to the sorted list.");
        sl.add("c");
        sl.add("e");
        sl.add("a");
        sl.add("d");
        sl.add("b");
        System.out.println("State of the sorted list: \t" + sl);
        
        System.out.println("\n\n16.5 - The \"findMax\" operation on linked lists");
        LinkedList l = new LinkedList();
        System.out.println("\nAdding \"c\", \"e\", \"a\", \"d\", and \"b\" to the linked list.");
        l.add(0, "c");
        l.add(0, "e");
        l.add(0, "a");
        l.add(0, "d");
        l.add(0, "b");
        System.out.println("State of the linked list: \t" + l);
        System.out.println("Result from the \"findMax\" method:\t\"" + l.maximum() + "\"");
        
        System.out.println("\n\n16.6 - SortedList implementaion of a ProrityQueue");
        PriorityQueue pq = new PriorityQueue();
        System.out.println("\nAdding \"c\", \"e\", \"a\", \"d\", and \"b\" to the priority queue.");
        pq.add("c");
        pq.add("e");
        pq.add("a");
        pq.add("d");
        pq.add("b");
        
        System.out.println("\nRemoving from the queue:");
        System.out.println("Removed element 1:\t\"" + pq.remove() + "\"");
        System.out.println("Removed element 2:\t\"" + pq.remove() + "\"");
        System.out.println("Removed element 3:\t\"" + pq.remove() + "\"");
        System.out.println("Removed element 4:\t\"" + pq.remove() + "\"");
        System.out.println("Removed element 5:\t\"" + pq.remove() + "\"");
        
        System.out.println("\n\n16.7 - Event Queues");
        Date d1 = new Date();
        Thread.sleep(1000);
        Date d2 = new Date();
        Thread.sleep(1000);
        Date d3 = new Date();
        Thread.sleep(1000);
        Date d4 = new Date();
        
        EventQueue eq = new EventQueue();
        System.out.println("Adding events to the event queue: ");
        System.out.println("S. no \t|\tEvent \t\t|\t\t\t Time\n---------------------------------------------------------------------------------");
        eq.add("EVENT2", d2);
        System.out.println("  1.\t|\t\"EVENT2\" \t|\t " + d2);
        eq.add("EVENT4", d4);
        System.out.println("  2.\t|\t\"EVENT4\" \t|\t " + d4);
        eq.add("EVENT3", d3);
        System.out.println("  3.\t|\t\"EVENT3\" \t|\t " + d3);
        eq.add("EVENT1", d1);
        System.out.println("  4.\t|\t\"EVENT1\" \t|\t " + d1);
        
        System.out.println("\nRmoving the events from the event queue");
        System.out.println("S. no \t|\tEvent \t\t|\t\t\t Time\n---------------------------------------------------------------------------------");
        Date d;
        d = eq.nextTime();
        System.out.println("  1.\t|\t\"" + eq.nextEvent() + "\"\t|\t\t" + d);
        d = eq.nextTime();
        System.out.println("  2.\t|\t\"" + eq.nextEvent() + "\"\t|\t\t" + d);
        d = eq.nextTime();
        System.out.println("  3.\t|\t\"" + eq.nextEvent() + "\"\t|\t\t" + d);
        d = eq.nextTime();
        System.out.println("  4.\t|\t\"" + eq.nextEvent() + "\"\t|\t\t" + d);
        d = eq.nextTime();
        System.out.println("  5.\t|\t\"" + eq.nextEvent() + "\"\t\t|\t\t\"" + d + "\"");
        
        System.out.println("\n\n...END OF SAMPLE CASES FOR CHAPTER 16: \"QUEUES\"");
    }
}