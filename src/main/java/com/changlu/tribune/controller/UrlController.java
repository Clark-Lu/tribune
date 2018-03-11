package com.changlu.tribune.controller;

import com.changlu.tribune.model.Url;
import com.changlu.tribune.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/url/*")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @RequestMapping(value = "/getCount",method = RequestMethod.GET)
    public Integer getCount(String keyword){
        return urlService.count(keyword);
    }

    @RequestMapping(value = "/getPage",method = RequestMethod.GET)
    public List<Url> getPage(@RequestParam(value = "keyword",required = false) String keyword, @RequestParam(defaultValue = "1") Integer pageNo,@RequestParam(defaultValue = "10") Integer size){
        Integer offset = (pageNo - 1)* size;
        return urlService.getPage(keyword,offset,size);
    }

    @PostMapping(value = "/insert")
    public Boolean insert(Url url){
        try {
            urlService.insert(url);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
