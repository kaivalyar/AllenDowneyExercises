/**
 * Exercise 12, this object contains an array of cards
 * 
 * @author Kaivalya Rawal
 * @version 12/04/2011
 */
class Deck {
    Card[] cards;

// The following are functions written by Downey, which are essential for exercise code
    /**
     * Constructor for objects of class Deck.
     */
    public Deck (int n) {
         this.cards = new Card [n];
    }

    /**
     * Constructor for objects of class Deck.
     */
    public Deck() {
        cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card (suit, rank);
                index++;
            }
        }
    }

    public static void printDeck (Deck deck) {
        for (int i=0; i<deck.cards.length; i++) {
            Card.printCard (deck.cards[i]);
        }
    }
//---------------------------------------------------------------------------------------------
    /**
     * 12.0, move the findCard method to the Deck class with appropriate amendments. The algorithm used is a linear search.
     * 
     * @param d  The Deck in which the card has to be found.
     * @param card  The card which has to be found.
     * @return  the index of the first occurrence of the given card in the Deck, or -1 if it doesn't occur.
     */
    public static int findCard (Deck d, Card card) {// 12.0: move findCard to the Deck class
        for (int i=0; i<d.cards.length; i++) {
            if (Card.sameCard (d.cards[i], card)) return i;
        }
        return -1;
    }

// The following are codes from previous exercises, also essential for the exercise code to run
    public static double randomDouble (double low, double high) {
        if (low > high)return randomDouble (high, low); // takes care of a minor error in logic
        return (low + ((Math.random())*(high-low)));
    }

    public static int randomInt (int low, int high) {
        return ((int) randomDouble (low, high));
    }
    
    public static void swapCard(Deck d, int x,int y){
        Card temp= new Card();
        temp= d.cards[x];
        d.cards[x]= d.cards[y];
        d.cards[y]= temp;
    }
//------------------------------------------------------------------------------------------------

    /**
     * Shuffles the given Deck, caution: the function is a modifier.
     * 
     * @param  d  The deck to be shuffled.
     */
    public static void shuffleDeck (Deck d) {
        for (int i =0; i<d.cards.length; i++) {
            int x = randomInt (i, d.cards.length);
            swapElement(d, i, x);
        }
    }

    /**
     * An extension of shuffleDeck(Deck) really, shuffles the Deck indicated number of times, to achieve greater randomnes.
     * 
     * @param  d  The deck to be shuffled.
     * @param  t  The number of times the deck has to be shuffled.
     */
    public static void shuffleDeck (Deck d, int t) {
        for (int i =0; i<t; i++) {
            shuffleDeck (d);
        }
    }

    // The following is a helper method, not worthy of documentation
    public static void swapElement (Deck d, int i, int x) {
        Card hold = d.cards[i];
        d.cards[i] = d.cards[x];
        d.cards[x] = hold;
    }

    /**
     * 12.1, converting findBisect to a method in the Deck class.
     * 
     * @param d  The Deck in which to look for the card.
     * @param c  the Card to look for in the Deck.
     * 
     * @return  Integer containing the index of the first appearance of c in d.
     */
    public static int findBisect (Deck d, Card c) {
        if (d.cards.length == 0) return 0;
        else if (d.cards.length == 1) return 1;
        int mid = d.cards.length/2;
        int comp = Card.compareCard(d.cards[mid], c);
        if (comp == 0) return mid;
        else if (comp > 0) {
            Deck deck = new Deck (mid-1);
            for (int i = 0; i<deck.cards.length; i++) {
                deck.cards[i] = d.cards[i];
            }
            return findBisect(deck, c);
        } else {
            Deck deck = new Deck (d.cards.length-mid-1);
            for (int i = 0; i<deck.cards.length; i++) {
                deck.cards[i] = d.cards[mid + 1];
                mid++;
            }
            return findBisect(deck, c);
        }
    }
    
// The following are methods converted from the Card class to the Deck class
    public static int handScore (Deck d) {
        Card[] ar = d.cards;
        int x = 0;
        for (int i =0; i< ar.length; i++) {
            if (ar[i].rank > 10) x += (ar[i].rank-10);
        }
        int result = 0;
        for (int i =0; i< ar.length; i++) {
            result += ar[i].rank;
        }
        return result-x;
    }
    
    public static int[] suitHist (Deck d) {
        Card[] ar = d.cards;
        int[] hist = {0, 0, 0, 0};
        for (int i = 0; i<ar.length; i++) {
            hist[ar[i].suit]++;
        }
        return hist;
    }
    
    
//-------------------------------------------------------------------------------------------------
    /**
     * Finds the lowest card in the given Deck and range.
     * 
     * @param  d  The deck in which to look.
     * @param  l  The lower bound of the range(included).
     * @param  h  The upper bound of the range(excluded).
     * 
     * @return  The index of the lowest card in the given Deck and specified range.
     */
    public static int findLowestCard (Deck d, int l, int h) {
       int a = l;
        Card x;
        for(int i=l;i < h;i++){
            x = d.cards[i];
            if(Card.compareCard(x, d.cards[a]) < 0){
                a = i;
            }
        }
        return a;  
    }
    
    /**
     * 12.3, Sorts a shuffled Deck, modifies the given Deck.
     * 
     * @param  d  The deck to be sorted.
     */
    public static void sortDeck (Deck d) {
        for(int i= 0;i < d.cards.length;i++){
            swapCard(d, i,findLowestCard(d, i, d.cards.length));
        } 
    }
    
    /**
     * 12.4 Adds a Card in a Deck at a random location.
     * 
     * @param  d  The Deck in which the Card has to be added.
     * @param  c  The Card to be added.
     */
    public static void incrementalShuffle (Deck d, Card c) {
        Deck hold = new Deck (d.cards.length);
        for (int i =0; i<hold.cards.length; i++) {
           hold.cards[i] =d.cards[i];
        }
        d = new Deck (hold.cards.length+1);
        int r = randomInt(0, d.cards.length);
        int j = 0;
        for (int i = 0; i< d.cards.length; i++) {
            if (i != r) d.cards[i] = hold.cards[j];
            if (i == r) j--;
            j++;
        }
        d.cards[r] = c;
        printDeck(d);
    }
    
    /**
     * Helper Method: histogram of ranks.
     */
    public static int[] rankHist (Deck d) {
        Card[] ar = d.cards;
        int[] hist = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i<ar.length; i++) {
            hist[ar[i].rank]++;
        }
        return hist;
    }
    
    /**
     * 12.5, checking whether a hand contains a 'flush'.
     * 
     * @param  d  The specified subDeck.
     * @return  A boolean indicating whether the hand contains a 'flush'.
     */
    public static boolean isFlush (Deck d) {
        if (d.cards.length!=5) return false;
        int s = d.cards[0].suit;
        if (d.cards[1].suit == s && d.cards[2].suit == s && d.cards[3].suit == s && d.cards[4].suit == s) return true;
        return false;
    }
    
    /**
     * 12.5, checking whether a hand contains a 'flush'.
     * 
     * @param  d  The specified subDeck.
     * @return  A boolean indicating whether the hand contains a 'flush'.
     *
    public static boolean isFlush (Deck d, boolean dummy) {
        sortDeck(d, true);
        int c = 0;
        for (int i = 0; i < d.cards.length-1; i++) {
            if (d.cards[i].suit != d.cards[i+1].suit) c++;
        }
        return (c<(d.cards.length-6));
    }*/
    
    /**
     * 12.5, checking whether a hand contains a 'three of a kind'.
     * 
     * @param  d  The specified subDeck.
     * @return  A boolean indicating whether the hand contains a 'three of a kind'.
     */
    public static boolean hasThreeKind (Deck d) {
        if (d.cards.length!=5) return false;
        int r = d.cards[0].rank;
        int differenceCounter = 0;
        for (int i = 1; i < 5; i++) {
            if (d.cards[i].rank != r) differenceCounter++;
        }
        return (differenceCounter<3);
    }
    
    /**
     * 12.5, checking whether a hand contains a 'pair'.
     * 
     * @param  d  The specified subDeck.
     * @return  A boolean indicating whether the hand contains a 'pair'.
     */
    public static boolean hasPair (Deck d) {
        int [] hist = rankHist (d);
        for (int i = 0; i < hist.length; i++) {
            if (hist[i]>1) return true;
        }
        return false;
    }
    
    /**
     * 12.5, checking whether a hand contains a 'two pair'.
     * 
     * @param  d  The specified subDeck.
     * @return  A boolean indicating whether the hand contains a 'two pair'.
     */
    public static boolean hasTwoPair (Deck d) {
        int [] hist = rankHist (d);
        int r = 0;
        for (int i = 0; i < hist.length; i++) {
            if (hist[i]>1) r++;
        }
        return (r>1);
    }
    
    /**
     * Helper Method: Finds the lowest card in the given Deck and range[ranks get priority over suit].
     * 
     * @param  d  The deck in which to look.
     * @param  l  The lower bound of the range(included).
     * @param  h  The upper bound of the range(excluded).
     * 
     * @return  The index of the lowest card in the given Deck and specified range.
     */
    public static int findLowestCard (Deck d, int l, int h, boolean dummy) {
       int a = l;
        Card x;
        for(int i=l;i < h;i++){
            x = d.cards[i];
            if(Card.compareCard(x, d.cards[a], true) < 0){
                a = i;
            }
        }
        return a;  
    }
    
    /**
     * Helper Method: Sorts a shuffled Deck, modifies the given Deck[ranks get a priority over suits].
     * 
     * @param  d  The deck to be sorted.
     */
    public static void sortDeck (Deck d, boolean dummy) {
       for(int i= 0;i < d.cards.length;i++){
            swapCard(d, i,findLowestCard(d, i, d.cards.length, true));
        } 
    }
    
    /**
     * 12.5, checking whether a hand contains a 'straight'.
     * 
     * @param  d  The specified subDeck.
     * @return  A boolean indicating whether the hand contains a 'straight'.
     */
    public static boolean isStraight (Deck d) {
        sortDeck(d, true);
        int x= d.cards[0].rank; 
        for(int i= 0;i < d.cards.length;i++){
            if(d.cards[i].rank != x) return false;
            x++;
        }
        return true;
    }
    
    /**
     * 12.5, checking whether a hand contains a 'full house'.
     * 
     * @param  d  The specified subDeck.
     * @return  A boolean indicating whether the hand contains a 'full house'.
     */
    public static boolean isFullHouse (Deck d) {
        if (!hasThreeKind(d)) return false;
        int [] hist = rankHist(d);
        for (int i = 0; i < hist.length; i++) {
            if (hist[i] == 2) return true;
        }
        return false;
    }
    
    /**
     * 12.5, checking whether a hand contains a 'four of a kind'.
     * 
     * @param  d  The specified subDeck.
     * @return  A boolean indicating whether the hand contains a 'four of a kind'.
     */
    public static boolean hasFourKind (Deck d) {
        int [] hist = rankHist (d);
        for (int i = 0; i < hist.length; i++) {
            if (hist[i]==4) return true;
        }
        return false;
    }
    
    /**
     * 12.5, checking whether a hand contains a 'Straight Flush'.
     * 
     * @param  d  The specified subDeck.
     * @return  A boolean indicating whether the hand contains a 'Straight Flush'.
     */
    public static boolean isStraightFlush (Deck d) {
        return (isStraight(d) && isFlush(d));
    }
    
    /**
     *
     * 12.5, generating poker hands.
     */
    public static void pokerHandGen () {
        Deck deck = new Deck ();
        shuffleDeck (deck);
        int j = 0;
        for (int i = 0; i < 4; i++) {
            printDeck (subDeck(deck, j, j+5));
            j+=5;
        }
    }

    /**
     * Helper Method: Returns a sudDeck.
     * 
     * @param  d  The Deck.
     * @param  lowIndex  The index specifying the lower bound of the Deck (included).
     * @param  highIndex  The index specifying the upper bound of the Deck (excluded).
     * 
     * @return  The subDeck of this Deck specified by the range.
     */
    public static Deck subDeck (Deck d, int lowIndex, int highIndex) {
        Deck deck = new Deck (highIndex-lowIndex);
        //System.arraycopy(d, lowIndex, deck.cards, 0, highIndex-lowIndex);
        for (int i = 0; i < deck.cards.length; i++){
            //printDeck (deck);
            deck.cards[i] = d.cards[i+lowIndex];
        }
        return deck;
    }
    
    /**
     * 12.5, estimating poker hand probabilities.
     */
    public static void pokerHandAnalysis () {
        //int flushCounter = 0;
        //int threeKindCounter = 0;
        int[] c= new int[8];
        Deck deck = new Deck ();
        shuffleDeck (deck);
        int j = 0;
        Deck temp;
        for (int i = 0; i < 200000; i++) {
            if (j>47) {
                shuffleDeck (deck);
                j=0;
            }
            temp = (subDeck(deck, j, j+5));
            if (hasPair(temp)) c[0]++;
            if (hasTwoPair(temp)) c[1]++;
            if (hasThreeKind(temp)) c[2]++;
            if (isStraight(temp)) c[3]++;
            if (isFlush(temp)) c[4]++;
            if (isFullHouse(temp)) c[5]++;
            if (hasFourKind(temp)) c[6]++;
            if (isStraightFlush(temp)) c[7]++;
            j+=5;
        }
        System.out.println("Pairs:\t\t" + c[0]);
        System.out.println("Two Pairs:\t\t" + c[1]);
        System.out.println("Three of a Kind:\t\t" + c[2]);
        System.out.println("Straights:\t\t" + c[3]);
        System.out.println("Fushes:\t\t" + c[4]);
        System.out.println("Full Houses:\t\t" + c[5]);
        System.out.println("Four of a Kind:\t\t" + c[6]);
        System.out.println("Straight Flushes:\t\t" + c[7]);
        //System.out.println("Flushes: " + flushCounter + " ; Three Of A Kinds: " + threeKindCounter + "\nTotal Hands Generated: 200000");
        //System.out.println("\n\tSeven Card Hands: ");
    }
    
    /**
     * 12.7,  A method implemeting mergeSort, an efficient sorting algorithm.
     * 
     * @param  d  The Deck to be sorted.
     * @return  The sorted Deck [in ascending order].
     */
    public static Deck mergeSort(Deck d) {
        if (d.cards.length == 0 || d.cards.length == 1) return d;
        Deck d1 = new Deck(1);
        d1.cards[0] = d.cards[0];
        Deck d2 = new Deck (d.cards.length - 1);
        for (int i = 0; i<d2.cards.length; i++) {
            d2.cards[i] = d.cards[++i];
        }
        Deck d3 = mergeSort(d2);
        return merge(d1, d3);
    }
    
    /**
     * Merges 2 sorted subDecks into 1 Deck, in ascending order
     * 
     * @param  d1  The 1st subDeck
     * @param  d2  The second subDeck
     * @return   The merged, and hence sorted Deck
     */
    public static Deck merge (Deck d1, Deck d2) {
        Deck result = new Deck (d1.cards.length + d2.cards.length);
        int i =0, j =0;
        Card w;
        for (int k = 0; k<result.cards.length; k++ ) {
            if (i>=d1.cards.length)w = d2.cards[j];
            else if (j>=d2.cards.length)w = d1.cards[i];
            else {
                int hold = Card.compareCard(d1.cards[i], d2.cards[j]);
                if (hold==1)w = d1.cards[i];
                else w = d2.cards[j];
            }
            result.cards[k] = w;
            if (Card.compareCard(w, d1.cards[i])==0)i++;
            else j++;
        }
        return result;
    }
}

