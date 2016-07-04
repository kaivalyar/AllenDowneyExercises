/**
 * Class for Sample Output generation.
 */
public class Main {
    public static void main (String[] args) throws Exception{
        System.out.println("BEGINNING SAMPLE CASES FOR CHAPTER 15: \"STACKS\"...");
        System.out.println("\n\n15.1");
        int[] ar = {0, 1, 2, 3, 4, 5};
        System.out.print("Starting array:\t\t");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        ar = Reverse.reverse(ar);
        System.out.print("\nReversed array:\t\t");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        
        System.out.println("\n\n15.2 - string operations");
        System.out.println("\nSplitting the string - \"Propositional logic is also known as sentential logic.\":");
        LinkedList l = new LinkedList().split("Propositional logic is also known as sentential logic.");
        System.out.println(l);
        System.out.println("\nJoining the words from the list:");
        System.out.println(l.join());
        
        System.out.println("\n\n15.3 - LinkedList implementaions of a Stack");
        System.out.println("\nInstance Variable Implementation (First element of the list is empty)");
        Stack s = new Stack();
        System.out.println("\nStack operations - \"push\", \"pop\", and \"isEmpty\"");
        s.push("Element 0");
        s.push("Element 1");
        System.out.println("Stack after pushing 2 elements:\t" + s.l);
        Object o = s.pop();
        System.out.println("Stack after popping an element:\t" + s.l);
        System.out.println("popped element:\t" + o);
        System.out.println("Checking if the stack is empty");
        System.out.println("Result:\t" + s.isEmpty());
        
        System.out.println("\nInheritance Implementation (First element of the list is empty)");
        Stack2 s2 = new Stack2();
        System.out.println("\nStack operations - \"push\", \"pop\", and \"isEmpty\"");
        s2.push("Element 0");
        s2.push("Element 1");
        System.out.println("Stack after pushing 2 elements:\t" + s2);
        Object o2 = s2.pop();
        System.out.println("Stack after popping an element:\t" + s2);
        System.out.println("popped element:\t" + o2);
        System.out.println("Checking if the stack is empty");
        System.out.println("Result:\t" + s2.isEmpty());
        
        System.out.println("\n\n15.4 - balancing brackets");
        System.out.println("\nOutput from checking the file - \"Reverse.java\":");
        Balance.checkFile("Reverse.java");
        
        System.out.println("\n\n15.5 and 15.6 - evaluation of postfix expressions");
        System.out.println("Calling the main method from the Postfix class.");
        Postfix.main(new String[0]);
        
        System.out.println("\n\n...END OF SAMPLE CASES FOR CHAPTER 15: \"STACKS\"");
    }
}