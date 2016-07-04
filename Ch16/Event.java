/**
 * 16.7
 * 
 * @author Kaivalya Rawal
 * @version 1.0
 */

import java.util.Date;
class Event implements Comparable{
    Object event;
    Date time;
    
    public int compareTo(Object o) {
        Event e = (Event) o;
        return this.time.compareTo(e.time);
    }
    
    public String toString() {
        return this.event.toString();
    }
}
