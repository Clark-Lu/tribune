package com.changlu.tribune.controller;

import com.changlu.tribune.model.BuyHistory;
import com.changlu.tribune.service.BuyHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buyHistory/*")
public class BuyHistoryController {

    @Autowired
    private BuyHistoryService buyHistoryService;

    @PostMapping("/insert")
    public Boolean insert(@RequestBody BuyHistory buyHistory){
        try {
            buyHistoryService.insert(buyHistory);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @PostMapping("/delete")
    public Boolean delete(Long id){
        try {
            buyHistoryService.delete(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @GetMapping("/select")
    public List<BuyHistory> select(Long buyerId){
        return buyHistoryService.select(buyerId);
    }

}
