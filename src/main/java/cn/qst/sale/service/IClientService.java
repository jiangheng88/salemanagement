package cn.qst.sale.service;

import cn.qst.sale.entity.Client;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2019-10-03
 */
public interface IClientService {
    //查询所有的客户
    public List<Client> listClients(String info);
    //添加
    public int insertClient(Client client);
    //获取单个的信息
    public Client getClient(int id);
    //修改
    public int updateClient(Client client);

    //和销售表关联查询单条记录
    public Client getOneClientBycorrelated(Integer clientId);
}
