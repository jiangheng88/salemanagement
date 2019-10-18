package cn.qst.sale.service;

import cn.qst.sale.entity.Supplier;

import java.util.List;

public interface ISupplierService {
    /*查询所有的记录*/
    public List<Supplier> listSupplier();
    /*修改*/
    public int updateSupplier(Supplier supplier);
    /*逻辑删除*/
    public int deleteByLogic(Supplier supplier);

    /*添加的方法*/

    public int insertSupplier(Supplier supplier);
}
