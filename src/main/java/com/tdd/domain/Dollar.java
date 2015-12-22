package com.tdd.domain;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    /**
     * 곱수에 곱하기한 Dollar객체 생성.
     */
    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }
}
