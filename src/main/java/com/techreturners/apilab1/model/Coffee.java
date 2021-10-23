package com.techreturners.apilab1.model;

public class Coffee {

    private long id;
    private String coffeeName;

    public Coffee(long id, String latte) {

        this.id = id;
        this.coffeeName = latte;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }
}
