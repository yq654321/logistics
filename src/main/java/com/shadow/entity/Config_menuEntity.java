package com.shadow.entity;
//菜单表
public class Config_menuEntity {
    private int config_menu_id;//菜单ID
    private int configson_id;//子菜单ID
    private String config_menu_name;//菜单名
    private String config_menu_page;//菜单URL
    private String show;//展示与否
    private String config_munu_cid;//展示位置
    private String config_data;//创建时间
    private int staff_id;//创建人员

    public Config_menuEntity() {
    }

    public Config_menuEntity(int config_menu_id, int configson_id, String config_menu_name, String config_menu_page, String show, String config_munu_cid, String config_data, int staff_id) {
        this.config_menu_id = config_menu_id;
        this.configson_id = configson_id;
        this.config_menu_name = config_menu_name;
        this.config_menu_page = config_menu_page;
        this.show = show;
        this.config_munu_cid = config_munu_cid;
        this.config_data = config_data;
        this.staff_id = staff_id;
    }

    @Override
    public String toString() {
        return "Config_menuEntity{" +
                "config_menu_id=" + config_menu_id +
                ", configson_id=" + configson_id +
                ", config_menu_name='" + config_menu_name + '\'' +
                ", config_menu_page='" + config_menu_page + '\'' +
                ", show='" + show + '\'' +
                ", config_munu_cid='" + config_munu_cid + '\'' +
                ", config_data='" + config_data + '\'' +
                ", staff_id=" + staff_id +
                '}';
    }

    public int getConfig_menu_id() {
        return config_menu_id;
    }

    public void setConfig_menu_id(int config_menu_id) {
        this.config_menu_id = config_menu_id;
    }

    public int getConfigson_id() {
        return configson_id;
    }

    public void setConfigson_id(int configson_id) {
        this.configson_id = configson_id;
    }

    public String getConfig_menu_name() {
        return config_menu_name;
    }

    public void setConfig_menu_name(String config_menu_name) {
        this.config_menu_name = config_menu_name;
    }

    public String getConfig_menu_page() {
        return config_menu_page;
    }

    public void setConfig_menu_page(String config_menu_page) {
        this.config_menu_page = config_menu_page;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getConfig_munu_cid() {
        return config_munu_cid;
    }

    public void setConfig_munu_cid(String config_munu_cid) {
        this.config_munu_cid = config_munu_cid;
    }

    public String getConfig_data() {
        return config_data;
    }

    public void setConfig_data(String config_data) {
        this.config_data = config_data;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }
}