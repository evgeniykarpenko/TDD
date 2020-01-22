package ru.izifrag.tdd;


public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplayer) {
        return new Dollar(amount * multiplayer);
    }

    public static void main(String[] args) {

    }

}
