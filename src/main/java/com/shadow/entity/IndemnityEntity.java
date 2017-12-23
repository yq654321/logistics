package com.shadow.entity;

//赔偿信息
public class IndemnityEntity {
    private String Indemnity_id;//赔偿ID

    private Float amends;//赔偿费

    private String customer;//客户名称

    private String amendstime;//赔偿时间

    private String remark;//备注

    private Integer receivestation_id;//收货点ID

    private Float baddestroygoods;//货差货损

    private String receivestationname;//收货点名

    private String writedate;//填写日期

    public String getIndemnity_id() {
        return Indemnity_id;
    }

    public void setIndemnity_id(String Indemnity_id) {
        this.Indemnity_id = Indemnity_id;
    }

    public Float getAmends() {
        return amends;
    }

    public void setAmends(Float amends) {
        this.amends = amends;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAmendstime() {
        return amendstime;
    }

    public void setAmendstime(String amendstime) {
        this.amendstime = amendstime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getReceivestation_id() {
        return receivestation_id;
    }

    public void setReceivestation_id(Integer receivestation_id) {
        this.receivestation_id = receivestation_id;
    }

    public Float getBaddestroygoods() {
        return baddestroygoods;
    }

    public void setBaddestroygoods(Float baddestroygoods) {
        this.baddestroygoods = baddestroygoods;
    }

    public String getReceivestationname() {
        return receivestationname;
    }

    public void setReceivestationname(String receivestationname) {
        this.receivestationname = receivestationname;
    }

    public String getWritedate() {
        return writedate;
    }

    public void setWritedate(String writedate) {
        this.writedate = writedate;
    }

    public IndemnityEntity(String indemnity_id, Float amends, String customer, String amendstime, String remark, Integer receivestation_id, Float baddestroygoods, String receivestationname, String writedate) {
        Indemnity_id = indemnity_id;
        this.amends = amends;
        this.customer = customer;
        this.amendstime = amendstime;
        this.remark = remark;
        this.receivestation_id = receivestation_id;
        this.baddestroygoods = baddestroygoods;
        this.receivestationname = receivestationname;
        this.writedate = writedate;
    }

    @Override
    public String toString() {
        return "IndemnityEntity{" +
                "Indemnity_id='" + Indemnity_id + '\'' +
                ", amends=" + amends +
                ", customer='" + customer + '\'' +
                ", amendstime='" + amendstime + '\'' +
                ", remark='" + remark + '\'' +
                ", receivestation_id=" + receivestation_id +
                ", baddestroygoods=" + baddestroygoods +
                ", receivestationname='" + receivestationname + '\'' +
                ", writedate='" + writedate + '\'' +
                '}';
    }

    public IndemnityEntity() {
    }
}
