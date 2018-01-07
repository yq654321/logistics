package com.shadow.entity;

//数据字典
public class Config_datadictEntity {
    private int config_datadict_id; //数据字典id
    private int config_id;  //数据键id
    private String config_name; //数据值
    private String describe;    //描述
    private String operator;    //操作人员
    private String operator_time;   //操作时间
    private String order;   //展示顺序

    public Config_datadictEntity() {
    }

    public Config_datadictEntity(int config_datadict_id, int config_id, String config_name, String describe, String operator, String operator_time, String order) {
        this.config_datadict_id = config_datadict_id;
        this.config_id = config_id;
        this.config_name = config_name;
        this.describe = describe;
        this.operator = operator;
        this.operator_time = operator_time;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Config_datadictEntity{" +
                "config_datadict_id=" + config_datadict_id +
                ", config_id=" + config_id +
                ", config_name='" + config_name + '\'' +
                ", describe='" + describe + '\'' +
                ", operator='" + operator + '\'' +
                ", operator_time='" + operator_time + '\'' +
                ", order='" + order + '\'' +
                '}';
    }

    public int getConfig_datadict_id() {
        return config_datadict_id;
    }

    public void setConfig_datadict_id(int config_datadict_id) {
        this.config_datadict_id = config_datadict_id;
    }

    public int getConfig_id() {
        return config_id;
    }

    public void setConfig_id(int config_id) {
        this.config_id = config_id;
    }

    public String getConfig_name() {
        return config_name;
    }

    public void setConfig_name(String config_name) {
        this.config_name = config_name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator_time() {
        return operator_time;
    }

    public void setOperator_time(String operator_time) {
        this.operator_time = operator_time;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
