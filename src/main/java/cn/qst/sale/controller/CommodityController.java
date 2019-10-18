package cn.qst.sale.controller;

import cn.qst.sale.entity.Commodity;
import cn.qst.sale.service.ICommodityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
@RestController
public class CommodityController {
    @Resource
    private ICommodityService commodityService;
    /*迷糊查询*/

    @RequestMapping(value = "/listCommodityInfoQuery", method = RequestMethod.POST)
    public List<Commodity> listCommodityInfo(Commodity commodity) {
        List<Commodity> commodities = commodityService.listCommodityInfo(commodity);
        System.out.println(commodities);
        return commodities;
    }

    /*根据id修改*/
    @RequestMapping(value = "/updatebyid", method = RequestMethod.POST)
    public int updateById(Commodity commodity) {
        return commodityService.updateById(commodity);
    }

    /*逻辑删除，通过id*/

    @RequestMapping("/deleteLogic")
    public int deleteLogic(Integer comId) {
        int count = commodityService.deleteLogicById(comId);
        return count;
    }

    /*添加*/
    @RequestMapping("/insertCommodity")
    public int insertCommodity(Commodity commodity) {
        return commodityService.insertComodity(commodity);
    }
}

