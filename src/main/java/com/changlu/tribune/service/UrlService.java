package com.changlu.tribune.service;

import com.changlu.tribune.mapper.UrlMapper;
import com.changlu.tribune.model.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlService {

    @Autowired
    private UrlMapper urlMapper;

    public List<Url> getPage(String keyword, Integer offset, Integer size){
        return urlMapper.getPage(keyword, offset, size);
    }
}
