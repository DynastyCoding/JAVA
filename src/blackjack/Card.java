package blackjack;

public class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        if (rank.equals("A")) {
            return 11;
        } else if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
            return 10;
        } else {
            return Integer.parseInt(rank);
        }
    }

    public String getRank(){
        return rank;
    }

    public String toString() {
        return suit + rank;
    }
}
