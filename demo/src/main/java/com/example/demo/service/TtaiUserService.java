package com.example.demo.service;


import com.example.demo.model.TtaiUser;

public interface TtaiUserService {
    int deleteByPrimaryKey(Long id);

    int insert(TtaiUser record);

    int insertSelective(TtaiUser record);

    TtaiUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TtaiUser record);

    int updateByPrimaryKey(TtaiUser record);
}
