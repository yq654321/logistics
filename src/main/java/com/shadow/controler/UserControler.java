package com.shadow.controler;

import com.alibaba.fastjson.JSON;
import com.shadow.dao.UserDao;
import com.shadow.entity.Config_menuEntity;
import com.shadow.entity.UserEntity;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;
import java.sql.SQLException;
import java.util.List;

@Controller
public class UserControler {
    @Resource
    UserDao userDao;


    //登录
    @RequestMapping("/login")
    public String login(UserEntity userEntity, HttpServletRequest request, HttpSession session) throws SQLException {

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userEntity.getUname(), userEntity.getPassword());
        // System.out.println(token+"n    kjjjj");
        // System.out.println(userEntity.getUname() + "__" + userEntity.getPassword());
        try {
            subject.login(token);//会跳到我们自定义的realm中
            //    System.out.println(token.getUsername()+"token.uname");
            userEntity = userDao.getByUsername(token.getUsername());
            session.setAttribute("user_id", userEntity.getUser_id());
//            request.getSession().setAttribute("userEntity", userEntity);
//            request.getSession().setAttribute("user_id", userEntity.getUser_id());
            //   System.out.println(userEntity.getUser_id()+"1232dloginuid");
            return "main";
        } catch (Exception e) {
//            e.printStackTrace();
//            request.getSession().setAttribute("userEntity", userEntity);
//            request.setAttribute("error", "用户名或密码错误！");
            return "123";
        }

    }


    //查询菜单

    @RequestMapping("getconfig")
    public void getconfig(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer uid = (Integer) request.getSession().getAttribute("user_id");

        //  System.out.println(uid+"    :ghjkjuytrtuid");
        //  request.getSession();
        //   HttpSession session = request.getSession();
        //  Integer uid = (Integer) session.getAttribute("userEntity.user_id");

        if (uid != null) {
            // System.out.println(uid);
            // System.out.println("????????????");
            List<Config_menuEntity> list = userDao.getconfig(uid);
            // System.out.println(list+"    :12345list");
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
            response.getWriter().write(JSON.toJSONString(list));
        } else {
            System.out.println("-----------------------");

            response.getWriter().write("{\"success\":\"success\"}");
        }


    }


}
