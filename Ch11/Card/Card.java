/**
 * Contains all the exercises of Chapter 11, as they all require Card objects
 * 
 * @author Kaivalya Rawal
 * @version 12/04/2011
 */
class Card {
    int suit, rank;

    /**
     * Constructor for objects of class Card (suit: clubs, rank: ace)
     */
    public Card() {
        this.suit = 0;
        this.rank = 1;
    }

    /**
     * Constructor for objects of class Card
     */
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    /**
     * 11.0; Compares 2 cards, suit gets priority over rank
     * 
     * @param  c1  Card 1
     * @param  c2  Card 2
     * @return     1 if c1 > c2, 0 if they are equal, and -1 if c1 < c2 
     */
    public static int compareCard (Card c1, Card c2) {
        if (c1.suit>c2.suit) return 1;
        else if (c1.suit<c2.suit) return-1;
        else {
            if (c1.rank == 1)c1.rank = 14; 
            if (c2.rank == 1)c2.rank = 14;
            if (c1.rank>c2.rank) {
                if (c1.rank == 14)c1.rank = 1;
                return 1;
            } else if (c1.rank<c2.rank) {
                if (c2.rank == 14)c2.rank = 1;
                return -1;
            } else {
                if (c1.rank == 14)c1.rank = 1;
                if (c2.rank == 14)c2.rank = 1;
                return 0;
            }
        }
    }
            
    /**
     * 11.1: Builds a deck of cards, sorted like a new one: with all the cards of one suite clubbed, and in order of ranks
     * 
     * @return     An array of Cards(a deck) 
     */
    public static void buildDeck () {
        Card[] deck = new Card[52];
        int i = 0;
        for (int s = 0; s<4; s++) {
            for (int r = 1; r<14; r++) {
                deck[i] = new Card(s, r);
                i++;
            }
        }
    }
    
    /**
     * 11.2: Calculates the total score of a subDeck (array of cards, hand) using an explicitly stated scoring system from the question
     * 
     * @param  ar  A subDeck (an array of Cards, hand)
     * @return     Integer containing the total value of the cards 
     */
    public static int handScore (Card[] ar) {
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
    
    /**
     * 11.3: Takes a String and returns a Card equivalent to the String if it is in currect format, otherwise the reference is null
     * 
     * @param  s  A String [of the format --- of ---]
     * @return   A card equivalent of the String 
     */
    public static Card parseCard(String s) {
        Card emptyCard = null;
        String[] suits = {" ", "Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"n", "Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        String sr = s.substring(0, s.indexOf(' '));
        String ss = s.substring (s.lastIndexOf(' ')+1, s.length()-1);
        int holdRank = 0;
        for (int i=0; i<ranks.length; i++) {
            if (ranks[i].equals(sr)) holdRank = i;
        }
        if (holdRank == 0) return emptyCard;
        int holdSuit = 0;
        for (int i=0; i<suits.length; i++) {
            if (ranks[i].equals(sr)) holdSuit = i;
        }
        if (holdSuit == 0)return emptyCard;
        Card result = new Card (holdSuit-1, holdRank);
        return result;
    }
    
    /**
     * 11.4: Generates a histogram of the suits in a subDeck (array of cards, hand)
     * 
     * @param  ar  An array of cards
     * @return   A Histogram equivalent of the given subDeck (array of cards, hand)
     */
    public static int[] suitHist (Card[] ar) {
        int[] hist = {0, 0, 0, 0};
        for (int i = 0; i<ar.length; i++) {
            hist[ar[i].suit]++;
        }
        return hist;
    }
    
    /**
     * 11.5: Tests whether or not a given subDeck is a flush(Poker)
     * 
     * @param  ar  a subDeck (an array of cards, a hand)
     * @return   boolean indicating whether or not the given subDeck (an array of cards, a hand) contains a flush
     */
    public static boolean isFlush (Card[] ar) {
        int[] h = suitHist(ar);
        if (h[0] > 4 || h[1] > 4 || h[2] > 4|| h[3] > 4) return true;
        else return false;
    }
}
