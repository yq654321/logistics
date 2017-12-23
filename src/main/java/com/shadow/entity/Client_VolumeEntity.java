package com.shadow.entity;

//客户运量
public class Client_VolumeEntity {

    private String sendgoodscustomer;//发货客户


    private Float carriagetotal;//运费总计

    private Float insurancetotal;//保险费总计

    private Integer pieceamounttotal;//件数总计

    public String getSendgoodscustomer() {
        return sendgoodscustomer;
    }

    public void setSendgoodscustomer(String sendgoodscustomer) {
        this.sendgoodscustomer = sendgoodscustomer;
    }

    public Float getCarriagetotal() {
        return carriagetotal;
    }

    public void setCarriagetotal(Float carriagetotal) {
        this.carriagetotal = carriagetotal;
    }

    public Float getInsurancetotal() {
        return insurancetotal;
    }

    public void setInsurancetotal(Float insurancetotal) {
        this.insurancetotal = insurancetotal;
    }

    public Integer getPieceamounttotal() {
        return pieceamounttotal;
    }

    public void setPieceamounttotal(Integer pieceamounttotal) {
        this.pieceamounttotal = pieceamounttotal;
    }

    @Override
    public String toString() {
        return "Client_VolumeEntity{" +
                "sendgoodscustomer='" + sendgoodscustomer + '\'' +
                ", carriagetotal=" + carriagetotal +
                ", insurancetotal=" + insurancetotal +
                ", pieceamounttotal=" + pieceamounttotal +
                '}';
    }

    public Client_VolumeEntity() {
    }

    public Client_VolumeEntity(String sendgoodscustomer, Float carriagetotal, Float insurancetotal, Integer pieceamounttotal) {

        this.sendgoodscustomer = sendgoodscustomer;
        this.carriagetotal = carriagetotal;
        this.insurancetotal = insurancetotal;
        this.pieceamounttotal = pieceamounttotal;
    }
}
