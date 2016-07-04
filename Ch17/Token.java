public class Token implements Visitable, Comparable{
    String str;
    
    public Token (String s) {
        str = s;
    }
    
    public void visit () {
        System.out.println(str + " ");
    }
    
    public int compareTo (Comparable c) {
        return this.str.compareTo(((Token)c).str);
    }
    
    public String toString () {
        return str;
    }
}
