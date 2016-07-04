/**
 * 10.5, Implementation of a simple search algorithm, 1 traversal
 * 
 * @author Kaivalya Rawal
 * @version 1.0
 */
class Target {
    /**
     * Constructor had to be provided to override the default constructor
     */
    public Target () {
        System.out.println("Constructor of class Target was invoked even when it shouldn't be, program will terminate");
        System.exit(0);
    }
    
    /**
     * 10.5; Similar to indexOf(char) for Strings
     * 
     * @param  ar  An array of ints
     * @param  target  What to look for
     * @return     The index of the first element of the given array where the given target appears
     */
    public static int findT (int[] ar, int target) {
        for (int i = 0; i< ar.length; i++) {
            if (ar[i]==target) return i;
        }
        return -1;
    }
    
    /*
     * main had to be written to check the method
     *
    public static void main () {
        int[] ar = new int[] {12, 34, 82, 40, 67, 93, 24};
        int target = 82;
        System.out.println (findT(ar, target));
    }*/
}
