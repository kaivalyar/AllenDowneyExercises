/**
 * Exercise 16.7 An event queue is a data structure that keeps track of a set of
 * events, where each event has a time associated with it. The ADT is:
 * constructor: make a new, empty event queue
 * add: put a new event in the queue. The parameters are the event, which is an Object,
 * and the time the event occurs, which is a Date object. The event Object must
 * not be null.
 * nextTime: return the Date at which the next event occurs, where the “next” event is
 * the one in the queue with the earliest time. Do not remove the event from the
 * queue. Return null if the queue is empty.
 * nextEvent: return the next event (an Object) from the queue and remove it from the
 * queue. Return null if the queue is empty.
 * The Date class is defined in java.util and it implements Comparable. According to
 * the documentation, its compareTo method returns “the value 0 if the argument Date
 * is equal to this Date; a value less than 0 if this Date is before the Date argument; and
 * a value greater than 0 if this Date is after the Date argument.”
 * Write an implementation of an event queue using the PriorityQueue ADT. You should
 * not make any assumptions about how the PriorityQueue is implemented.
 * HINT: create a class named Event that contains a Date and an event Object, and that
 * implements Comparable appropriately.
 * 
 * @author  Kaivalya Rawal
 * @version 1.0
 */

import java.util.Date;
public class EventQueue extends PriorityQueue{
    
    public Object nextEvent () {
        if (this.head == null) return null;
        return ((Event)(this.remove())).event;
    }
    
    public void add (Object event, Date time) {
        if (event == null) return;
        Event e = new Event();
        e.event = event;
        e.time = time;
        this.add(e);
    }
    
    public Date nextTime () {
        if (this.head == null) return null;
        Event e = (Event)this.remove();
        Date r = e.time;
        this.add(e);
        return r;
    }
    
    /*public static void x () throws InterruptedException{
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
        System.out.println("  5.\t|\t\"" + eq.nextEvent() + "\"\t\t|\t\t" + d);
        
        
        
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());
        /*return eq;
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());
        System.out.println(eq.nextTime() + "\t" + eq.nextEvent());* /
    }*/
}
