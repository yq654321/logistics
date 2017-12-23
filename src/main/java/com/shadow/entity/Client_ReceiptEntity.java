package com.shadow.entity;

//客户回执信息表
public class Client_ReceiptEntity {
    private Integer client_receipt_id;//客户回执ID

    private String waybills_id;//货运单ID

    private String customer;//客户名称

    private String checkgoodsrecord;//验收货物记录

    private String receivegoodsperson;//收货人

    private String receivegoodsdate;//收货日期

    private Integer waybills_incident_id;//运单事件ID

    public Integer getClient_receipt_id() {
        return client_receipt_id;
    }

    public void setClient_receipt_id(Integer client_receipt_id) {
        this.client_receipt_id = client_receipt_id;
    }

    public String getWaybills_id() {
        return waybills_id;
    }

    public void setWaybills_id(String waybills_id) {
        this.waybills_id = waybills_id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCheckgoodsrecord() {
        return checkgoodsrecord;
    }

    public void setCheckgoodsrecord(String checkgoodsrecord) {
        this.checkgoodsrecord = checkgoodsrecord;
    }

    public String getReceivegoodsperson() {
        return receivegoodsperson;
    }

    public void setReceivegoodsperson(String receivegoodsperson) {
        this.receivegoodsperson = receivegoodsperson;
    }

    public String getReceivegoodsdate() {
        return receivegoodsdate;
    }

    public void setReceivegoodsdate(String receivegoodsdate) {
        this.receivegoodsdate = receivegoodsdate;
    }

    public Integer getWaybills_incident_id() {
        return waybills_incident_id;
    }

    public void setWaybills_incident_id(Integer waybills_incident_id) {
        this.waybills_incident_id = waybills_incident_id;
    }

    @Override
    public String toString() {
        return "Client_ReceiptEntity{" +
                "client_receipt_id=" + client_receipt_id +
                ", waybills_id='" + waybills_id + '\'' +
                ", customer='" + customer + '\'' +
                ", checkgoodsrecord='" + checkgoodsrecord + '\'' +
                ", receivegoodsperson='" + receivegoodsperson + '\'' +
                ", receivegoodsdate='" + receivegoodsdate + '\'' +
                ", waybills_incident_id=" + waybills_incident_id +
                '}';
    }

    public Client_ReceiptEntity(Integer client_receipt_id, String waybills_id, String customer, String checkgoodsrecord, String receivegoodsperson, String receivegoodsdate, Integer waybills_incident_id) {
        this.client_receipt_id = client_receipt_id;
        this.waybills_id = waybills_id;
        this.customer = customer;
        this.checkgoodsrecord = checkgoodsrecord;
        this.receivegoodsperson = receivegoodsperson;
        this.receivegoodsdate = receivegoodsdate;
        this.waybills_incident_id = waybills_incident_id;
    }

    public Client_ReceiptEntity() {

    }
}
