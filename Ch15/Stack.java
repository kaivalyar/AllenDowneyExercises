//15.3
class Stack {
    LinkedList l;
    public Stack () {
        l = new LinkedList (null, 0);
        l.head = new Node("", null);
    }
    
    public void push (Object o) {
        for (Node i = this.l.head; i != null; i = i.next) {
            if (i.next == null) {
                i.next = new Node(o, null);
                this.l.length++;
                break;
            }
        }
    }
    
    public Object pop () {
        for (Node i = this.l.head; i != null; i = i.next) {
            if (i.next.next == null) {
                Object r = i.next.cargo;
                i.next = null;
                this.l.length--;
                return r;
            }
        }
        return null;
    }
    
    public boolean isEmpty() {
        return (l.head.next == null);
    }
}
