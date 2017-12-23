package com.shadow.entity;

//往来业务:
public class Come_BusinessEntity {

    private String sendgoodscustomer;//发货客户

    private Integer waybills_id;//货运单编号

    private String sendgoodsaddr;//发货地址

    private String receivegoodsaddr;//收货地址

    private Float carriage;//运费

    private Float insurance;//保险费

    private Float billmoney;//本单金额

    private Float moneyreceivable;//应收金额

    private Float receivedmoney;//已收金额

    private Float balance;//余额

    private String sendgoodsdate;//发货日期

    public String getSendgoodscustomer() {
        return sendgoodscustomer;
    }

    public void setSendgoodscustomer(String sendgoodscustomer) {
        this.sendgoodscustomer = sendgoodscustomer;
    }

    public Integer getWaybills_id() {
        return waybills_id;
    }

    public void setWaybills_id(Integer waybills_id) {
        this.waybills_id = waybills_id;
    }

    public String getSendgoodsaddr() {
        return sendgoodsaddr;
    }

    public void setSendgoodsaddr(String sendgoodsaddr) {
        this.sendgoodsaddr = sendgoodsaddr;
    }

    public String getReceivegoodsaddr() {
        return receivegoodsaddr;
    }

    public void setReceivegoodsaddr(String receivegoodsaddr) {
        this.receivegoodsaddr = receivegoodsaddr;
    }

    public Float getCarriage() {
        return carriage;
    }

    public void setCarriage(Float carriage) {
        this.carriage = carriage;
    }

    public Float getInsurance() {
        return insurance;
    }

    public void setInsurance(Float insurance) {
        this.insurance = insurance;
    }

    public Float getBillmoney() {
        return billmoney;
    }

    public void setBillmoney(Float billmoney) {
        this.billmoney = billmoney;
    }

    public Float getMoneyreceivable() {
        return moneyreceivable;
    }

    public void setMoneyreceivable(Float moneyreceivable) {
        this.moneyreceivable = moneyreceivable;
    }

    public Float getReceivedmoney() {
        return receivedmoney;
    }

    public void setReceivedmoney(Float receivedmoney) {
        this.receivedmoney = receivedmoney;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getSendgoodsdate() {
        return sendgoodsdate;
    }

    public void setSendgoodsdate(String sendgoodsdate) {
        this.sendgoodsdate = sendgoodsdate;
    }

    @Override
    public String toString() {
        return "Come_BusinessEntity{" +
                "sendgoodscustomer='" + sendgoodscustomer + '\'' +
                ", waybills_id=" + waybills_id +
                ", sendgoodsaddr='" + sendgoodsaddr + '\'' +
                ", receivegoodsaddr='" + receivegoodsaddr + '\'' +
                ", carriage=" + carriage +
                ", insurance=" + insurance +
                ", billmoney=" + billmoney +
                ", moneyreceivable=" + moneyreceivable +
                ", receivedmoney=" + receivedmoney +
                ", balance=" + balance +
                ", sendgoodsdate='" + sendgoodsdate + '\'' +
                '}';
    }

    public Come_BusinessEntity() {
    }

    public Come_BusinessEntity(String sendgoodscustomer, Integer waybills_id, String sendgoodsaddr, String receivegoodsaddr, Float carriage, Float insurance, Float billmoney, Float moneyreceivable, Float receivedmoney, Float balance, String sendgoodsdate) {

        this.sendgoodscustomer = sendgoodscustomer;
        this.waybills_id = waybills_id;
        this.sendgoodsaddr = sendgoodsaddr;
        this.receivegoodsaddr = receivegoodsaddr;
        this.carriage = carriage;
        this.insurance = insurance;
        this.billmoney = billmoney;
        this.moneyreceivable = moneyreceivable;
        this.receivedmoney = receivedmoney;
        this.balance = balance;
        this.sendgoodsdate = sendgoodsdate;
    }
}
