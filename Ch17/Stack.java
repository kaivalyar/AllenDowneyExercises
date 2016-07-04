import java.util.Vector;

public class Stack {
    Vector v;
    
    public Stack () {
        v = new Vector();
    }
    
    public void push (Object o) {
        v.add(o);
    }
    
    public Object pop () {
        return v.remove(v.size()-1);
    }
    
    public boolean isEmpty() {
        return (v.size() == 0);
    }
}
