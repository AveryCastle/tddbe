package com.tdd.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {

    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }
}
