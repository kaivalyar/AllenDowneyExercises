/**
 * 10.11, A not-very-efficient way of sorting elements of an array
 *
 *@author Kaivalya Rawal
 *@version 1.0
 */
class Sorting{
    /**
     * Constructor had to be provided to override the default constructor
     */
    public Sorting () {
        System.out.println("Constructor of class Sorting was invoked even when it shouldn't be, program will terminate");
        System.exit(0);
    }
    
    /*
     * Method testing the methods written as part of 10.11
     *
    public static void main () {
        int[] ar = {7, 8, 5, 3, 6, 1, 2, 4, 9};
        System.out.println("Creating array: {7, 8, 5, 3, 6, 1, 2, 4, 9}");
        sortArray (ar);
        System.out.println("Sorting array");
        System.out.println ("Printing array elements");
        for (int i = 0; i< ar.length; i++){
            System.out.println(ar[i]);
        }
    }*/

    /**
     * 10.11; Takes an array of integers, finds the largest element in the given range, and returns its index.
     * 
     * @param  ar  Integer array to test
     * @param  low  Integer specifying lower bound of range (included)
     * @param  high Integer specifying upper bound of range (included)
     * 
     * @return  The index of the largest integer in the given range of the integer array
     */
    public static int indexOfMaxInRange (int[] ar, int low, int high) {
        return Recursion.find (ar, Recursion.maxInRange(ar, low, high));
    }
    
    /**
     * 10.11; Swaps the two given elements (specified by indices) of an array
     * 
     * @param  ar  The specified integer array
     * @param  index1  The index specifying the element to be swapped
     * @param  index2  The index specifying the element to be swapped
     */
    public static void swapElement (int[] ar, int index1, int index2) {
        int hold = ar[index1];
        ar[index1] = ar[index2];
        ar[index2] = hold;
    }
    
    /**
     * 10.11; Sorts a given array
     * 
     * @param  ar  The array to be sorted
     */
    public static void sortArray (int[] ar) {
        int index;
        for (int i = 0; i<ar.length; i++) {
            index = indexOfMaxInRange(ar, i, ar.length-1);
            swapElement (ar, i, index);
        }
    }
}