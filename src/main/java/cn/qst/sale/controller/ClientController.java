package cn.qst.sale.controller;


import cn.qst.sale.entity.Client;
import cn.qst.sale.service.IClientService;
import cn.qst.sale.utils.MyUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.Cleaner;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2019-10-03
 */
@RestController
public class ClientController {
    @Resource
    private IClientService clientService;

    @RequestMapping("/listClients")
    public List<Client> listClients(String info) {
        return clientService.listClients(info);
    }

    /**
     * 添加，包含文件上传
     * @param client
     * @param multipartFile
     * @return
     */
    @RequestMapping(value = "/insertClient",method = RequestMethod.POST)
    public int insertClient(Client client, @RequestParam("file_clientImg") MultipartFile multipartFile) {
        MyUtils.uploadSingleFile(multipartFile, client, "uploadfiles/clientimgfiles/", "clientImg");
        System.out.println("图片的路径是：" + client.getClientImg());
        int count = clientService.insertClient(client);
        return count;
    }

    @RequestMapping("/getClient")
    public Client getClient(Integer clientId){
        Client client = clientService.getOneClientBycorrelated(clientId);
        return client;
    }
    @RequestMapping("/updateClient")
    public int updateClient(Client client){
        return clientService.updateClient(client);
    }
}

