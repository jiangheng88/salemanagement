package cn.qst.sale.service;

import cn.qst.sale.dao.SellMapper;
import cn.qst.sale.entity.Sell;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2019-10-03
 */
public interface ISellService {
    int deleteByPrimaryKey(Integer sellId);

    int insert(Sell record);

    Sell selectByPrimaryKey(Integer sellId);

    int updateByPrimaryKey(Sell record);
    //查询所有的记录
    List<Sell> listSell(String info);

}
