package cn.qst.sale.dao;

import cn.qst.sale.entity.Supplier;

import java.util.List;

public interface SupplierMapper {

    int deleteByPrimaryKey(Integer supId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer supId);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);

    /*查询所有的记录*/
    public List<Supplier> listSupplier();

    /*逻辑删除*/
    public int deleteByLogic(Supplier supplier);
}