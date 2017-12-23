package com.shadow.controler;

import com.shadow.dao.Bill_HandoutDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Bill_HandoutControler {

    @Resource
    Bill_HandoutDao billhandoutDao;

    @RequestMapping("query")
    public String selectAll(HttpServletResponse response){
        System.out.println("ddddd");
        return "bill_handout";
    }
}
