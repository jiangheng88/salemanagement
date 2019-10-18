package cn.qst.sale.service.impl;

import cn.qst.sale.entity.Supplier;
import cn.qst.sale.dao.SupplierMapper;
import cn.qst.sale.service.ISupplierService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SupplierServiceImpl  implements ISupplierService {
    @Resource
    private SupplierMapper supplierMapper;
    @Override
    public List<Supplier> listSupplier() {
        return supplierMapper.listSupplier();
    }

    @Override
    public int insertSupplier(Supplier supplier) {
        return supplierMapper.insertSelective(supplier);
    }

    @Override
    public int deleteByLogic(Supplier supplier) {
        return supplierMapper.deleteByLogic(supplier);
    }

    @Override
    public int updateSupplier(Supplier supplier) {
        return supplierMapper.updateByPrimaryKeySelective(supplier);
    }
}
