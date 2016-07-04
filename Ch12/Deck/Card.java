class Card {
    int suit, rank;

    /**
     * Constructor for objects of class Card
     */
    public Card() {
        this.suit = 0;
        this.rank = 0;
    }

    /**
     * Constructor for objects of class Card
     */
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    public static void printCard (Card c) {
        String[] ar = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] a = {"narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        System.out.println (a[c.rank] + " of " + ar[c.suit]);
    }

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
    
    public static int compareCard (Card c1, Card c2, boolean dummy) {
        if (c1.rank > c2.rank) return 1;
        if (c1.rank < c2.rank) return -1;
        if (c1.suit > c2.suit) return 1;
        if (c1.suit < c2.suit) return -1;
        else return 0;
    }
    
    public static boolean sameCard (Card c1, Card c2) {
        return (compareCard(c1, c2) == 0);
    }
}