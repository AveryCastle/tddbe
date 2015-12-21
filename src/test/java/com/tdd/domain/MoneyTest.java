package com.tdd.domain;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {

    @Test
    public void testEquals() throws Exception {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(10)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
}
