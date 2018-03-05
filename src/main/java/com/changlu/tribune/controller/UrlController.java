package com.changlu.tribune.controller;

import com.changlu.tribune.model.Url;
import com.changlu.tribune.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/url/*")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @RequestMapping(value = "/getPage",method = RequestMethod.GET)
    public List<Url> getPage(@RequestParam(value = "keyword",required = false) String keyword, @RequestParam(defaultValue = "1") Integer pageNo,@RequestParam(defaultValue = "10") Integer size){
        Integer offset = (pageNo - 1)* size;
        return urlService.getPage(keyword,offset,size);
    }
}