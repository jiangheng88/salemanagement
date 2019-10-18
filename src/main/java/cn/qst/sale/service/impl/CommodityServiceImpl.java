package cn.qst.sale.service.impl;

import cn.qst.sale.entity.Commodity;
import cn.qst.sale.dao.CommodityMapper;
import cn.qst.sale.service.ICommodityService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-10-03
 */
@Service
public class CommodityServiceImpl implements ICommodityService {
    @Resource
    private CommodityMapper commodityMapper;

    @Override
    public List<Commodity> listCommodityInfo(Commodity commodity) {
        return commodityMapper.listCommodityInfo(commodity);
    }

    @Override
    public int updateById(Commodity commodity) {
        return commodityMapper.updateByPrimaryKeySelective(commodity);
    }

    @Override
    public int deleteLogicById(Integer id) {
        return commodityMapper.deleteLogicById(id);
    }

    @Override
    public int insertComodity(Commodity commodity) {
        return commodityMapper.insertSelective(commodity);
    }


}
