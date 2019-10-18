package cn.qst.sale.service;

import cn.qst.sale.entity.Commodity;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2019-10-03
 */
public interface ICommodityService {
    /*模糊查询*/
    public List<Commodity> listCommodityInfo(Commodity commodity);

    /*根据修改用户的信息*/

    public int updateById(Commodity commodity);
    /*逻辑删除*/
    public int deleteLogicById(Integer id);

    /*添加*/
    public int insertComodity(Commodity commodity);
}
