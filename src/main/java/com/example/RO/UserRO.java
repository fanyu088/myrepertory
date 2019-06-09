package com.example.RO;

import lombok.Data;


public class UserRO {
    private String name;
    private String adress;
    private Integer id;
    private boolean flag;

    public UserRO(String name, String adress, Integer id) {
        this.name = name;
        this.adress = adress;
        this.id = id;
    }

    public UserRO(String name, boolean flag) {
        this.name = name;
        this.flag = flag;
    }

    public UserRO(String name, String adress, Integer id, boolean flag) {
        this.name = name;
        this.adress = adress;
        this.id = id;
        this.flag = flag;
    }

    public UserRO() {
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
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

    @Override
    public String toString() {
        return "UserRO{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", id=" + id +
                ", flag=" + flag +
                '}';
    }
}
