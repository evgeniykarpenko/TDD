package ru.izifrag.tdd;

public class Money implements Expression {

    protected int amount;
    protected String currency;

    protected String currency() {
        return currency;
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency.equals(money.currency);
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    Expression plus(Money addent) {
        return new Sum(this, addent);
    }

    public Money reduce(String to) {
        return this;
    }
}
