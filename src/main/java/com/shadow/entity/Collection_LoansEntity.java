package com.shadow.entity;

//代收贷款结算
public class Collection_LoansEntity {
    private Integer collection_loans_id;//代收贷款ID

    private String customer;//客户名称

    private String waybills_id;//货运单ID

    private Float accountreceivable;//应收货款

    private Float factreceivefund;//实收货款

    private Float goodspaychange;//货款变更

    private Float commisionrate;//佣金率

    private Float commisionreceivable;//应收佣金

    private Float receivedcommision;//已收佣金

    private String balancedate;//结算日期

    public Integer getCollection_loans_id() {
        return collection_loans_id;
    }

    public void setCollection_loans_id(Integer collection_loans_id) {
        this.collection_loans_id = collection_loans_id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getWaybills_id() {
        return waybills_id;
    }

    public void setWaybills_id(String waybills_id) {
        this.waybills_id = waybills_id;
    }

    public Float getAccountreceivable() {
        return accountreceivable;
    }

    public void setAccountreceivable(Float accountreceivable) {
        this.accountreceivable = accountreceivable;
    }

    public Float getFactreceivefund() {
        return factreceivefund;
    }

    public void setFactreceivefund(Float factreceivefund) {
        this.factreceivefund = factreceivefund;
    }

    public Float getGoodspaychange() {
        return goodspaychange;
    }

    public void setGoodspaychange(Float goodspaychange) {
        this.goodspaychange = goodspaychange;
    }

    public Float getCommisionrate() {
        return commisionrate;
    }

    public void setCommisionrate(Float commisionrate) {
        this.commisionrate = commisionrate;
    }

    public Float getCommisionreceivable() {
        return commisionreceivable;
    }

    public void setCommisionreceivable(Float commisionreceivable) {
        this.commisionreceivable = commisionreceivable;
    }

    public Float getReceivedcommision() {
        return receivedcommision;
    }

    public void setReceivedcommision(Float receivedcommision) {
        this.receivedcommision = receivedcommision;
    }

    public String getBalancedate() {
        return balancedate;
    }

    public void setBalancedate(String balancedate) {
        this.balancedate = balancedate;
    }

    @Override
    public String toString() {
        return "Collection_LoansEntity{" +
                "collection_loans_id=" + collection_loans_id +
                ", customer='" + customer + '\'' +
                ", waybills_id='" + waybills_id + '\'' +
                ", accountreceivable=" + accountreceivable +
                ", factreceivefund=" + factreceivefund +
                ", goodspaychange=" + goodspaychange +
                ", commisionrate=" + commisionrate +
                ", commisionreceivable=" + commisionreceivable +
                ", receivedcommision=" + receivedcommision +
                ", balancedate='" + balancedate + '\'' +
                '}';
    }

    public Collection_LoansEntity(Integer collection_loans_id, String customer, String waybills_id, Float accountreceivable, Float factreceivefund, Float goodspaychange, Float commisionrate, Float commisionreceivable, Float receivedcommision, String balancedate) {
        this.collection_loans_id = collection_loans_id;
        this.customer = customer;
        this.waybills_id = waybills_id;
        this.accountreceivable = accountreceivable;
        this.factreceivefund = factreceivefund;
        this.goodspaychange = goodspaychange;
        this.commisionrate = commisionrate;
        this.commisionreceivable = commisionreceivable;
        this.receivedcommision = receivedcommision;
        this.balancedate = balancedate;
    }

    public Collection_LoansEntity() {

    }
}
