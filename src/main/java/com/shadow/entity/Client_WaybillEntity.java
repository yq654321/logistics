package com.shadow.entity;

//客户运单结算
public class Client_WaybillEntity {
    private Integer client_waybill_id;//客户运单ID

    private String customer;//客户名称

    private Integer waybills_id;//货运单ID

    private Float billmoney;//本单金额

    private Float moneyreceivable;//应收金额

    private Float receivedmoney;//已收金额

    private Float prepaymoney;//预付金额

    private Float carriagereducefund;//运费减款

    private Float balance;//余额

    private String balancetime;//结算时间

    private Float insurance;//保险费

    private Float paykickback;//付回扣

    private Float carrygoodsfee;//送货费

    private String balancetype;//结算类型

    public Integer getClient_waybill_id() {
        return client_waybill_id;
    }

    public void setClient_waybill_id(Integer client_waybill_id) {
        this.client_waybill_id = client_waybill_id;
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

    public Float getPrepaymoney() {
        return prepaymoney;
    }

    public void setPrepaymoney(Float prepaymoney) {
        this.prepaymoney = prepaymoney;
    }

    public Float getCarriagereducefund() {
        return carriagereducefund;
    }

    public void setCarriagereducefund(Float carriagereducefund) {
        this.carriagereducefund = carriagereducefund;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getBalancetime() {
        return balancetime;
    }

    public void setBalancetime(String balancetime) {
        this.balancetime = balancetime;
    }

    public Float getInsurance() {
        return insurance;
    }

    public void setInsurance(Float insurance) {
        this.insurance = insurance;
    }

    public Float getPaykickback() {
        return paykickback;
    }

    public void setPaykickback(Float paykickback) {
        this.paykickback = paykickback;
    }

    public Float getCarrygoodsfee() {
        return carrygoodsfee;
    }

    public void setCarrygoodsfee(Float carrygoodsfee) {
        this.carrygoodsfee = carrygoodsfee;
    }

    public String getBalancetype() {
        return balancetype;
    }

    public void setBalancetype(String balancetype) {
        this.balancetype = balancetype;
    }

    @Override
    public String toString() {
        return "Client_WaybillEntity{" +
                "client_waybill_id=" + client_waybill_id +
                ", customer='" + customer + '\'' +
                ", waybills_id=" + waybills_id +
                ", billmoney=" + billmoney +
                ", moneyreceivable=" + moneyreceivable +
                ", receivedmoney=" + receivedmoney +
                ", prepaymoney=" + prepaymoney +
                ", carriagereducefund=" + carriagereducefund +
                ", balance=" + balance +
                ", balancetime='" + balancetime + '\'' +
                ", insurance=" + insurance +
                ", paykickback=" + paykickback +
                ", carrygoodsfee=" + carrygoodsfee +
                ", balancetype='" + balancetype + '\'' +
                '}';
    }

    public Client_WaybillEntity() {
    }

    public Client_WaybillEntity(Integer client_waybill_id, String customer, Integer waybills_id, Float billmoney, Float moneyreceivable, Float receivedmoney, Float prepaymoney, Float carriagereducefund, Float balance, String balancetime, Float insurance, Float paykickback, Float carrygoodsfee, String balancetype) {

        this.client_waybill_id = client_waybill_id;
        this.customer = customer;
        this.waybills_id = waybills_id;
        this.billmoney = billmoney;
        this.moneyreceivable = moneyreceivable;
        this.receivedmoney = receivedmoney;
        this.prepaymoney = prepaymoney;
        this.carriagereducefund = carriagereducefund;
        this.balance = balance;
        this.balancetime = balancetime;
        this.insurance = insurance;
        this.paykickback = paykickback;
        this.carrygoodsfee = carrygoodsfee;
        this.balancetype = balancetype;
    }
}
