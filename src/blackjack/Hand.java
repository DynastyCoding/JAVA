package blackjack;

import java.util.List;
import java.util.ArrayList;

public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getValue() {
        int total = 0;
        int ace = 0;

        for (Card eachCard : cards) {
            total += eachCard.getValue();
            if (eachCard.getRank().equals("A")) {
                ace++;
            }
        }
        while (total > 21 && ace > 0) {
            total -= 10;
            ace--;
        }
        return total;
    }

    public boolean isBust() {
        return getValue() > 21;
    }

    public void showHandCards() {
        for (Card eachCard : cards) {
            System.out.print(eachCard + " ");
        }
        System.out.println("(Points: " + getValue() + ")");
    }
}