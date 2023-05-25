package org.example.models;

public abstract class Money {

    protected int amount;
    protected abstract String currency();
    public abstract Money times(int multiplier);
    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && this.getClass().equals(obj.getClass());
    }
}
