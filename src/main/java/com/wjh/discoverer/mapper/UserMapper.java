package com.wjh.discoverer.mapper;

import com.wjh.discoverer.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 一直很低调(1223271200@qq.com) on 2017/11/21
 * @since 1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    User findByName(@Param("name") String name);

    @Results({
            @Result(property = "name", column = "name")
    })
    List<User> findAllByName();
}
