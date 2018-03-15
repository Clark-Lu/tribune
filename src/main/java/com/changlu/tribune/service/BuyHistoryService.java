package com.changlu.tribune.service;

import com.changlu.tribune.mapper.BuyHistoryMapper;
import com.changlu.tribune.model.BuyHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyHistoryService {

    @Autowired
    private BuyHistoryMapper buyHistoryMapper;

    public void insert(BuyHistory buyHistory){
        buyHistoryMapper.insert(buyHistory);
    }

    public void delete(Long id){
        buyHistoryMapper.delete(id);
    }

    public List<BuyHistory> select(Long buyerId){
        return buyHistoryMapper.select(buyerId);
    }
}
