public enum Rank {

    // can change these int values depending on what game is played. Can pass in any type of object depending on whats needed. Sort of similar to Key-Value hash
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private final int value;     // final = const from JS
    Rank(int value){   // gives constructor to Enum
        this.value = value;  // attaches int value to every enum
    }

    public int getValue(){
        return value;
    }
}