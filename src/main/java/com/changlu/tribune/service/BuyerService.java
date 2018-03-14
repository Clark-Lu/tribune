package com.changlu.tribune.service;

import com.changlu.tribune.mapper.BuyerMapper;
import com.changlu.tribune.model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {

    @Autowired
    private BuyerMapper buyerMapper;

    public void insert(Buyer buyer){
        buyerMapper.insert(buyer);
    }

    public void delete(Long id){
        buyerMapper.delete(id);
    }

    public void update(Buyer buyer){
        buyerMapper.update(buyer);
    }

    public List<Buyer> select(String keyword,Integer offset,Integer size){
        return buyerMapper.select(keyword,offset,size);
    }

    public Integer getCount(String keyword){
        return buyerMapper.getCount(keyword);
    }
}
