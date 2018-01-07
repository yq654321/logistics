package com.shadow.dao;

import com.shadow.entity.Config_datadictEntity;

import java.util.List;

//(数据字典)
public interface Config_datadictDao {
    //数据字典(查询)
    public List<Config_datadictEntity> config_datadictAll(int config_id);


}
