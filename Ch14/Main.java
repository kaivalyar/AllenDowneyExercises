/**
 * Class for Sample Output generation.
 */
public class Main {
    public static void main (String[] args) {
        System.out.println("BEGINNING SAMPLE CASES FOR CHAPTER 14: \"LINKED LISTS\"...");
        System.out.println("\n\n14.1");
        IntList l = new IntList();
        System.out.println("Creating a list - constructor");
        System.out.print("List - ");
        l.print();
        
        System.out.println("\nAdding nodes - \"addFirst\", \"addLast\", and \"add\"");
        l.addFirst(0);
        l.addLast(4);
        l.add(1, 3);
        System.out.print("List - ");
        l.print();
        
        System.out.println("\nRemoving nodes - \"removeFirst\"");
        System.out.println("Removed Node: " + l.removeFirst());
        System.out.print("List - ");
        l.print();
        
        System.out.println("\nReversing and appending - \"reverse\" and \"append\"");
        l.reverse();
        System.out.print("Reversed list: ");
        l.print();
        l.append(l);
        System.out.print("Appending the same list to the list: ");
        l.print();
        
        System.out.println("\nSetting nodes - \"set\"");
        l.set(1, 10);
        System.out.print("List - ");
        l.print();
        
        System.out.println("\nChecking the length - \"checkLength\"");
        System.out.println("Result:\t\t" + l.checkLength());
        
        System.out.println("\n\n14.2");
        IntList l2 = new IntList();
        l2.add(0, 1);
        l2.add(0, 2);
        l2.add(2, 3);
        System.out.print("Comparing\t");
        l2.print();
        System.out.print("with\t\t");
        l.set(1, 9);
        l.print();
        System.out.println("Result:\t\t" + l2.compareList(l));
        System.out.println("\n\n...END OF SAMPLE CASES FOR CHAPTER 14: \"LINKED LISTS\"...");
    }
}
