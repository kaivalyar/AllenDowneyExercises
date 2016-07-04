/**
 * 10.13, Testing whether a word can be made from some given Scrabble tiles, 10.14 [the same thing taking blank tiles into account]
 * 
 * @author Kaivalya Rawal 
 * @version some date
 */
class Scrabble {
    /**
     * Constructor had to be provided to override the default constructor
     */
    public Scrabble () {
        System.out.println("Constructor of class Scrabble was invoked even when it shouldn't be, program will terminate");
        System.exit(0);
    }
    
    /**
     * 10.13; Tests if a given word can be made using the given tiles
     * 
     * @param  have   A String containing all the given tiles only
     * @param  target   The String to be tested for
     * @return     Boolean indicating wheteher or not the given word can be made
     */
    public static boolean testWord (String have, String target){
        int[] h = Histograms.letterHist (have);
        int[] t = Histograms.letterHist (target);
        for (int i = 0; i<26; i++) {
            if (t[i] > h[i]) return false;
        }
        return true;
    }
    
    /**
     * 10.13; Tests if a given word can be made using the given tiles, takes blank tiles into account
     * 
     * @param  have   A String containing all the given tiles only
     * @param  target   The String to be tested for
     * @return     Boolean indicating wheteher or not the given word can be made
     */
    public static boolean testWordBlank (String have, String target){
        /*for (int i =0; i< have.length(); i++) {
            if (have.charAt(i)==' ')count++; // blank tile represented by spaces
        }*/
        int[] h = Histograms.letterHist (have);
        int[] t = Histograms.letterHist (target);
        for (int i = 1; i<27; i++) {
            if (t[i] > h[i]) h[0] -= (t[i]-h[i]);
        }
        return (h[0] >= 0);
    }
}
