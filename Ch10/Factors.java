/**
 * 10.4, areFactors
 * 
 * @author Kaivalya Rawal 
 * @version 1.0
 */
class Factors {
    /**
     * Constructor had to be provided to override the default constructor
     */
    public Factors () {
        System.out.println("Constructor of class Factors was invoked even when it shouldn't be, program will terminate");
        System.exit(0);
    }

    /**
     * 10.4; Checks whether all the elements of an array are factors of a given number
     * 
     * @param  n   The number
     * @param  f   The array to check for factors
     * @return     Boolean indicating whether or not all the elements of the given array are factors of the given number
     */
    public static boolean areFactors (int n, int[] f) {
        for (int i =0; i<f.length; i++) {
            if (n%f[i]!=0) return false;
        }
        return true;
    }
    
    /*
     * Main had to be written to check the method
     *
    public static void main () {
        int[] f = new int[] {12, 34, 82, 40, 67, 93, 24};
        int n = 123456;
        System.out.println (areFactors(n, f));
    }*/
}
