import java.util.Vector;
import java.util.Iterator;

public class PreIterator implements Iterator {
    private Iterator i;
    
    public PreIterator (Vector v) {
        i = v.iterator();
    }
    
    public boolean hasNext () {
        return i.hasNext();
    }
    
    public Object next () {
        return i.next();
    }
    
    public void remove () {
        i.remove();
    }
}
