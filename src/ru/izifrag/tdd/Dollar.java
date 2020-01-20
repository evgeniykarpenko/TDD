package ru.izifrag.tdd;


public class Dollar {

    int amount = 10;

    public Dollar(int amount) {
        this.amount = amount;
    }

    void times (int multiplayer) {
        amount *= multiplayer;
    }

    public static void main(String[] args) {

    }

}
