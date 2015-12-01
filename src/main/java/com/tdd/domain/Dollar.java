package com.tdd.domain;

/**
 * Created by seongjuhyeon on 11/21/15.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    /**
     * 곱수에 곱하기한 Dollar객체 생성.
     */
    public Dollar times(final int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
