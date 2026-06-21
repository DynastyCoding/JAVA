package blackjack;

public class Dealer {
    private Hand hand;
    private String name;

    public Dealer(){
        this.name="bookmaker";
        this.hand=new Hand();
    }

    public Hand getHand(){
        return hand;
    }

    public void draw(Deck deck){
        hand.addCard(deck.draw());
    }

    public boolean wantHit(){
        if(hand.getValue()<17){
            return true;
        }else{
            return false;
        }
    }

    public void showHand(){
        System.out.println("bookmaker's hand: ");
        hand.showHandCards();
    }
}
