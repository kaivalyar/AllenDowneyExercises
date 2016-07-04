import java.util.Iterator;

/**
 * add, contains, containsAll, remove, size, and iterator.*/
public interface Set {//extends Comparable{ interfaces may extend other interfaces!!!
    
    public boolean add (Comparable c) ;
    
    public boolean contains (Comparable c) ;
    
    public boolean containsAll (Set t) ;
    
    public boolean remove (Comparable c) ;
    
    public int size () ;
    
    public Iterator iterator () ;
}
