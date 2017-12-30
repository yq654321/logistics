package com.shadow.controler;

import com.shadow.dao.Config_datadictDao;
import com.shadow.entity.Config_datadictEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


//(数据字典)
@Controller
public class Config_datadictControler {

    @Resource
    Config_datadictDao config_datadictDao;

    //数据字典(查询)
    @ResponseBody
    @RequestMapping("Config_datadict_query4List")
    public List<Config_datadictEntity> query4List(int config_id){
        List<Config_datadictEntity> list = config_datadictDao.config_datadictAll(config_id);
        return list;
    }



}
