package cn.qst.sale.service;

import cn.qst.sale.entity.Purchase;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IPurchaseService {


    int deleteByPrimaryKey(Integer purId);

    int insert(Purchase record);

    Purchase selectByPrimaryKey(Integer purId);

    int updateByPrimaryKey(Purchase record);

    //模糊查询所有的信息
    List<Purchase> listPurchaseQuery( String info);
}
