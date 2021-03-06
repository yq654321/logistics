package com.shadow.controler;

import com.alibaba.fastjson.JSON;
import com.shadow.dao.AuthorDao;
import com.shadow.entity.AuthorizationEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class AuthorControler {

    @Resource
    AuthorDao authorDao;

    //查询所有
    @ResponseBody
    @RequestMapping("dd")
    public List<AuthorizationEntity> selectall(HttpServletResponse response) {
        List<AuthorizationEntity> list =authorDao.selectall();
        return list;
    }

}
