package com.shadow.entity;

//装货发车清单:
public class Loading_DepartEntity {

    private Integer user_id;//用户ID

    private Integer id;//序号

    private String sendgoodscustomer;//发货客户

    private String goodsname;//货物名称

    private String goodscode;//货物编号

    private String transferdestination;//中转目的地

    private String sendgoodscustomertel;//发货客户电话

    private Float cashpay;//现付

    private Float pickuppay;//提付

    private Float backcost;//回结

    private String helpacceptfund;//代收款

    private String remark;//备注

    private String drivername;//司机名称

    private String carcardno;//车牌号

    private String mobile;//手机

    private Integer pieceamount;//件数

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSendgoodscustomer() {
        return sendgoodscustomer;
    }

    public void setSendgoodscustomer(String sendgoodscustomer) {
        this.sendgoodscustomer = sendgoodscustomer;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

    public String getTransferdestination() {
        return transferdestination;
    }

    public void setTransferdestination(String transferdestination) {
        this.transferdestination = transferdestination;
    }

    public String getSendgoodscustomertel() {
        return sendgoodscustomertel;
    }

    public void setSendgoodscustomertel(String sendgoodscustomertel) {
        this.sendgoodscustomertel = sendgoodscustomertel;
    }

    public Float getCashpay() {
        return cashpay;
    }

    public void setCashpay(Float cashpay) {
        this.cashpay = cashpay;
    }

    public Float getPickuppay() {
        return pickuppay;
    }

    public void setPickuppay(Float pickuppay) {
        this.pickuppay = pickuppay;
    }

    public Float getBackcost() {
        return backcost;
    }

    public void setBackcost(Float backcost) {
        this.backcost = backcost;
    }

    public String getHelpacceptfund() {
        return helpacceptfund;
    }

    public void setHelpacceptfund(String helpacceptfund) {
        this.helpacceptfund = helpacceptfund;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getCarcardno() {
        return carcardno;
    }

    public void setCarcardno(String carcardno) {
        this.carcardno = carcardno;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getPieceamount() {
        return pieceamount;
    }

    public void setPieceamount(Integer pieceamount) {
        this.pieceamount = pieceamount;
    }

    @Override
    public String toString() {
        return "Loading_DepartEntity{" +
                "user_id=" + user_id +
                ", id=" + id +
                ", sendgoodscustomer='" + sendgoodscustomer + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", goodscode='" + goodscode + '\'' +
                ", transferdestination='" + transferdestination + '\'' +
                ", sendgoodscustomertel='" + sendgoodscustomertel + '\'' +
                ", cashpay=" + cashpay +
                ", pickuppay=" + pickuppay +
                ", backcost=" + backcost +
                ", helpacceptfund='" + helpacceptfund + '\'' +
                ", remark='" + remark + '\'' +
                ", drivername='" + drivername + '\'' +
                ", carcardno='" + carcardno + '\'' +
                ", mobile='" + mobile + '\'' +
                ", pieceamount=" + pieceamount +
                '}';
    }

    public Loading_DepartEntity() {
    }

    public Loading_DepartEntity(Integer user_id, Integer id, String sendgoodscustomer, String goodsname, String goodscode, String transferdestination, String sendgoodscustomertel, Float cashpay, Float pickuppay, Float backcost, String helpacceptfund, String remark, String drivername, String carcardno, String mobile, Integer pieceamount) {

        this.user_id = user_id;
        this.id = id;
        this.sendgoodscustomer = sendgoodscustomer;
        this.goodsname = goodsname;
        this.goodscode = goodscode;
        this.transferdestination = transferdestination;
        this.sendgoodscustomertel = sendgoodscustomertel;
        this.cashpay = cashpay;
        this.pickuppay = pickuppay;
        this.backcost = backcost;
        this.helpacceptfund = helpacceptfund;
        this.remark = remark;
        this.drivername = drivername;
        this.carcardno = carcardno;
        this.mobile = mobile;
        this.pieceamount = pieceamount;
    }
}

