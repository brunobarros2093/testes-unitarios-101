package org.example.models;

public class Dollar extends Money {

    private String currency;

    public Dollar(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    protected String currency() {

        return currency;
    }

    public Money times(int multiplier){
       return new Dollar( amount * multiplier, "USD");
    }


}
