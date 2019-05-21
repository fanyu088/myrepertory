package com.example.RO;


public class UserRO1 {
    private String name;
    private String adress;
    private Integer id;
    private boolean flag;


    public UserRO1(String name, String adress, Integer id, boolean flag) {
        this.name = name;
        this.adress = adress;
        this.id = id;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "UserRO1{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", id=" + id +
                ", flag=" + flag +
                '}';
    }
}
