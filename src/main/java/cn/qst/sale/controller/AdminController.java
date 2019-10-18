package cn.qst.sale.controller;


import cn.qst.sale.entity.Admin;
import cn.qst.sale.service.IAdminService;
import cn.qst.sale.service.impl.AdminServiceImpl;
import cn.qst.sale.utils.MyUtils;
import org.springframework.cglib.reflect.MethodDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2019-10-03
 */
@Controller
public class AdminController {
    @Resource
    private IAdminService adminService;
    @RequestMapping(value = "/dologin")
    public String dologin(Admin admin,Model model){
         Admin admin1 = adminService.dologin(admin);
        System.out.println(admin1);
        if(admin1!=null){
        model.addAttribute("admin",admin1);
            return "main";
        }else{
            return "index";
        }
    }

    /*注册*/
    @RequestMapping(value = "/doregister", method= RequestMethod.POST)
    public String doRegister(Admin admin,@RequestParam("file_adminImg") MultipartFile multipartFile){
        MyUtils.uploadSingleFile(multipartFile, admin, "uploadfiles/adminimgfiles/", "adminImg");
        System.out.println("图片的路径是："+admin.getAdminImg());
        int count = adminService.doRegister(admin);
        if(count>0){
            return "index";
        }else{
            return "register";
        }

    }
    @RequestMapping("getAdmin")
    public Admin getAdmin(Admin admin){
        return null;
    }


    //获得所有的用户
    @RequestMapping("/listAdmin")
    @ResponseBody
    public List<Admin> ListAdmin(){
        return adminService.listAdmins();
    }
}

