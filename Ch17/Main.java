/**
 * Class for Sample Output generation.
 */
public class Main {
    public static void main (String[] args) throws Exception{
        System.out.println("BEGINNING SAMPLE CASES FOR CHAPTER 17: \"TREES\"...");
        
        System.out.println("\n\n17.1 - generalised preorder traversals using \'Visitable\'");
        System.out.println("After defining token objects which contain Strings, implement Visitable, and define visit() to print the contents of node cargo;");
        Token tok1 = new Token("a");
        Token tok2 = new Token("b");
        Token tok3 = new Token("c");
        Tree t1 = new Tree(tok1, null, null);
        Tree t2 = new Tree(tok3, null, null);
        Tree t = new Tree (tok2, t1, t2);
        Tree.visitPreorder(t);
        
        System.out.println("\n\n17.2 - generalised preorder traversals using the \'Iterator\' object");
        PreIterator it = Tree.preorderIterator(t);
        while (it.hasNext ()) {
            System.out.println (it.next ());
        }
        
        System.out.println("\n\n17.3 problems solved in computers notebook");
        
        System.out.println("\n\n17.4 finding the height of a tree");
        System.out.println("The height of this tree is:\t" + Tree.height(t));
        
        System.out.println("\n\n17.5 - finding the \'largest\' cargo in a ComparableTree");
        System.out.println("After defining token objects which contain Strings, implement Comparable, and define compareTo()");
        ComparableTree ct1 = new ComparableTree(tok1, null, null);
        ComparableTree ct2 = new ComparableTree(tok3, null, null);
        ComparableTree ct = new ComparableTree (tok2, ct1, ct2);
        System.out.println("The \'largest\' cargo in the tree is:\t" + ComparableTree.findMax(ct));
        
        System.out.println("\n\n17.6 - binary search trees");
        System.out.println("After defining token objects which contain Strings, implement Comparable, and define compareTo()");
        SearchTree st1 = new SearchTree(tok1, null, null);
        SearchTree st2 = new SearchTree(tok3, null, null);
        SearchTree st = new SearchTree (tok2, st1, st2);
        System.out.println("Searching for \'a\' in the tree:\t" + st.contains(tok1));
        System.out.println("Searching for \'f\' in the tree:\t" + st.contains(new Token("f")));
        
        System.out.println("\n\n17.7 - TreeSets");
        System.out.println("\nCreating an empty TreeSet");
        TreeSet ts = new TreeSet();
        System.out.println("The TreeSet -\t\t" + ts);
        
        System.out.println("\nAdding elements: \"A\", \"B\", and \"C\".");
        System.out.println("A\t\t" + ts.add(new Token("A")));
        System.out.println("B\t\t" + ts.add(new Token("B")));
        System.out.println("C\t\t" + ts.add(new Token("C")));
        System.out.println("Adding \"A\" again");
        System.out.println("A\t\t" + ts.add(new Token("A")));
        System.out.println("The TreeSet -\t\t" + ts);
        
        System.out.println("\nRemoving Element \"A\"");
        System.out.println("A\t\t" + ts.remove(new Token("A")));
        System.out.println("Removing \"A\" again");
        System.out.println("A\t\t" + ts.remove(new Token("A")));
        System.out.println("The TreeSet -\t\t" + ts);
        
        System.out.println("\nChecking if the TreeSet contains \"A\" or \"C\"");
        System.out.println("A\t\t" + ts.contains(new Token("A")));
        System.out.println("C\t\t" + ts.contains(new Token("C")));
        
        System.out.println("\nChecking if the TreeSet contains both \"B\" and \"C\"");
        TreeSet ts1 = new TreeSet();
        ts1.add(new Token("B"));
        ts1.add(new Token("C"));
        System.out.println("B and C\t\t" + ts.containsAll(ts1));
        ts1.remove(new Token("B"));
        ts1.add(new Token("A"));
        System.out.println("Checking if the TreeSet contains both \"A\" and \"B\"");
        System.out.println("A and B\t\t" + ts.containsAll(ts1));
        
        System.out.println("\n\n17.8 and 17.9 - TreeSet union and intersection");
        System.out.println("Creating 2 Sets:");
        ts.add(new Token("A"));
        ts.add(new Token("F"));
        ts.add(new Token("G"));
        ts.add(new Token("M"));
        ts1.add(new Token("L"));
        ts1.add(new Token("G"));
        System.out.println("Set 1 - " + ts + "\nSet 2 - " +ts1);
        System.out.println("Union of the two - " + TreeSet.union(ts, ts1));
        System.out.println("Intersection of the two - " + TreeSet.intersection(ts, ts1));
        
        System.out.println("\n\n17.10 - An application of PriorityQueues and the Comparable interface");
        System.out.println("The contents of the file:\n\tTiger Woods 61\n\tPhil Mickelson 72\n\tAllen Downey 158\n\tKaivalya Rawal          567\n\tHal Sutton 69\n");
        System.out.println("The ouptut from the main method of the Golfer class:");
        Golfer.main(new String[0]);
        
        System.out.println("\n\n17.11 - Vector implementaion of a Stack");
        Stack s = new Stack();
        System.out.println("\nStack operations - \"push\", \"pop\", and \"isEmpty\"");
        s.push("Element 0");
        s.push("Element 1");
        System.out.println("Pushing two Strings into the stack - \"Element 0\", and \"Element 1\"");
        System.out.println("Checking if the stack is empty:\t\t\t\t" + s.isEmpty());
        System.out.println("Popping an element, the first returned element is:\t" + s.pop());
        System.out.println("The second popped element is:\t\t\t\t" + s.pop());
        System.out.println("Checking if the stack is empty:\t\t\t\t" + s.isEmpty());
        
        System.out.println("\n\n...END OF SAMPLE CASES FOR CHAPTER 17: \"TREES\"");
    }
}