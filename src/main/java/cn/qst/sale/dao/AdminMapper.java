package cn.qst.sale.dao;

import cn.qst.sale.entity.Admin;

import java.util.List;

public interface AdminMapper {

    int deleteByPrimaryKey(Integer adminId);
    int insert(Admin record);
    int insertSelective(Admin record);
    Admin selectByPrimaryKey(Integer adminId);
    int updateByPrimaryKeySelective(Admin record);
    int updateByPrimaryKey(Admin record);
    /*登录*/
    public Admin dologin(Admin admin);
    /*注册*/
    public int doRegister(Admin admin);
    //查找所有的信息
    List<Admin> listAdmin();
}