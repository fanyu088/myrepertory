package com.example.RO;

import lombok.Data;

@Data
public class Obj {

    private String name;
    private Integer scope;

    public Obj(String name, Integer scope) {
        this.name = name;
        this.scope = scope;
    }
}
