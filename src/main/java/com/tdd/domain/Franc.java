package com.tdd.domain;

/**
 * Created by seongjuhyeon on 11/26/15.
 */
public class Franc extends Money {

    public Franc(final int amount) {
        this.amount = amount;
    }

    /**
     * 곱수에 곱하기한 Franc객체 생성.
     */
    public Money times(final int multiplier) {
        return new Franc(amount * multiplier);
    }
}
