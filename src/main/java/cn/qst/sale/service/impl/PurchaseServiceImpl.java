package cn.qst.sale.service.impl;

import cn.qst.sale.entity.Purchase;
import cn.qst.sale.dao.PurchaseMapper;
import cn.qst.sale.service.IPurchaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class PurchaseServiceImpl implements IPurchaseService {
    @Resource
    private PurchaseMapper purchaseMapper;

    @Override
    public int deleteByPrimaryKey(Integer purId) {
        return purchaseMapper.deleteByPrimaryKey(purId);
    }

    @Override
    public int insert(Purchase record) {
        return purchaseMapper.insertSelective(record);
    }

    @Override
    public List<Purchase> listPurchaseQuery(String info) {
        return purchaseMapper.listPurchaseQuery(info);
    }

    @Override
    public Purchase selectByPrimaryKey(Integer purId) {
        return purchaseMapper.selectByPrimaryKey(purId);
    }

    @Override
    public int updateByPrimaryKey(Purchase record) {
        return purchaseMapper.updateByPrimaryKeySelective(record);
    }
}
