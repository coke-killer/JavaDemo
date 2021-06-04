package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/6/4 13:44
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id =#{id}")
    User getInformation(@Param("id") int i);
}
