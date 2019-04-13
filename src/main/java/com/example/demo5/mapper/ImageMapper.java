package com.example.demo5.mapper;


import com.example.demo5.domain.Image;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageMapper {

    @Select("select * from image_manager")
    List<Image> findImage();


}
