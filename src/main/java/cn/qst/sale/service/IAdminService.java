package cn.qst.sale.service;

import cn.qst.sale.entity.Admin;
import cn.qst.sale.entity.Commodity;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2019-10-03
 */
public interface IAdminService {
    /*登录*/
    public Admin dologin(Admin admin);
    /*注册*/
    public int doRegister(Admin admin);

    List<Admin> listAdmins();
}
