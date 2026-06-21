package blackjack;

import java.util.Scanner;

public class Game {
    private Deck deck;
    private Player player;
    private Dealer dealer;

    public Game() {
        deck = new Deck();
        player = new Player("Player");
        dealer = new Dealer();
    }

    public void start() {
        do {

            if (deck.remain() < 10) {
                System.out.println("There are " + deck.remain() + " cards left in the deck." +
                        "Continue with the second deck of cards");
                Deck newDeck = new Deck();
                newDeck.shuffle();
                deck.addDeck(newDeck);
            }

            player = new Player("Player");
            dealer = new Dealer();

            player.draw(deck);
            dealer.draw(deck);
            player.draw(deck);
            dealer.draw(deck);

            player.showHand();
            dealer.showHand();

            boolean playerBust = false;

            while (player.wantHit()) {
                player.draw(deck);
                player.showHand();
                if (player.getHand().isBust()) {
                    System.out.println("Player is bust! game over!");
                    playerBust = true;
                    break;
                }
            }

            if (!playerBust) {
                System.out.println("bookmaker's turn");
                dealer.showHand();
                boolean dealerBust = false;

                while (dealer.wantHit()) {
                    System.out.println("bookmaker hits...");
                    dealer.draw(deck);
                    dealer.showHand();
                    if (dealer.getHand().isBust()) {
                        System.out.println("bookmaker is bust, player win!");
                        dealerBust = true;
                        break;
                    }
                }
                if (!dealerBust) {
                    compare();
                }
            }
        } while (playContinue());
    }

    private void compare() {
        int playerScore = player.getHand().getValue();
        int dealerScore = dealer.getHand().getValue();

        System.out.println("=== Result ===");
        System.out.println("player's point: " + playerScore);
        System.out.println("dealer's point: " + dealerScore);

        if (playerScore > dealerScore) {
            System.out.println("Congratulation, you win!");
        } else if (playerScore < dealerScore) {
            System.out.println("Dealer win, you lose.");
        } else {
            System.out.println("Draw!");
        }
    }

    private boolean playContinue() {
        System.out.println("Continue game?(y/n): ");
        return new Scanner(System.in).nextLine().equals("y");
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}