package com.shadow.entity;

import java.sql.Date;

//司机结算
public class MotormanEntity {
    private Integer motorman_id;//司机ID

    private String drivername;//司机名称

    private String balancetype;//结算类型

    private Integer waybills_receipt_id;//回执单编号

    private Float needpayment;//应付金额

    private Float carryfee;//承运费

    private Float prepaymoney;//预付金额

    private Float bindInsurance;//订装保证金

    private Float addcarriage;//加运费

    private Float payedmoney;//已付金额

    private Float balance;//余额

    private String balancetime;//结算时间

    private Float dispatchservicefee;//配载服务费

    private Float insurance;//保险费

    public Integer getMotorman_id() {
        return motorman_id;
    }

    public void setMotorman_id(Integer motorman_id) {
        this.motorman_id = motorman_id;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getBalancetype() {
        return balancetype;
    }

    public void setBalancetype(String balancetype) {
        this.balancetype = balancetype;
    }

    public Integer getWaybills_receipt_id() {
        return waybills_receipt_id;
    }

    public void setWaybills_receipt_id(Integer waybills_receipt_id) {
        this.waybills_receipt_id = waybills_receipt_id;
    }

    public Float getNeedpayment() {
        return needpayment;
    }

    public void setNeedpayment(Float needpayment) {
        this.needpayment = needpayment;
    }

    public Float getCarryfee() {
        return carryfee;
    }

    public void setCarryfee(Float carryfee) {
        this.carryfee = carryfee;
    }

    public Float getPrepaymoney() {
        return prepaymoney;
    }

    public void setPrepaymoney(Float prepaymoney) {
        this.prepaymoney = prepaymoney;
    }

    public Float getBindInsurance() {
        return bindInsurance;
    }

    public void setBindInsurance(Float bindInsurance) {
        this.bindInsurance = bindInsurance;
    }

    public Float getAddcarriage() {
        return addcarriage;
    }

    public void setAddcarriage(Float addcarriage) {
        this.addcarriage = addcarriage;
    }

    public Float getPayedmoney() {
        return payedmoney;
    }

    public void setPayedmoney(Float payedmoney) {
        this.payedmoney = payedmoney;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public MotormanEntity() {
    }

    @Override
    public String toString() {
        return "MotormanEntity{" +
                "motorman_id=" + motorman_id +
                ", drivername='" + drivername + '\'' +
                ", balancetype='" + balancetype + '\'' +
                ", waybills_receipt_id=" + waybills_receipt_id +
                ", needpayment=" + needpayment +
                ", carryfee=" + carryfee +
                ", prepaymoney=" + prepaymoney +
                ", bindInsurance=" + bindInsurance +
                ", addcarriage=" + addcarriage +
                ", payedmoney=" + payedmoney +
                ", balance=" + balance +
                ", balancetime='" + balancetime + '\'' +
                ", dispatchservicefee=" + dispatchservicefee +
                ", insurance=" + insurance +
                '}';
    }

    public String getBalancetime() {
        return balancetime;
    }

    public void setBalancetime(String balancetime) {
        this.balancetime = balancetime;
    }

    public MotormanEntity(Integer motorman_id, String drivername, String balancetype, Integer waybills_receipt_id, Float needpayment, Float carryfee, Float prepaymoney, Float bindInsurance, Float addcarriage, Float payedmoney, Float balance, String balancetime, Float dispatchservicefee, Float insurance) {

        this.motorman_id = motorman_id;
        this.drivername = drivername;
        this.balancetype = balancetype;
        this.waybills_receipt_id = waybills_receipt_id;
        this.needpayment = needpayment;
        this.carryfee = carryfee;
        this.prepaymoney = prepaymoney;
        this.bindInsurance = bindInsurance;
        this.addcarriage = addcarriage;
        this.payedmoney = payedmoney;
        this.balance = balance;
        this.balancetime = balancetime;
        this.dispatchservicefee = dispatchservicefee;
        this.insurance = insurance;
    }

    public Float getDispatchservicefee() {
        return dispatchservicefee;
    }

    public void setDispatchservicefee(Float dispatchservicefee) {
        this.dispatchservicefee = dispatchservicefee;
    }

    public Float getInsurance() {
        return insurance;
    }

    public void setInsurance(Float insurance) {
        this.insurance = insurance;
    }
}
