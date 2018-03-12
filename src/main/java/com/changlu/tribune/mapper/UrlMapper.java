package com.changlu.tribune.mapper;

import com.changlu.tribune.model.Url;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlMapper {

    Integer count(@Param("keyword")String keyword);

    List<Url> getPage(@Param("keyword") String keyword, @Param("offset") Integer offset, @Param("size") Integer size);

    void insert(@Param("url")Url url);

    void delete(@Param("id")Long id);

}
