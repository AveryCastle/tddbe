package com.tdd.domain;

/**
 * Created by seongjuhyeon on 11/26/15.
 */
public class Franc {

    public int amount;

    public Franc(final int amount) {
        this.amount = amount;
    }

    public Franc times(final int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
