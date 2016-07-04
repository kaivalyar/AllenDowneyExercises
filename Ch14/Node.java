class Node {
    
    int cargo;
    Node next;
    
    public Node() {
        cargo=0;
        next=null;
    }
    
    public Node(int cargo, Node next) {
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
        System.out.print(list + ", ");
    }
    
    //14.2
    public void set (int i, int n) {// helper method
        if (i == 0) {
            this.cargo = n;
            return;
        } else {
            this.next.set(i-1, n);
        }
    }
    
    //14.2
    public Node add (int i, int n) {// helper method
        if (i == 0) {
            return new Node(n, this);
        } else {
            this.next = this.next.add(--i, n);
            return this;
        }
    }
}









