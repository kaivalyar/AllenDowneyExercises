//15.3
class Stack2 extends LinkedList{
    public Stack2 () {
        //this = (Stack2) new LinkedList (null, 0);
        this.head = new Node("", null);
    }
    
    public void push (Object o) {
        for (Node i = this.head; i != null; i = i.next) {
            if (i.next == null) {
                i.next = new Node(o, null);
                this.length++;
                break;
            }
        }
    }
    
    public Object pop () {
        for (Node i = this.head; i != null; i = i.next) {
            if (i.next.next == null) {
                Object r = i.next.cargo;
                i.next = null;
                this.length--;
                return r;
            }
        }
        return null;
    }
    
    public boolean isEmpty() {
        return (this.length == 0);
    }
}
