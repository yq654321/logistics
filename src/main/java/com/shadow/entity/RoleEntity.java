package com.shadow.entity;
//角色表
public class RoleEntity {
    private int role_id;//角色ID
    private int parerole_id;//  父级角色ID
    private String rolename;//    角色名称
    private String createtime;// 创建时间
    private String description;//    角色描述

    public RoleEntity() {
    }

    public RoleEntity(int role_id, int parerole_id, String rolename, String createtime, String description) {
        this.role_id = role_id;
        this.parerole_id = parerole_id;
        this.rolename = rolename;
        this.createtime = createtime;
        this.description = description;
    }

    @Override
    public String toString() {
        return "role{" +
                "role_id=" + role_id +
                ", parerole_id=" + parerole_id +
                ", rolename='" + rolename + '\'' +
                ", createtime='" + createtime + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getParerole_id() {
        return parerole_id;
    }

    public void setParerole_id(int parerole_id) {
        this.parerole_id = parerole_id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}