package ru.izifrag.tdd;


public class Dollar {

    int amount = 10;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times (int multiplayer) {
        amount *= multiplayer;
        return null;
    }

    public static void main(String[] args) {

    }

}
