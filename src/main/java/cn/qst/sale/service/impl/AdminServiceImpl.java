package cn.qst.sale.service.impl;

import cn.qst.sale.entity.Admin;
import cn.qst.sale.dao.AdminMapper;
import cn.qst.sale.service.IAdminService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class AdminServiceImpl implements IAdminService {
    @Resource
    private AdminMapper adminMapper;
    @Override
    public Admin dologin(Admin admin) {
        return adminMapper.dologin(admin);
    }

    @Override
    public int doRegister(Admin admin) {
        return adminMapper.insertSelective(admin);
    }

    @Override
    public List<Admin> listAdmins() {
        return adminMapper.listAdmin();
    }
}
