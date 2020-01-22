package ru.izifrag.tdd;


import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, five.amount);
        product = five.times(3);
        assertEquals(15, five.amount);
    }

    @Test
    public void testEquals() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}
