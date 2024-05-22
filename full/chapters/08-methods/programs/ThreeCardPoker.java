public class ThreeCardPoker {
    public static final String[] SUITS = {"Spades", "Hearts", //<.>
        "Diamonds", "Clubs"};
    public static final String[] RANKS = {"2", "3", "4", "5", "6",
        "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};   
    public static final int STRAIGHT_FLUSH = 40; //<.>
    public static final int THREE_OF_A_KIND = 30;
    public static final int STRAIGHT = 6;
    public static final int FLUSH = 2;  
    public static final int PAIR = 1;
    public static final int NOTHING = 0;

    public static void main(String[] args) {
        int[] deck = new int[52]; //<.>
        int[] hand = new int[3];                
        for(int i = 0; i < deck.length; i++) //<.>
            deck[i] = i;
        shuffle(deck);
        for(int i = 0; i < hand.length; i++) //<.>
            hand[i] = deck[i];      
        int winnings = score(hand); //<.>
        System.out.println("Hand: ");
        print(hand);
        if(winnings == 0) //<.>
            System.out.println("You win nothing.");
        else
            System.out.println("You win " + winnings +
            " times your bet.");
    }

    public static void shuffle(int[] deck) {
        int index, temp;
        for(int i = 0; i < deck.length; i++) {
            index = i + (int)((deck.length - i)*Math.random());
            temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }       
    }

    public static void print(int[] hand) { //<.>
        for(int i = 0; i < hand.length; i++)
            System.out.println(RANKS[getRank(hand[i])] + " of "
            + SUITS[getSuit(hand[i])]);
    }

    public static int getRank(int value) { return value % 13; } //<.>
    public static int getSuit(int value) { return value / 13; } //<.>
    
    private static int score(int[] hand) {  
        sortByRank(hand); 
        if(hasStraight(hand) && hasFlush(hand))
            return STRAIGHT_FLUSH;
        if(hasThree(hand))
            return THREE_OF_A_KIND;
        if(hasStraight(hand))
            return STRAIGHT;
        if(hasFlush(hand))
            return FLUSH;
        if(hasPair(hand))
            return PAIR;        
        return NOTHING;
    }   

    private static void sortByRank(int[] hand) {
        int smallest, temp;
        for(int i = 0; i < hand.length - 1; i++) {
            smallest = i;
            for(int j = i + 1; j < hand.length; j++) {
                if(getRank(hand[j]) < getRank(hand[smallest]))
                    smallest = j;
            }
            temp = hand[smallest];
            hand[smallest] = hand[i];
            hand[i] = temp;
        }
    }

    private static boolean hasPair(int[] hand) { //<.>
        return getRank(hand[0]) == getRank(hand[1]) ||
               getRank(hand[1]) == getRank(hand[2]);
    }

    private static boolean hasThree(int[] hand) { //<.>
        return getRank(hand[0]) == getRank(hand[1]) &&
               getRank(hand[1]) == getRank(hand[2]);
    }

    private static boolean hasFlush(int[] hand) { //<.>
        return getSuit(hand[0]) == getSuit(hand[1]) &&
               getSuit(hand[1]) == getSuit(hand[2]);
    }

    private static boolean hasStraight(int[] hand) { //<.>
        return (getRank(hand[0]) == 0 && getRank(hand[1]) == 1
                && getRank(hand[2]) == 12) || //ace low
               (getRank(hand[1]) == getRank(hand[0]) + 1 &&
                getRank(hand[2]) == getRank(hand[1]) + 1);
    }   
}
