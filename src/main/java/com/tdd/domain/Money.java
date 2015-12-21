package com.tdd.domain;

/**
 * Created by seongjuhyeon on 12/1/15.
 */
public abstract class Money {

    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public abstract Money times(int multiplier);

    public static Money franc(int amount) {
        return new Franc(amount);
    }
}
