/**
 * 
 * @author Kaivalya Rawal
 * @version 1.0
 */
class Queue {
    public Object[] array;
    public int first, next;

    public Queue () {
        array = new Object[2];
        first = 0;
        next = 0;
    }

    public boolean isEmpty () {
        return first == next;
    }

    /**
     * Exercise 16.2 Write an implementation of a queue using a circular buffer that resizes itself when necessary.
     */
    public void add (Object item) {
        Queue q;
        if ((next + 1) % array.length == first) { // Full
            //System.out.println("full");
            q = new Queue();
            q.array = new Object[this.array.length*2];
            while (!this.isEmpty()) {
                q.add(this.remove());
            }
            this.array = q.array;
            this.first = q.first;
            this.next = q.next;
        }
        array[next] = item;
        next++;
        if (next == (array.length)) next = 0;
    }

    /**
     * Exercise 16.1 Modify remove so that it returns null if the queue is empty.
     */
    public Object remove () {
        if (first == next) return null;// EDIT
        Object result = array[first];
        first++;
        return result;
    }
}
