package com.tdd.domain;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    /**
     * 곱수에 곱하기한 Franc객체 생성.
     */
    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }
}
