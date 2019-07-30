package com.example.RO;

import com.example.demo16.Enums_test;
import lombok.Data;

/**
 * @auther FanYu
 * @date 2019/6/9 16:58
 */
@Data
public class Response {

    private Integer code;
    private String msg;

    public Response() {
    }

    private Response(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    private static Response of(int code, String msg) {
        return new Response(code, msg);
    }

    public static Response ofError(Enums_test enums_test) {
        return of(enums_test.getCode(), enums_test.getMsg());
    }


}
