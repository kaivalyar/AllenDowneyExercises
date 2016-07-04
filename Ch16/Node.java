//15.2 a)
class Node {
    
    Object cargo;
    Node next;
    
    public Node() {
        cargo=0;
        next=null;
    }
    
    public Node(Object cargo, Node next) {
        this.cargo=cargo;
        this.next=next;
    }
    
    public String toString() {
        return cargo+"";
    }
    
    public static void printList(Node list) {
        System.out.print("(");
        for(Node node=list;node!=null;node=node.next) {
            if (node.next==null) {
                System.out.print(node);
                break;
            }
            System.out.print(node+", ");
        }
        System.out.println(")");
    }// ?
    
    public static void printBackward(Node list) {
        if(list==null) return;
        printBackward(list.next);
        System.out.print(list);
    }
    
    public void set (int i, Object n) {// helper method
        if (i == 0) {
            this.cargo = n;
            return;
        } else {
            this.next.set(i-1, n);
        }
    }
    
    public Node add (int i, Object n) {// helper method
        if (i == 0) {
            return new Node(n, this);
        } else {
            this.next = this.next.add(--i, n);
            return this;
        }
    }
}