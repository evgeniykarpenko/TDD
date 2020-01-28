package ru.izifrag.tdd;


public class Dollar extends Money {

    private String currency;

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplayer) {
        return Money.dollar(amount * multiplayer);
    }

    public static void main(String[] args) {

    }

    @Override
    String currency() {
        return currency;
    }
}
