package com.example.demo14Sign;

import javafx.beans.value.ObservableBooleanValue;
import org.omg.CORBA.MARSHAL;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BigDecimal_test {
    public static void main(String[] args) {

        Map<String,Object> map = new HashMap();
        map.put("rechargeTotal",0.00);
        int a = (Double)(map.get("rechargeTotal")) == 0 ? 0 : 1;

        BigDecimal bigDecimal = new BigDecimal("20.00");
        BigDecimal bigDecimal1 = new BigDecimal("25.000");
        BigDecimal bigDecimal2 = new BigDecimal("25.0");

        BigDecimal result = bigDecimal.add(bigDecimal1).subtract(bigDecimal2);
        boolean b = bigDecimal == bigDecimal2;
        boolean c = bigDecimal1.equals(bigDecimal2);
        boolean d = bigDecimal1.compareTo(bigDecimal2)==0;


        System.out.println(a);
        System.out.println("-----------------------------");
        System.out.println(b);
        System.out.println("-----------------------------");
        System.out.println(c);
        System.out.println("-----------------------------");
        System.out.println(d);
        System.out.println("-----------------------------");
        System.out.println(result);
    }
}
