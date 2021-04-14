package com.study.money;

public class Money {

    protected int amount;
    protected String currency;

    Money times(int amount) {
        return null;
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    String currency() {
        return currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
