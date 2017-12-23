package com.shadow.entity;

//投诉信息表:
public class ComplaintEntity {
    private Integer complaint_id;//投诉ID

    private String customer;//客户名称

    private Integer waybills_id;//货运单编号

    private String appealcontent;//投诉内容

    private String appealdate;//投诉日期

    private String ifhandle;//是否处理

    private String dealdate;//处理日期

    private String dealresult;//处理结果

    private String ifcallback;//是否回告

    private String callbackdate;//回告日期

    private String dealperson;//处理人

    public Integer getComplaint_id() {
        return complaint_id;
    }

    public void setComplaint_id(Integer complaint_id) {
        this.complaint_id = complaint_id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getWaybills_id() {
        return waybills_id;
    }

    public void setWaybills_id(Integer waybills_id) {
        this.waybills_id = waybills_id;
    }

    public String getAppealcontent() {
        return appealcontent;
    }

    public void setAppealcontent(String appealcontent) {
        this.appealcontent = appealcontent;
    }

    public String getAppealdate() {
        return appealdate;
    }

    public void setAppealdate(String appealdate) {
        this.appealdate = appealdate;
    }

    public String getIfhandle() {
        return ifhandle;
    }

    public void setIfhandle(String ifhandle) {
        this.ifhandle = ifhandle;
    }

    public String getDealdate() {
        return dealdate;
    }

    public void setDealdate(String dealdate) {
        this.dealdate = dealdate;
    }

    public String getDealresult() {
        return dealresult;
    }

    public void setDealresult(String dealresult) {
        this.dealresult = dealresult;
    }

    public String getIfcallback() {
        return ifcallback;
    }

    public void setIfcallback(String ifcallback) {
        this.ifcallback = ifcallback;
    }

    public String getCallbackdate() {
        return callbackdate;
    }

    public void setCallbackdate(String callbackdate) {
        this.callbackdate = callbackdate;
    }

    public String getDealperson() {
        return dealperson;
    }

    public void setDealperson(String dealperson) {
        this.dealperson = dealperson;
    }

    @Override
    public String toString() {
        return "ComplaintEntity{" +
                "complaint_id=" + complaint_id +
                ", customer='" + customer + '\'' +
                ", waybills_id=" + waybills_id +
                ", appealcontent='" + appealcontent + '\'' +
                ", appealdate='" + appealdate + '\'' +
                ", ifhandle='" + ifhandle + '\'' +
                ", dealdate='" + dealdate + '\'' +
                ", dealresult='" + dealresult + '\'' +
                ", ifcallback='" + ifcallback + '\'' +
                ", callbackdate='" + callbackdate + '\'' +
                ", dealperson='" + dealperson + '\'' +
                '}';
    }

    public ComplaintEntity() {
    }

    public ComplaintEntity(Integer complaint_id, String customer, Integer waybills_id, String appealcontent, String appealdate, String ifhandle, String dealdate, String dealresult, String ifcallback, String callbackdate, String dealperson) {

        this.complaint_id = complaint_id;
        this.customer = customer;
        this.waybills_id = waybills_id;
        this.appealcontent = appealcontent;
        this.appealdate = appealdate;
        this.ifhandle = ifhandle;
        this.dealdate = dealdate;
        this.dealresult = dealresult;
        this.ifcallback = ifcallback;
        this.callbackdate = callbackdate;
        this.dealperson = dealperson;
    }
}
