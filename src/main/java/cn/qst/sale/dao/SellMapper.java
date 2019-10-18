package cn.qst.sale.dao;

import cn.qst.sale.entity.Sell;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellMapper {

    int deleteByPrimaryKey(Integer sellId);

    int insert(Sell record);

    int insertSelective(Sell record);

    Sell selectByPrimaryKey(Integer sellId);

    int updateByPrimaryKeySelective(Sell record);

    int updateByPrimaryKey(Sell record);

    //模糊查询所有的记录
    List<Sell> listSell(@Param("info") String info);
}