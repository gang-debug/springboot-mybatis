package com.example.demo.mapper;


import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import com.example.demo.entity.User;
import java.util.List;


public interface UserMapper {
    @Select("Select id,name,age From user")
    @Results({
            @Result(id = true, property = "id", column = "id", javaType = Integer.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "age", column = "age", javaType = Integer.class),
    })
    List< User > getAllUser();

    @Select("Select id,name,age From user Order by visits_count DESC limit 0,4")
    @Results({
            @Result(id = true, property = "id", column = "id", javaType = Integer.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "age", column = "age", javaType = Integer.class),

    })
    List< User > getFourUser();
}
