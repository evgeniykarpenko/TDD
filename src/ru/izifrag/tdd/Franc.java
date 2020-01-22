package ru.izifrag.tdd;


public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplayer) {
        return new Franc(amount * multiplayer);
    }

    public static void main(String[] args) {

    }

}
