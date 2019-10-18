package cn.qst.sale.service.impl;

import cn.qst.sale.entity.Client;
import cn.qst.sale.dao.ClientMapper;
import cn.qst.sale.service.IClientService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ClientServiceImpl implements IClientService {
    @Resource
    private ClientMapper clientMapper;
    @Override
    public List<Client> listClients(String info) {
        return clientMapper.listClients(info);
    }

    @Override
    public int insertClient(Client client) {
        return clientMapper.insertSelective(client);
    }

    @Override
    public Client getClient(int id) {
        return clientMapper.selectByPrimaryKey(id);
    }

    @Override
    public Client getOneClientBycorrelated(Integer clientId) {
        return clientMapper.getOneClientBycorrelated(clientId);
    }

    @Override
    public int updateClient(Client client) {
        return clientMapper.updateByPrimaryKeySelective(client);
    }
}
