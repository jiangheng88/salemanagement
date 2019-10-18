package cn.qst.sale.service.impl;

import cn.qst.sale.entity.Sell;
import cn.qst.sale.dao.SellMapper;
import cn.qst.sale.service.ISellService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SellServiceImpl implements ISellService {
    @Resource
    private SellMapper sellMapper;

    @Override
    public int deleteByPrimaryKey(Integer sellId) {
        return sellMapper.deleteByPrimaryKey(sellId);
    }

    @Override
    public int insert(Sell record) {
        return sellMapper.insertSelective(record);
    }

    @Override
    public Sell selectByPrimaryKey(Integer sellId) {
        return sellMapper.selectByPrimaryKey(sellId);
    }

    @Override
    public int updateByPrimaryKey(Sell record) {
        return sellMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Sell> listSell(String info) {
        return sellMapper.listSell(info);
    }
}
