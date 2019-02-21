package com.example.demo.dao;

import com.example.demo.model.TtaiUser;
import org.springframework.stereotype.Repository;

@Repository
public interface TtaiUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TtaiUser record);

    int insertSelective(TtaiUser record);

    TtaiUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TtaiUser record);

    int updateByPrimaryKey(TtaiUser record);
}