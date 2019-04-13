package com.example.RO;

import lombok.Data;


public class UserRO {
    private String name;
    private String adress;
    private Integer id;

    public UserRO(String name, String adress, Integer id) {
        this.name = name;
        this.adress = adress;
        this.id = id;
    }

    public UserRO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
