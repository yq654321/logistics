package com.shadow.dao;

import com.shadow.entity.Bill_HandoutEntity;

import java.util.List;

public interface Bill_HandoutDao {
    //查询所有
    public List<Bill_HandoutEntity> selectAll();
}
