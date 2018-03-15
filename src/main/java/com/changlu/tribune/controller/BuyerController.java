package com.changlu.tribune.controller;

import com.changlu.tribune.model.Buyer;
import com.changlu.tribune.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buyer/*")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @PostMapping("/insert")
    public Boolean insert(@RequestBody Buyer buyer){
        try {
            buyerService.insert(buyer);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @PostMapping("/delete")
    public Boolean delete(Long id){
        try {
            buyerService.delete(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @PostMapping("/update")
    public Boolean update(@RequestBody Buyer buyer){
        try {
            buyerService.update(buyer);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @GetMapping("/select")
    public List<Buyer> select(String keyword,@RequestParam(defaultValue = "1")Integer pageNo,@RequestParam(defaultValue = "10")Integer size){
        Integer offset = (pageNo -1) * size;
        return buyerService.select(keyword,offset,size);
    }

    @GetMapping("/getCount")
    public Integer getCount(String keyword){
        return buyerService.getCount(keyword);
    }

    @GetMapping("/getById")
    public Buyer getById(Long id){
        return buyerService.getById(id);
    }

}
