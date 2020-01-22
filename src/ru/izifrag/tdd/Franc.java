package ru.izifrag.tdd;


public class Franc {

    int amount = 10;

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplayer) {
        return new Franc(amount * multiplayer);
    }

    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

    public static void main(String[] args) {

    }

}
