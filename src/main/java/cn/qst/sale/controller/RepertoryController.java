package cn.qst.sale.controller;


import cn.qst.sale.entity.Repertory;
import cn.qst.sale.service.IRepertoryService;
import cn.qst.sale.service.impl.RepertoryServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
public class RepertoryController {
    @Resource
    private IRepertoryService repertoryService;

    /**
     * 模糊查询
     *
     * @param repertoryInfo
     * @return
     */
    @RequestMapping(value = "/listQueryRepertory", method = RequestMethod.POST)
    public List<Repertory> listQueryRepertory(String repertoryInfo) {
        List<Repertory> repertories = repertoryService.listQueryRepertory(repertoryInfo);
        System.out.println(repertories);
        return repertories;
    }

    /**
     * 查询所用的信息
     *
     * @return
     */
    @RequestMapping("/listRepertory")
    public List<Repertory> listRepertory(Model model) {
        List<Repertory> repertorys = repertoryService.listRepertories();
        model.addAttribute("repertorys", repertorys);
        return repertorys;
    }

    /**
     * 修改
     *
     * @param repertory
     * @return
     */
    @RequestMapping("/updateRepertory")
    public int updateRepertory(Repertory repertory) {
        return repertoryService.updateRepertory(repertory);
    }

    /**
     * 逻辑删除
     *
     * @param repertory
     * @return
     */
    @RequestMapping("/deleteByLogic")
    public int deleteLogic(Repertory repertory) {
        return repertoryService.deleteByLogic(repertory);
    }

    /**
     * 添加的方法
     * @param repertory
     * @return
     */
    @RequestMapping("/insertRepertory")
    public int insertRepertory(Repertory repertory) {
        return repertoryService.insertSupplier(repertory);
    }
}
