package com.tdd.domain;

/**
 * Created by seongjuhyeon on 11/21/15.
 */
public class Dollar {

    private int amount = 0;

    public Dollar(int amount) {
        this.amount = amount;
    }

    /**
     * 곱수에 곱하기한 Dollar객체 생성.
     */
    public Dollar times(final int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        // TODO: NULL 값이나 다른 객체와의 비교
        Dollar dollar = (Dollar)object;
        return amount == dollar.amount;
    }
}
