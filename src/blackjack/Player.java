package blackjack;

import java.util.Scanner;

public class Player {
    private Hand hand;
    private String name;

    static Scanner in = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public void draw(Deck deck) {
        hand.addCard(deck.draw());
    }

    public boolean wantHit() {
        while (true) {
            System.out.printf("%s, Need to draw a card?(y/n)%n", name);
            String ans = in.nextLine();
            if (ans.equals("y")) {
                return true;
            } else if (ans.equals("n")) {
                return false;
            } else {
                System.out.println("Invalid input, please reenter.");
            }
        }
    }

    public void showHand() {
        System.out.println(name + "'s hand: ");
        hand.showHandCards();
    }

}
