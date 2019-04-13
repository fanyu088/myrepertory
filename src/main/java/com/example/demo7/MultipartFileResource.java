package com.example.demo7;

import org.springframework.core.io.InputStreamResource;

import java.io.IOException;
import java.io.InputStream;

public class MultipartFileResource extends InputStreamResource {

    private final String filename;

    private final long size;


    public MultipartFileResource(String filename, long size, InputStream inputStream) {
        super(inputStream);
        this.size = size;
        this.filename = filename;
    }


    @Override

    public String getFilename() {
        return this.filename;
    }


    @Override

    public InputStream getInputStream() throws IOException, IllegalStateException {
        return super.getInputStream(); //To change body of generated methods, choose Tools | Templates.
    }


    @Override

    public long contentLength() throws IOException {
        return size;
    }

}

