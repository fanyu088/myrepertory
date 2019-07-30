package com.example.demo16;

import java.io.Serializable;

/**
 * @auther FanYu
 * @date 2019/6/9 16:52
 */
public enum Enums_test implements Serializable {

    SUCCESS(0,"你真棒（捧读）"),
    DEFETE(1,"awsl");

    private int code;
    private String msg;

    Enums_test(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
