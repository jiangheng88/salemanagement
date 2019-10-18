package cn.qst.sale.controller;

import cn.qst.sale.service.impl.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @author jiangheng
 * @date 2019/10/13 12:40
 * @description   发送邮件的控制层
 */
@Controller
public class MailController {
    private static final String SUCC_MAIL = "邮件发送成功！";
    private static final String FAIL_MAIL = "邮件发送失败！";

    // 图片路径
    private static final String IMG_PATH = "C:/Users/zjj/Desktop/github/materials/blog/img/WC-GZH.jpg";
    // 发送对象
    private static final String MAIL_TO = "folgerjun@gmail.com";

    @Autowired
    private MailServiceImpl mailService;
    @Autowired
    private TemplateEngine templateEngine;

    @RequestMapping("/htmlEmail")
    public String htmlEmail(String address,String theme,String context){
        try {
            mailService.sendHtmlMail(address,theme, context);
        }catch (Exception ex){
            ex.printStackTrace();
            return FAIL_MAIL;
        }
        return "mail/mail_compose";
    }

    @RequestMapping("/htmlEmailClient")
    public String htmlEmailClient(String address,String theme,String context){
        try {
            mailService.sendHtmlMail(address,theme, context);
        }catch (Exception ex){
            ex.printStackTrace();
            return FAIL_MAIL;
        }
        return "clients";
    }

}
