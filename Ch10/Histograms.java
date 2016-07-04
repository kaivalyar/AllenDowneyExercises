/**
 * 10.3 generating a histogram of scores, 10.6 an abstract histogram, 10.11 a histogram of the letters in a String
 * 
 * @author Kaivalya Rawal
 * @version 1.0
 */
class Histograms {
    /**
     * Constructor had to be provided to override the default constructor
     */
    public Histograms () {
        System.out.println("Constructor of class Histograms was invoked even when it shouldn't be, program will terminate");
        System.exit(0);
    }
    /**
     * 10.3; Generates a histogram of scores
     * 
     * @param  scores Integer array of 'scores' or any values
     * @return The generated histogram
     */
    public static int[] scoreHist (int[] scores) {
        int[] hist = new int[10];
        for (int i = 0; i<scores.length; i++) {
            int index = scores[i]/10;
            hist [index] ++;
        }
        return hist;
    }
    
    /**
     * 10.6; Generates an abstract histogram
     * 
     * @param  ar An array (int)
     * @return The generated histogram
     */
    public static int[] arrayHist (int[] ar) {
        int[] result = new int[11];
        for (int i = 0; i<ar.length; i++) {
            int x = ar[i];
            if (x<=0) result[0] ++;
            else if (x>=10) result[10] ++;
            else result[x]++;
        }
        return result;
    }
    
    /**
     * 10.11; Generates a histogram of the letters in a String
     * 
     * @param s  A String, which is used to generate a histogram
     * @return A histogram of letters
     */
    public static int[] letterHist (String s) {
        String standard = "abcdefghijklmnopqrstuvwxyz";
        int[] hist = new int [26];
        for (int i = 0; i<hist.length; i++) {
            hist[i] = 0;
        }
        for (int k = 0; k< s.length(); k++) {
            hist[standard.indexOf(s.charAt(k))]++;
        }
        return hist;
    }
    
    /*
     * main, had to be written to check the methods
     *
    public static void main () {
        int[] scores = new int[] {12, 34, 82, 40, 67, 93, 24};
        int[] hist = scoreHist(scores);
        for (int i =1; i< hist.length; i++){
            System.out.println (hist[i]);
        }
        System.out.println ("----------------------------");
        int[] ar = new int[] {-1, -2, -3, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 11, 20, 45, 8756};
        int[] result = arrayHist(ar);
        for (int i =1; i< result.length; i++){
            System.out.println (result[i]);
        }
   }*/
}
