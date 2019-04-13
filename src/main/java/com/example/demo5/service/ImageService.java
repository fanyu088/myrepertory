package com.example.demo5.service;

import com.example.demo5.domain.Image;
import com.example.demo5.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    @Autowired
    private ImageMapper imageMapper;


    public List<Image> findImage() {

        return imageMapper.findImage();
    }

    public void uploadImage() {
    }
}