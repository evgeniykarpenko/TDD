package ru.izifrag.tdd;


public class Dollar {

    int amount = 10;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplayer) {
        return new Dollar(amount * multiplayer);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

    public static void main(String[] args) {

    }

}
