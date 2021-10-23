package com.techreturners.apilab1.model;

public class Tea {
    public Long id;
    public String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Tea(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
