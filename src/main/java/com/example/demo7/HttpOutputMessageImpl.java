package com.example.demo7;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpOutputMessage;

import java.io.IOException;
import java.io.OutputStream;

/**
 *      * {@link org.springframework.http.HttpOutputMessage}
 *      * {@link org.springframework.http.converter.HttpMessageConverter}
 *     
 */
public class HttpOutputMessageImpl implements HttpOutputMessage {


    private final OutputStream body;

    private final HttpHeaders headers;


    public HttpOutputMessageImpl(OutputStream body, HttpHeaders headers) {
        this.body = body;
        this.headers = headers;
    }


    @Override

    public OutputStream getBody() throws IOException {
        return body;
    }


    @Override


    public HttpHeaders getHeaders() {
        return headers;
    }


}


