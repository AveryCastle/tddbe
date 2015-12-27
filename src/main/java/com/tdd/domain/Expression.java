package com.tdd.domain;

public interface Expression {

    Money reduce(Bank bank, String to);
}
