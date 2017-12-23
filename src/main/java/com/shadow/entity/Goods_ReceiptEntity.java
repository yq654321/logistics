package com.shadow.entity;

//货物回执信息表
public class Goods_ReceiptEntity {
    private Integer goods_receipt_id;//货物回执单ID

    private Integer waybills_id;//货运单ID

    private String customer;//客户名称

    private String checkgoodsrecord;//验收货物记录

    private String receivegoodsperson;//收货人

    private String receivegoodsdate;//收货日期

    private Integer waybills_incident_id;//货运单事件ID

    public Goods_ReceiptEntity() {
    }

    public Goods_ReceiptEntity(Integer goods_receipt_id, Integer waybills_id, String customer, String checkgoodsrecord, String receivegoodsperson, String receivegoodsdate, Integer waybills_incident_id) {

        this.goods_receipt_id = goods_receipt_id;
        this.waybills_id = waybills_id;
        this.customer = customer;
        this.checkgoodsrecord = checkgoodsrecord;
        this.receivegoodsperson = receivegoodsperson;
        this.receivegoodsdate = receivegoodsdate;
        this.waybills_incident_id = waybills_incident_id;
    }

    @Override
    public String toString() {
        return "Goods_ReceiptEntity{" +
                "goods_receipt_id=" + goods_receipt_id +
                ", waybills_id=" + waybills_id +
                ", customer='" + customer + '\'' +
                ", checkgoodsrecord='" + checkgoodsrecord + '\'' +
                ", receivegoodsperson='" + receivegoodsperson + '\'' +
                ", receivegoodsdate='" + receivegoodsdate + '\'' +
                ", waybills_incident_id=" + waybills_incident_id +
                '}';
    }

    public Integer getGoods_receipt_id() {
        return goods_receipt_id;
    }

    public void setGoods_receipt_id(Integer goods_receipt_id) {
        this.goods_receipt_id = goods_receipt_id;
    }

    public Integer getWaybills_id() {
        return waybills_id;
    }

    public void setWaybills_id(Integer waybills_id) {
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
}
