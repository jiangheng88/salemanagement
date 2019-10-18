package cn.qst.sale.controller;


import cn.qst.sale.entity.Purchase;
import cn.qst.sale.service.IPurchaseService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class PurchaseController {
    @Resource
    private IPurchaseService purchaseService;

    //查询所有的记录
    @RequestMapping("/listPurchases")
    public List<Purchase> listPurchase(String info) {
        return purchaseService.listPurchaseQuery(info);
    }

    //添加
    @RequestMapping("/insertPurchase")
    public int insertPurchase(Purchase purchase) {
        return purchaseService.insert(purchase);
    }

    //修改
    @RequestMapping("/updatePurchase")
    public int updatePurchase(Purchase purchase) {
        return purchaseService.updateByPrimaryKey(purchase);
    }

    //删除的方法
@RequestMapping("/deletepurchase")
    public int deletePurchase(int purId){
        return purchaseService.deleteByPrimaryKey(purId);
    }
}

