/**
 * 10.9, Coding common traversals recursively
 * 
 * @author Kaivalya Rawal
 * @version 1.0
 */
class Recursion {
    /**
     * Constructor had to be provided to override the default constructor
     */
    public Recursion () {
        System.out.println("Constructor of class Recursion was invoked even when it shouldn't be, program will terminate");
        System.exit(0);
    }

    /**
     * 10.9; Helper method: recursively finds the largest value (element) in a given range from a given array
     * 
     * @param  ar  An array of integers
     * @param  l  The index which specifies the lower(may be upper) bound of the desired range
     * @param  h  The index that specifies the upper(may be lower) bound of the indicated range
     * @return   The maximum value in the desired range of the specified array
     */
    public static int maxInRange (int[] ar, int l, int h) {
        if (l>h)return maxInRange(ar, h, l);    
        if (l==h) return ar[l];
        if (ar[l]>=maxInRange(ar, l+1, h)) return ar[l];
        else return maxInRange(ar, l+1, h);
    }
    
    /*
    public static int maxInRange (int[] ar, int l, int h) {
        if (h<l) return maxInRange (ar, h, l);// this means that l doesn't have to specify the lower bound
        if (l==h) return ar[l];
        
        System.out.println("Creating ar1");
        int[] ar1 = new int[1];

        System.out.println ("Assigning ar1[0] to the value: " + ar[l] );
        ar1[0] = ar[l];
        
        System.out.println("Creating ar2");
        int[] ar2 = new int [h-l];
        
        System.out.println("Preparing for loop");
        int k = l;
        for (int i = 0; i < ar2.length && k < ar.length; i++) {
            System.out.println("k:" + k);
            System.out.println("i:" + i);
            System.out.println("l:" + l);
            System.out.println("ar2[i]:" + ar2[i]);
            System.out.println("ar[k]:" + ar[k]);
            System.out.println("");
            ar2[i] = ar[k];
            k++;
        }
        if (maxInRange (ar1, 0, 0)>= maxInRange(ar2, 0, ar2.length-1)) return maxInRange (ar1, 0, 0);
        else return maxInRange (ar2, 0, ar2.length - 1);
    }
    */
    
    /**
     * 10.9; Wrapper method: finds the largest value in an array
     * 
     * @param  ar  An array of integers
     * @return   The maximum value in the array
     */
    public static int max (int[] ar) {
        return maxInRange (ar, 0, ar.length-1);
    }
    
    
    /**
     * 10.9; Helper method: recursively finds the target value (element) in a given range from a given array, similar to indexOf(char, int)
     * 
     * @param  ar  An array of integers
     * @param  target  The value to be found, similar to char in indexOf(char, int)
     * @param  l  The index which specifies the lower bound of the search similar to int in indexOf (char, int)
     * @return   The first index of the target value after l
     */
    public static int find (int[] ar, int target, int l) {
        if (l>=ar.length) return -1;
        if (ar[l] == target) return l;
        else return find (ar, target, l+1);
    }

    /**
     * 10.9; Wrapper method: recursively finds the target value (element) in a given range from a given array, similar to indexOf(char)
     * 
     * @param  ar  An array of integers
     * @param  target  The value to be found, similar to char in indexOf(char, int)
     * @return   The first index of the target value in the given array
     */
    public static int find (int[] ar, int target) {
        return find(ar, target, 0);
    }
}
