/**
 * 16.6
 * 
 * @author Kaivalya Rawal
 * @version 1.0
 */
public class PriorityQueue extends SortedList {
    /**
     * Exercise 16.6 Write an implementation of a Priority Queue using a linked list.
     * There are three ways you might proceed:
     * • A Priority Queue might contain a LinkedList object as an instance variable.
     * • A Priority Queue might contain a reference to the first Node object in a linked
     *      list.
     * • A Priority Queue might extend (inherit from) the existing LinkedList class.
     * Think about the pros and cons of each and choose one. Also, you can choose whether
     * to keep the list sorted (slow add, fast remove) or unsorted (slow remove, fast add).
     */
    public Object remove() {
        return removeFirst();
    }
}
