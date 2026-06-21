package blackjack;

import java.util.ArrayList;//裝牌容器
import java.util.Collections;//提供洗牌方法 shuffle()
import java.util.List;//Arraylist介面

public class Deck {
    private List<Card> cards;
    private int top;

    public Deck() {
        init();
        shuffle();
    }

    public void init() {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        cards = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
        top = 0;
    }

    public void shuffle() {
        Collections.shuffle(cards);
        top = 0;
    }

    public Card draw(){
        if(top>=cards.size()){
            System.out.println("The deck is empty. Reshuffle the cards.");
            init();
            shuffle();
        }
        return cards.get(top++);
    }

    public int remain(){
        return cards.size() - top;
    }

    public void addDeck(Deck other){
        cards.addAll(other.cards);
    }
}
