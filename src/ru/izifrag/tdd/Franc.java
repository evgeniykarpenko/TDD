package ru.izifrag.tdd;


public class Franc extends Money {

    private String currency;

    Franc(int amount, String currency) {
        super(amount, currency);
    }
}
