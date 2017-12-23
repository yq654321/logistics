package com.shadow.entity;

//货运差错表
public class Freight_ErrorEntity {

    private Integer freight_error_id;//货运差错ID

    private Integer waybills_receipt_id;//货运回执单ID

    private Integer waybills_id;//货运单ID

    private String customer;//客户名称

    private String goodsname;//货物名称

    private String mistaketype;//差错类别

    private Integer pieceamount;//件数

    private String size;//规格

    private Float goodsvalue;//货物价值

    public Integer getFreight_error_id() {
        return freight_error_id;
    }

    public void setFreight_error_id(Integer freight_error_id) {
        this.freight_error_id = freight_error_id;
    }

    public Integer getWaybills_receipt_id() {
        return waybills_receipt_id;
    }

    public void setWaybills_receipt_id(Integer waybills_receipt_id) {
        this.waybills_receipt_id = waybills_receipt_id;
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

    public String getMistaketype() {
        return mistaketype;
    }

    public void setMistaketype(String mistaketype) {
        this.mistaketype = mistaketype;
    }

    public Integer getPieceamount() {
        return pieceamount;
    }

    public void setPieceamount(Integer pieceamount) {
        this.pieceamount = pieceamount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Float getGoodsvalue() {
        return goodsvalue;
    }

    public void setGoodsvalue(Float goodsvalue) {
        this.goodsvalue = goodsvalue;
    }

    @Override
    public String toString() {
        return "Freight_ErrorEntity{" +
                "freight_error_id=" + freight_error_id +
                ", waybills_receipt_id=" + waybills_receipt_id +
                ", waybills_id=" + waybills_id +
                ", customer='" + customer + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", mistaketype='" + mistaketype + '\'' +
                ", pieceamount=" + pieceamount +
                ", size='" + size + '\'' +
                ", goodsvalue=" + goodsvalue +
                '}';
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Freight_ErrorEntity() {
    }


    public Freight_ErrorEntity(Integer freight_error_id, Integer waybills_receipt_id, Integer waybills_id, String customer, String goodsname, String mistaketype, Integer pieceamount, String size, Float goodsvalue) {
        this.freight_error_id = freight_error_id;
        this.waybills_receipt_id = waybills_receipt_id;
        this.waybills_id = waybills_id;
        this.customer = customer;
        this.goodsname = goodsname;
        this.mistaketype = mistaketype;
        this.pieceamount = pieceamount;
        this.size = size;
        this.goodsvalue = goodsvalue;
    }

}
