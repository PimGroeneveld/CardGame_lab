public class Card {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue(){
        return this.rank.getValue();
    }

    public int getMaxValue(){
        int value;
        if (this.rank.getValue() == 1){
            value = 11;
        } else {
            value = this.rank.getValue();
        }
        return value;
    }

    public int getMinValue(){
        int value;
        if (this.rank.getValue() == 1){
            value = 1;
        } else {
            value = this.rank.getValue();
        }
        return value;
    }
}
