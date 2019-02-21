package com.example.demo.serviceimp;

import com.example.demo.dao.TtaiUserMapper;
import com.example.demo.model.TtaiUser;
import com.example.demo.service.TtaiUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: JingXi
 * Date:2019/2/21
 * Description:
 */
@Service("TtaiUserService")
public class TtaiUserServiceImp implements TtaiUserService {
    @Resource
    private TtaiUserMapper mapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TtaiUser record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TtaiUser record) {
        return mapper.insertSelective(record);
    }

    @Override
    public TtaiUser selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TtaiUser record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TtaiUser record) {
        return mapper.updateByPrimaryKey(record);
    }
}
