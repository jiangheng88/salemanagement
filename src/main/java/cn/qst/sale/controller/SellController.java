package cn.qst.sale.controller;


import cn.qst.sale.entity.Sell;
import cn.qst.sale.service.ISellService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
public class SellController {
    @Resource
    private ISellService sellService;
    //查询所有的记录
    @RequestMapping("/listQuerySells")
    public List<Sell> listSells(String info){
        return sellService.listSell(info);
    }

    @RequestMapping("/insertSell")
    public int insertSell(Sell sell){
        return sellService.insert(sell);
    }
}

