/**
 * Class for Sample Output generation.
 */
public class Main {
    public static void main (String[] args) throws Exception{
        System.out.println("BEGINNING SAMPLE CASES FOR CHAPTER 18: \"HEAPS\"...");
        
        System.out.println("\n\n18.7 - Array implementation of a heap");
        Heap h = new Heap();
        System.out.println("Adding \"c\", \"e\", \"a\", \"d\", and \"b\" to the heap.");
        h.add("c");
        h.add("e");
        h.add("a");
        h.add("d");
        h.add("b");
        printHeap(h);
        System.out.println("\nRemoving from the heap:");
        System.out.println("Removed element 1:\t\"" + h.remove() + "\"");
        printHeap(h);
        System.out.println("Removed element 2:\t\"" + h.remove() + "\"");
        printHeap(h);
        System.out.println("Removed element 3:\t\"" + h.remove() + "\"");
        printHeap(h);
        System.out.println("Removed element 4:\t\"" + h.remove() + "\"");
        printHeap(h);
        System.out.println("Removed element 5:\t\"" + h.remove() + "\"");
        printHeap(h);
        System.out.println("Removed element 6:\t\"" + h.remove() + "\"");
        printHeap(h);
        
        
        System.out.println("\n\n18.1 - Checking if a Tree is complete");
        System.out.println("Result from \"isComplete\":");
        System.out.println(h.isComplete());
        
        System.out.println("\n\n18.2 - Checking if a Tree has the \'heapness\' property");
        System.out.println("Result from the \"isHeap\" method:");
        System.out.println(h.isHeap());
        
        System.out.println("\n\n...END OF SAMPLE CASES FOR CHAPTER 18: \"HEAPS\"");
    }
    
    private static void printHeap (Heap h) {
        System.out.println("\tThe state of the heap:");
        System.out.println("\tThe root cargo is  \t\t -\t \"" + h.getCargo(1) + "\"");
        System.out.println("\tThe cargo at root.left is  \t -\t \"" + h.getCargo(h.getLeft(1)) + "\"");
        System.out.println("\tThe cargo at root.right is  \t -\t \"" + h.getCargo(h.getRight(1)) + "\"");
        System.out.println("\tThe cargo at root.left.left is   -\t \"" + h.getCargo(h.getLeft(h.getLeft(1))) + "\"");
        System.out.println("\tThe cargo at root.left.right is  -\t \"" + h.getCargo(h.getRight(h.getLeft(1))) + "\"");
        System.out.println("\tThe cargo at root.right.left is  -\t \"" + h.getCargo(h.getLeft(h.getRight(1))) + "\"");
        System.out.println("\tThe cargo at root.right.right is -\t \"" + h.getCargo(h.getRight(h.getRight(1))) + "\"");
    }
}