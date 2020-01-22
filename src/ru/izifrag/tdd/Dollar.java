package ru.izifrag.tdd;


public class Dollar {

    private int amount = 10;

    public Dollar(int amount) {
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
