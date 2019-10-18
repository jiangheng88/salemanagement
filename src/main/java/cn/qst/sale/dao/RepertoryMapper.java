package cn.qst.sale.dao;

import cn.qst.sale.entity.Repertory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepertoryMapper {

    int deleteByPrimaryKey(Integer repId);


    int insert(Repertory record);

    int insertSelective(Repertory record);

    Repertory selectByPrimaryKey(Integer repId);

    int updateByPrimaryKeySelective(Repertory record);

    int updateByPrimaryKey(Repertory record);

    /*关联的模糊查询*/
    public List<Repertory> listQueryRepertory(@Param("repertoryInfo") String repertoryInfo);

    /*查询有的信息*/
    public List<Repertory> listRepertories();

    /*逻辑删除*/
    int deleteByLogic(Repertory repertory);
}