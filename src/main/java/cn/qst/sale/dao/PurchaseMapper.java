package cn.qst.sale.dao;

import cn.qst.sale.entity.Purchase;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseMapper {

    int deleteByPrimaryKey(Integer purId);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    Purchase selectByPrimaryKey(Integer purId);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);

    //模糊查询所有的信息
    List<Purchase> listPurchaseQuery(@Param("info") String info);
}