package com.tdd.domain;

/**
 * Created by seongjuhyeon on 12/1/15.
 */
public class Money {

    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
