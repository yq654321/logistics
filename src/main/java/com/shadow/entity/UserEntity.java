package com.shadow.entity;

//用户表
public class UserEntity {
    private int user_id;//用户ID
    private String uname;//  登录账号
    private String password;//  密码
    private String createtime;//   创建时间

    public UserEntity() {
    }

    public UserEntity(int user_id, String uname, String password, String createtime) {
        this.user_id = user_id;
        this.uname = uname;
        this.password = password;
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "user{" +
                "user_id=" + user_id +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}