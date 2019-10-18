package cn.qst.sale.service;

import cn.qst.sale.entity.Repertory;
import cn.qst.sale.entity.Supplier;

import java.util.List;


public interface IRepertoryService {
    /*关联的模糊查询*/
    public List<Repertory> listQueryRepertory(String repertoryInfo);
    /*查询有的信息*/
    public List<Repertory> listRepertories();
    /*修改的方法*/
    public int updateRepertory(Repertory repertory);

    /*逻辑删除*/
    int deleteByLogic(Repertory repertory);

    /*添加*/
    int insertSupplier(Repertory repertory);
}
