package com.shadow.entity;

import java.sql.Date;

//货运单
public class WaybillsEntity {
    private Integer waybills_id;//货运单编号

    private Integer sendgoodscustomer_id;//发货客户编号

    private String sendgooscustomertel;//发货客户电话

    private String receivegoodscustomer;//收货客户

    private String receivegoodscustomertel;//收货客户电话

    private String receivegoodscustomeraddr;//收货客户地址

    private String sendgoodsdate;//发货日期

    private String sendgoodsaddr;//发货地址

    private String receivegoodsaddr;//收货地址

    private String predeliverydate;//预期交货日期

    private String factdealdate;//实际交货日期

    private Float helpacceptpayment;//代收货款

    private String acceptprocedurerate;//代收手续费率

    private String paymode;//付款方式

    private String fetchgoodsmode;//取货方式

    private String writebillperson;//填票人

    private String writedate;//填写日期

    private String validity;//有效性

    private String ifaudit;//是否审核

    private String ifsettleaccounts;//是否结帐

    private String transferstation;//中转地

    private Float transferfee;//中转费

    private Float reducefund;//减款

    private Float paykickback;//付回扣

    private Float moneyofchangepay;//代收货款变更后金额

    private Float carrygoodsfee;//送货费

    private Float carriage;//运费

    private Float insurance;//保险费

    private Integer employee_id;//职员ID

    private String remark;//备注

    private String acceptstation;//接货点

    public Integer getWaybills_id() {
        return waybills_id;
    }

    public void setWaybills_id(Integer waybills_id) {
        this.waybills_id = waybills_id;
    }

    public Integer getSendgoodscustomer_id() {
        return sendgoodscustomer_id;
    }

    public void setSendgoodscustomer_id(Integer sendgoodscustomer_id) {
        this.sendgoodscustomer_id = sendgoodscustomer_id;
    }

    public String getSendgooscustomertel() {
        return sendgooscustomertel;
    }

    public void setSendgooscustomertel(String sendgooscustomertel) {
        this.sendgooscustomertel = sendgooscustomertel;
    }

    public String getReceivegoodscustomer() {
        return receivegoodscustomer;
    }

    public void setReceivegoodscustomer(String receivegoodscustomer) {
        this.receivegoodscustomer = receivegoodscustomer;
    }

    public String getReceivegoodscustomertel() {
        return receivegoodscustomertel;
    }

    public void setReceivegoodscustomertel(String receivegoodscustomertel) {
        this.receivegoodscustomertel = receivegoodscustomertel;
    }

    public String getReceivegoodscustomeraddr() {
        return receivegoodscustomeraddr;
    }

    public void setReceivegoodscustomeraddr(String receivegoodscustomeraddr) {
        this.receivegoodscustomeraddr = receivegoodscustomeraddr;
    }

    public String getSendgoodsdate() {
        return sendgoodsdate;
    }

    public void setSendgoodsdate(String sendgoodsdate) {
        this.sendgoodsdate = sendgoodsdate;
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

    public String getPredeliverydate() {
        return predeliverydate;
    }

    public void setPredeliverydate(String predeliverydate) {
        this.predeliverydate = predeliverydate;
    }

    public String getFactdealdate() {
        return factdealdate;
    }

    public void setFactdealdate(String factdealdate) {
        this.factdealdate = factdealdate;
    }

    public Float getHelpacceptpayment() {
        return helpacceptpayment;
    }

    public void setHelpacceptpayment(Float helpacceptpayment) {
        this.helpacceptpayment = helpacceptpayment;
    }

    public String getAcceptprocedurerate() {
        return acceptprocedurerate;
    }

    public void setAcceptprocedurerate(String acceptprocedurerate) {
        this.acceptprocedurerate = acceptprocedurerate;
    }

    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode;
    }

    public String getFetchgoodsmode() {
        return fetchgoodsmode;
    }

    public void setFetchgoodsmode(String fetchgoodsmode) {
        this.fetchgoodsmode = fetchgoodsmode;
    }

    public String getWritebillperson() {
        return writebillperson;
    }

    public void setWritebillperson(String writebillperson) {
        this.writebillperson = writebillperson;
    }

    public String getWritedate() {
        return writedate;
    }

    public void setWritedate(String writedate) {
        this.writedate = writedate;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getIfaudit() {
        return ifaudit;
    }

    public void setIfaudit(String ifaudit) {
        this.ifaudit = ifaudit;
    }

    public String getIfsettleaccounts() {
        return ifsettleaccounts;
    }

    public void setIfsettleaccounts(String ifsettleaccounts) {
        this.ifsettleaccounts = ifsettleaccounts;
    }

    public String getTransferstation() {
        return transferstation;
    }

    public void setTransferstation(String transferstation) {
        this.transferstation = transferstation;
    }

    public Float getTransferfee() {
        return transferfee;
    }

    public void setTransferfee(Float transferfee) {
        this.transferfee = transferfee;
    }

    public Float getReducefund() {
        return reducefund;
    }

    public void setReducefund(Float reducefund) {
        this.reducefund = reducefund;
    }

    public Float getPaykickback() {
        return paykickback;
    }

    public void setPaykickback(Float paykickback) {
        this.paykickback = paykickback;
    }

    public Float getMoneyofchangepay() {
        return moneyofchangepay;
    }

    public void setMoneyofchangepay(Float moneyofchangepay) {
        this.moneyofchangepay = moneyofchangepay;
    }

    public Float getCarrygoodsfee() {
        return carrygoodsfee;
    }

    public void setCarrygoodsfee(Float carrygoodsfee) {
        this.carrygoodsfee = carrygoodsfee;
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

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAcceptstation() {
        return acceptstation;
    }

    public void setAcceptstation(String acceptstation) {
        this.acceptstation = acceptstation;
    }

    @Override
    public String toString() {
        return "WaybillsEntity{" +
                "waybills_id=" + waybills_id +
                ", sendgoodscustomer_id=" + sendgoodscustomer_id +
                ", sendgooscustomertel='" + sendgooscustomertel + '\'' +
                ", receivegoodscustomer='" + receivegoodscustomer + '\'' +
                ", receivegoodscustomertel='" + receivegoodscustomertel + '\'' +
                ", receivegoodscustomeraddr='" + receivegoodscustomeraddr + '\'' +
                ", sendgoodsdate='" + sendgoodsdate + '\'' +
                ", sendgoodsaddr='" + sendgoodsaddr + '\'' +
                ", receivegoodsaddr='" + receivegoodsaddr + '\'' +
                ", predeliverydate='" + predeliverydate + '\'' +
                ", factdealdate='" + factdealdate + '\'' +
                ", helpacceptpayment=" + helpacceptpayment +
                ", acceptprocedurerate='" + acceptprocedurerate + '\'' +
                ", paymode='" + paymode + '\'' +
                ", fetchgoodsmode='" + fetchgoodsmode + '\'' +
                ", writebillperson='" + writebillperson + '\'' +
                ", writedate='" + writedate + '\'' +
                ", validity='" + validity + '\'' +
                ", ifaudit='" + ifaudit + '\'' +
                ", ifsettleaccounts='" + ifsettleaccounts + '\'' +
                ", transferstation='" + transferstation + '\'' +
                ", transferfee=" + transferfee +
                ", reducefund=" + reducefund +
                ", paykickback=" + paykickback +
                ", moneyofchangepay=" + moneyofchangepay +
                ", carrygoodsfee=" + carrygoodsfee +
                ", carriage=" + carriage +
                ", insurance=" + insurance +
                ", employee_id=" + employee_id +
                ", remark='" + remark + '\'' +
                ", acceptstation='" + acceptstation + '\'' +
                '}';
    }

    public WaybillsEntity(Integer waybills_id, Integer sendgoodscustomer_id, String sendgooscustomertel, String receivegoodscustomer, String receivegoodscustomertel, String receivegoodscustomeraddr, String sendgoodsdate, String sendgoodsaddr, String receivegoodsaddr, String predeliverydate, String factdealdate, Float helpacceptpayment, String acceptprocedurerate, String paymode, String fetchgoodsmode, String writebillperson, String writedate, String validity, String ifaudit, String ifsettleaccounts, String transferstation, Float transferfee, Float reducefund, Float paykickback, Float moneyofchangepay, Float carrygoodsfee, Float carriage, Float insurance, Integer employee_id, String remark, String acceptstation) {
        this.waybills_id = waybills_id;
        this.sendgoodscustomer_id = sendgoodscustomer_id;
        this.sendgooscustomertel = sendgooscustomertel;
        this.receivegoodscustomer = receivegoodscustomer;
        this.receivegoodscustomertel = receivegoodscustomertel;
        this.receivegoodscustomeraddr = receivegoodscustomeraddr;
        this.sendgoodsdate = sendgoodsdate;
        this.sendgoodsaddr = sendgoodsaddr;
        this.receivegoodsaddr = receivegoodsaddr;
        this.predeliverydate = predeliverydate;
        this.factdealdate = factdealdate;
        this.helpacceptpayment = helpacceptpayment;
        this.acceptprocedurerate = acceptprocedurerate;
        this.paymode = paymode;
        this.fetchgoodsmode = fetchgoodsmode;
        this.writebillperson = writebillperson;
        this.writedate = writedate;
        this.validity = validity;
        this.ifaudit = ifaudit;
        this.ifsettleaccounts = ifsettleaccounts;
        this.transferstation = transferstation;
        this.transferfee = transferfee;
        this.reducefund = reducefund;
        this.paykickback = paykickback;
        this.moneyofchangepay = moneyofchangepay;
        this.carrygoodsfee = carrygoodsfee;
        this.carriage = carriage;
        this.insurance = insurance;
        this.employee_id = employee_id;
        this.remark = remark;
        this.acceptstation = acceptstation;
    }

    public WaybillsEntity() {
    }
}
