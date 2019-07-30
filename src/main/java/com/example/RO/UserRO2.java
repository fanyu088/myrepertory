package com.example.RO;


import java.util.Arrays;

public class UserRO2 {
    private String name;
    private String adress;
    private Integer id;
    private boolean flag;
    private Double amount;

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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "UserRO2{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", id=" + id +
                ", flag=" + flag +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {

        String s = "5.5.9.1";
        String[] split = s.split("\\.");
        Double ss = Double.valueOf(split[1]+"."+split[2]);

        System.out.println(Arrays.toString(split));

        System.out.println(ss);
    }
}
