package com.shadow.dao;


import com.shadow.entity.Config_menuEntity;
import com.shadow.entity.UserEntity;

import java.util.List;
import java.util.Set;

//用户dao
public interface UserDao {
    //根据名字查询用户
    public UserEntity getByUsername(String uname);
//
//用户表与角色表联表查中间表
    public Set<String> getRole(String uname);
//用户表与权限表联表查中间表
    public Set<String> getAuthorization(String uname);

//根据用户ID多表查询菜单
public List<Config_menuEntity> getconfig(int user_id);



//    //查询所有
//    public List<UserEntity> selectall();
//    //修改
//    public   void  updateuser (UserEntity studentEntity);
//    //增加
//    public   void   adduser (UserEntity studentEntity);
//    //删除
//    public   void   deluser (int user_id);


}
