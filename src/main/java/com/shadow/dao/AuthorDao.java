package com.shadow.dao;

import com.shadow.entity.AuthorizationEntity;

import java.util.List;

public interface AuthorDao {
    //查询所有
    public List<AuthorizationEntity> selectall();
}
