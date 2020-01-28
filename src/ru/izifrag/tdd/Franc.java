package ru.izifrag.tdd;


public class Franc extends Money {

    private String currency;

    Franc(int amount, String currency) {
       super(amount, currency);
    }

    Money times(int multiplayer) {
        return Money.franc(amount * multiplayer);
    }

    public static void main(String[] args) {

    }

    @Override
    String currency() {
        return currency;
    }
}
