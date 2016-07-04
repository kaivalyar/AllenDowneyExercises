------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:                  Chapter 16: Queues
VERSION or DATE:                1.0
AUTHOR:                         Kaivalya Rawal


16.11 Exercises
================================================================================
Exercise 16.1 Modify remove so that it returns null if the queue is empty.
DONE IN Queue.java

Exercise 16.2 Write an implementation of a queue using a circular buffer that 
resizes itself when necessary.
DONE IN Queue.java

Exercise 16.3 This question is based on Exercise 9.3.
Write a compareTo method for the Rational class that would allow Rational to im-
plement Comparable. Hint: don’t forget that the parameter is an Object.
DONE IN Rational.java

Exercise 16.4 Write a class definition for SortedList, which extends LinkedList.
A SortedList is similar to a LinkedList; the difference is that the elements have to be
Comparable, and the list is sorted in decreasing order.
Write an object method for SortedList called add that takes a Comparable as a
parameter and that adds the new object into the list, at the appropriate place so that
the list stays sorted.
If you want, you can write a helper method in the Node class.
DONE IN SortedList.java UNUSED HELPER CLASSES: LinkedList.java, Node.java SORTED IN ASCENDING ORDER

Exercise 16.5 Write an object method for the LinkedList class named maximum
that can be invoked on a LinkedList object, and that returns the largest cargo object
in the list, or null if the list is empty.
You can assume that every cargo element belongs to a class that belongs to the meta-
class Comparable, and that any two elements can be compared to each other.
DONE IN LinkedList.java UNUSED HELPER CLASS: Node.java

Exercise 16.6 Write an implementation of a Priority Queue using a linked list.
There are three ways you might proceed:
• A Priority Queue might contain a LinkedList object as an instance variable.
• A Priority Queue might contain a reference to the first Node object in a linked
list.
• A Priority Queue might extend (inherit from) the existing LinkedList class.
Think about the pros and cons of each and choose one. Also, you can choose whether
to keep the list sorted (slow add, fast remove) or unsorted (slow remove, fast add).
DONE IN PriorityQueue.java UNUSED HELPER CLASSES: SortedList.java, LinkedList.java, Node.java
            IMPLEMENTATION CHOSEN: SLOW ADD, FAST REMOVE; FOR EASE OF IMPLEMENTATION

Exercise 16.7 An event queue is a data structure that keeps track of a set of
events, where each event has a time associated with it. The ADT is:
constructor: make a new, empty event queue
add: put a new event in the queue. The parameters are the event, which is an Object,
and the time the event occurs, which is a Date object. The event Object must
not be null.
nextTime: return the Date at which the next event occurs, where the “next” event is
the one in the queue with the earliest time. Do not remove the event from the
queue. Return null if the queue is empty.
nextEvent: return the next event (an Object) from the queue and remove it from the
queue. Return null if the queue is empty.
The Date class is defined in java.util and it implements Comparable. According to
the documentation, its compareTo method returns “the value 0 if the argument Date
is equal to this Date; a value less than 0 if this Date is before the Date argument; and
a value greater than 0 if this Date is after the Date argument.”
Write an implementation of an event queue using the PriorityQueue ADT. You should
not make any assumptions about how the PriorityQueue is implemented.
HINT: create a class named Event that contains a Date and an event Object, and that
implements Comparable appropriately.
DONE IN EventQueue.java AND Event.java 
            UNUSED HELPER CLASSES: PriorityQueue.java, SortedList.java, LinkedList.java, Node.java