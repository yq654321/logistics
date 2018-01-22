package com.shadow.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControler {

    @RequestMapping("index")
    public String index(){
        return "index";
    }


//单据管理
    @RequestMapping("billhandout")
    public  String billhandout(){


       return "billhandout";
    }
//权限管理
    @RequestMapping("authorization")
    public  String   authorization(){


        return "authorization";
    }
    //数据字典
    @RequestMapping("Config_datadict")
    public String Config_datadict(){
        return "Config_datadict";
    }


//用户管理
    @RequestMapping("User")
    public String User(){
        return "User";
    }

    //角色管理
    @RequestMapping("role")
    public String role(){
        return "role";
    }

    //菜单管理
    @RequestMapping("configmenu")
    public String configmenu(){
        return "configmenu";
    }
}
