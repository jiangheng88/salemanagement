package cn.qst.sale.dao;

import cn.qst.sale.entity.Commodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityMapper {

    int deleteByPrimaryKey(Integer comId);


    int insert(Commodity record);


    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer comId);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);


    /*模糊查询*/
    public List<Commodity> listCommodityInfo(Commodity commodity);

    /*逻辑删除*/
    public int deleteLogicById(@Param("comId") Integer id);

}