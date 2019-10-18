package cn.qst.sale.dao;

import cn.qst.sale.entity.Client;
import com.sun.prism.shader.DrawCircle_LinearGradient_PAD_AlphaTest_Loader;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientMapper {

    int deleteByPrimaryKey(Integer clientId);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(Integer clientId);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);

    //查询所有的客户
    public List<Client> listClients(@Param("info") String info);

    //和销售表关联查询单条记录
    public Client getOneClientBycorrelated(Integer clientId);
}