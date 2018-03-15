package com.changlu.tribune.mapper;

import com.changlu.tribune.model.Buyer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuyerMapper {

    void insert(@Param("buyer")Buyer buyer);

    void delete(@Param("id")Long id);

    void update(@Param("buyer")Buyer buyer);

    List<Buyer> select(@Param("keyword")String keyword,@Param("offset")Integer offset,@Param("size")Integer size);

    Integer getCount(@Param("keyword")String keyword);

    Buyer getById(@Param("id")Long id);

}
