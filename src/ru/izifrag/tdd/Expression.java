package ru.izifrag.tdd;

public interface Expression {
    Money reduce(Bank bank, String to);
}
