package com.changlu.tribune.mapper;

import com.changlu.tribune.model.BuyHistory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuyHistoryMapper {

    void insert(@Param("buyHistory")BuyHistory buyHistory);

    void delete(@Param("id")Long id);

    void update(@Param("buyHistory")BuyHistory buyHistory);

    List<BuyHistory> select(@Param("buyerId")Long buyerId);

}
