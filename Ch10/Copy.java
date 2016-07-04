/**
 * Exercise 10.0, copy elements of an array
 * 
 * @author Kaivalya Rawal 
 * @version 1.0
 */
class Copy {
    /**
     * Constructor had to be provided to override the default constructor
     */
    public Copy () {
        System.out.println("Constructor of class Copy was invoked even when it shouldn't be, program will terminate");
        System.exit(0);
    }
    
    /**
     * 10.0; Copies elements of an array into another, both are provided as parameters
     * 
     * @param  ar1   Array to be copied from
     * @param  ar2   Array to be copied into
     */
    public static void copy (int[] ar1, int[] ar2) {
        //if (ar1.length != ar2.length) throw new Exception("array length not equal");
        if (ar1.length != ar2.length){
            System.out.println("Array lengths unequal");
            return;
        }
        for (int i = 0; i < ar1.length; i++) {
            ar2[i] = ar1[i];
        }
    }
    
    /*
     * main, couldn't invoke copy otherwise
     *
    public static void main () {
        int[] ar1 = new int[5];
        int[] ar2 = new int[5];
        for (int i = 0; i<ar1.length; i++) {
            ar1[i] = i;            
        }
        copy (ar1, ar2);
        for (int i = 0; i<ar2.length; i++) {
            System.out.println (ar1[i]);
            System.out.println (ar2[i]);
        }
    }*/
}
