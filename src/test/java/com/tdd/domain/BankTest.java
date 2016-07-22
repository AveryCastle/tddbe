package com.tdd.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankTest {

    @Test
    public void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }
}
