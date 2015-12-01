package com.tdd.domain;

import com.tdd.domain.Dollar;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.tdd.domain.Dollar;

/**
 * Created by seongjuhyeon on 11/21/15.
 */
public class MoneyTest {

    @Test
    public void testEquals() throws Exception {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(10)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(10)));
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }
}
