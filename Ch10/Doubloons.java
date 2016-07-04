/**
 * 10.12, checking whether a given word is a doubloon(i.e. all the characters appear twice only)
 * 
 * @author Kaivalya Rawal
 * @version 12/04/2011
 */
class Doubloons {
    /**
     * Constructor had to be provided to override the default constructor
     */
    public Doubloons () {
        System.out.println("Constructor of class Doubloons was invoked even when it shouldn't be, program will terminate");
        System.exit(0);
    }

     /**
     * 10.12; Returns a boolean idicating whether or not the given word is a doubloon(i.e. all the characters appear twice only)
     * 
     * @param  s   The String on which the test is to be performed
     * @return     Boolean indicating whether the word is a doubloon
     */
    public static boolean isDoubloon (String s) {
       int[] hist = Histograms.letterHist(s);
       for (int i =0; i<26; i++) {
           if (hist[i] != 0) { 
               if (hist[i] > 2 || hist[i] < 2) return false; // if (hist[i] != 2) return false;
           }
           /* The conditions had to be nested because:
            * the other option:  if hist[i]!=0 || hist!= 2) return false; // doesn't work
            * as the condition is always true
            */
        }
        return true;
    }
}
