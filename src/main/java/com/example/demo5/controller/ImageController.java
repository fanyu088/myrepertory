package com.example.demo5.controller;

import com.example.demo5.domain.Image;
import com.example.demo5.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class ImageController {


    @Autowired
    private ImageService imageService;

    @Value("${prefixPath}")
    private String prefixPath;

    @RequestMapping("test")
    public String uploadImage(MultipartFile file) throws IOException {

        String url = prefixPath;

        String name = file.getOriginalFilename();

        File file1 = new File(url, name);

        System.out.println(file.getOriginalFilename());
        System.out.println(file.getName());
        System.out.println(file.isEmpty());
        System.out.println(file.getBytes());
        System.out.println(file.getContentType());
        System.out.println(file.getSize());

        file.transferTo(file1);


        imageService.uploadImage();



        return "success";
    }


    @RequestMapping("findImage")
    public String findImage(MultipartFile file) {

//        String originalFilename = file.getOriginalFilename();

        List<Image> image = imageService.findImage();

        return "success";

    }

}
