package cn.qst.sale.service.impl;

import cn.qst.sale.entity.Repertory;
import cn.qst.sale.dao.RepertoryMapper;
import cn.qst.sale.entity.Supplier;
import cn.qst.sale.service.IRepertoryService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-10-03
 */
@Service
public class RepertoryServiceImpl implements IRepertoryService {
    @Resource
    private RepertoryMapper repertoryMapper;
    /*关联的模糊查询*/
    @Override
    public List<Repertory> listQueryRepertory(String repertoryInfo) {
        return repertoryMapper.listQueryRepertory(repertoryInfo);
    }

    @Override
    public List<Repertory> listRepertories() {
        return repertoryMapper.listRepertories();

    }

    @Override
    public int updateRepertory(Repertory repertory) {
        return repertoryMapper.updateByPrimaryKeySelective(repertory);
    }

    @Override
    public int deleteByLogic(Repertory repertory) {
        return repertoryMapper.deleteByLogic(repertory);
    }

    @Override
    public int insertSupplier(Repertory repertory) {
        return repertoryMapper.insertSelective(repertory);
    }


}
