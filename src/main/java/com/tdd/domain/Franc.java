package com.tdd.domain;

/**
 * Created by seongjuhyeon on 11/26/15.
 */
public class Franc extends Money {

    public Franc(final int amount) {
        this.amount = amount;
    }

    public Franc times(final int multiplier) {
        return new Franc(amount * multiplier);
    }
}
