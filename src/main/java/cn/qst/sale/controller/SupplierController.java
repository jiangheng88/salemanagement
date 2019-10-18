package cn.qst.sale.controller;


import cn.qst.sale.entity.Supplier;
import cn.qst.sale.service.ISupplierService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SupplierController {
    @Resource
    private ISupplierService supplierService;

    @RequestMapping("/listSupplier")
    public List<Supplier> listSupplier() {
        System.out.println(supplierService.listSupplier());
        return supplierService.listSupplier();
    }

    /**
     * 修改
     * @param supplier
     * @return
     */
    @RequestMapping("/updateSupplier")
    public int updateSupplier(Supplier supplier) {
        return supplierService.updateSupplier(supplier);
    }
@RequestMapping("/deleteByLogicSupplier")
     public  int deleteByLogic(Supplier supplier){
        return supplierService.deleteByLogic(supplier);
     }

    /**
     * 添加
     * @param supplier
     * @return
     */
@RequestMapping("/insertSupplier")
    public int insertSupplier(Supplier supplier){
        return supplierService.insertSupplier(supplier);
    }
}

