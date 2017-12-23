package com.shadow.entity;

//货运回执单详情
public class Waybills_Receipt_DetailsEntity {
    private Integer waybills_receipt_details_id;//货运单详表ID

    private Integer waybills_receipt_id;//货运回执单ID

    private Integer pieceamount;//件数

    private String weight;//重量

    private String volume;//体积

    private String pricemode;//计价方式

    private String pricestandard;//计费标准

    private Float goodsvalue;//货物价值

    public Integer getWaybills_receipt_details_id() {
        return waybills_receipt_details_id;
    }

    public void setWaybills_receipt_details_id(Integer waybills_receipt_details_id) {
        this.waybills_receipt_details_id = waybills_receipt_details_id;
    }

    public Integer getWaybills_receipt_id() {
        return waybills_receipt_id;
    }

    public void setWaybills_receipt_id(Integer waybills_receipt_id) {
        this.waybills_receipt_id = waybills_receipt_id;
    }

    public Integer getPieceamount() {
        return pieceamount;
    }

    public void setPieceamount(Integer pieceamount) {
        this.pieceamount = pieceamount;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPricemode() {
        return pricemode;
    }

    public void setPricemode(String pricemode) {
        this.pricemode = pricemode;
    }

    public String getPricestandard() {
        return pricestandard;
    }

    public void setPricestandard(String pricestandard) {
        this.pricestandard = pricestandard;
    }

    public Float getGoodsvalue() {
        return goodsvalue;
    }

    public void setGoodsvalue(Float goodsvalue) {
        this.goodsvalue = goodsvalue;
    }

    @Override
    public String toString() {
        return "Waybills_Receipt_DetailsEntity{" +
                "waybills_receipt_details_id=" + waybills_receipt_details_id +
                ", waybills_receipt_id=" + waybills_receipt_id +
                ", pieceamount=" + pieceamount +
                ", weight='" + weight + '\'' +
                ", volume='" + volume + '\'' +
                ", pricemode='" + pricemode + '\'' +
                ", pricestandard='" + pricestandard + '\'' +
                ", goodsvalue=" + goodsvalue +
                '}';
    }

    public Waybills_Receipt_DetailsEntity(Integer waybills_receipt_details_id, Integer waybills_receipt_id, Integer pieceamount, String weight, String volume, String pricemode, String pricestandard, Float goodsvalue) {
        this.waybills_receipt_details_id = waybills_receipt_details_id;
        this.waybills_receipt_id = waybills_receipt_id;
        this.pieceamount = pieceamount;
        this.weight = weight;
        this.volume = volume;
        this.pricemode = pricemode;
        this.pricestandard = pricestandard;
        this.goodsvalue = goodsvalue;
    }

    public Waybills_Receipt_DetailsEntity() {

    }
}
