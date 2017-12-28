package com.shadow.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControler {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("Config_datadict")
    public String Config_datadict(){
        return "Config_datadict";
    }

}
