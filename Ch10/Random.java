/**
 * 10.1 and 10.2, randomDouble,randomInt
 * 
 * @author Kaivalya Rawal
 * @version 1.0
 */
class Random {
    /**
     * Constructor had to be provided to override the default constructor
     */
    public Random () {
        System.out.println("Constructor of class Random was invoked even when it shouldn't be, program will terminate");
        System.exit(0);
    }
    
    /**
     * 10.1;Generates pseudo-random int between 2 given values, using in-built randomness methods
     * 
     * @param low Indicates the lower bound for the random int (included)
     * @param high Indicates the upper bound for the random int (excluded)
     * @return The pseudo-randomly generated int between 2 given values
     */
    public static int randomInt (int low, int high) {
        return ((int) randomDouble (low, high));
    }
    
    /**
     * 10.2; Generates a pseudo-random double between 2 given values, using in-built randomness methods
     * 
     * @param low Indicates the lower bound for the random double (included)
     * @param high Indicates the upper bound for the random double (excluded)
     * @return The pseudo-randomly generated double between 2 given values
     */
    public static double randomDouble (double low, double high) {
        if (low > high)return randomDouble (high, low); // takes care of a minor error in logic
        return (low + ((Math.random())*(high-low)));
    }
}
