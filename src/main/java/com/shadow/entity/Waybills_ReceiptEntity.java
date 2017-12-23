package com.shadow.entity;

import java.sql.Date;

//货运回执单主表
public class Waybills_ReceiptEntity {
    private Integer waybills_receipt_id;//货运回执单ID

    private String loadstation;//装货地点

    private String startcarrytime;//起运时间

    private String receivegoodslinkman;//收货联系人

    private String linkmanphone;//联系人电话

    private String linkmanmobile;//联系人手机

    private String receivegoodsdetailaddr;//收货详细地址

    private String carriagebanlancemode;//运费结算方式

    private String remark;//备注

    private Integer driver_id;//司机ID

    private String ifbalance;//是否结算

    private String backbillstate;//回执单状态

    private Float startadvance;//起运时的预付费用

    private Float carrygoodsbilldeposit;//送货单回执押金

    private Float carrygoodsInsurance;//承运人订装货物保证金

    private Float dispatchservicefee;//配载服务费

    private Float allcarriage;//总运费

    private Float insurance;//保险费

    private String signtime;//签定时间

    private String aceptstation;//接货点

    private String carriagemode;//运费计价方式

    private String execute;//执行

    public Integer getWaybills_receipt_id() {
        return waybills_receipt_id;
    }

    public void setWaybills_receipt_id(Integer waybills_receipt_id) {
        this.waybills_receipt_id = waybills_receipt_id;
    }

    public String getLoadstation() {
        return loadstation;
    }

    public void setLoadstation(String loadstation) {
        this.loadstation = loadstation;
    }


    public String getReceivegoodslinkman() {
        return receivegoodslinkman;
    }

    public void setReceivegoodslinkman(String receivegoodslinkman) {
        this.receivegoodslinkman = receivegoodslinkman;
    }

    public String getLinkmanphone() {
        return linkmanphone;
    }

    public void setLinkmanphone(String linkmanphone) {
        this.linkmanphone = linkmanphone;
    }

    public String getLinkmanmobile() {
        return linkmanmobile;
    }

    public void setLinkmanmobile(String linkmanmobile) {
        this.linkmanmobile = linkmanmobile;
    }

    public String getReceivegoodsdetailaddr() {
        return receivegoodsdetailaddr;
    }

    public void setReceivegoodsdetailaddr(String receivegoodsdetailaddr) {
        this.receivegoodsdetailaddr = receivegoodsdetailaddr;
    }

    public String getCarriagebanlancemode() {
        return carriagebanlancemode;
    }

    public void setCarriagebanlancemode(String carriagebanlancemode) {
        this.carriagebanlancemode = carriagebanlancemode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Integer driver_id) {
        this.driver_id = driver_id;
    }

    public String getIfbalance() {
        return ifbalance;
    }

    public void setIfbalance(String ifbalance) {
        this.ifbalance = ifbalance;
    }

    public String getBackbillstate() {
        return backbillstate;
    }

    public void setBackbillstate(String backbillstate) {
        this.backbillstate = backbillstate;
    }

    public Float getStartadvance() {
        return startadvance;
    }

    public void setStartadvance(Float startadvance) {
        this.startadvance = startadvance;
    }

    public Float getCarrygoodsbilldeposit() {
        return carrygoodsbilldeposit;
    }

    public void setCarrygoodsbilldeposit(Float carrygoodsbilldeposit) {
        this.carrygoodsbilldeposit = carrygoodsbilldeposit;
    }

    public Float getCarrygoodsInsurance() {
        return carrygoodsInsurance;
    }

    public void setCarrygoodsInsurance(Float carrygoodsInsurance) {
        this.carrygoodsInsurance = carrygoodsInsurance;
    }

    public Float getDispatchservicefee() {
        return dispatchservicefee;
    }

    public void setDispatchservicefee(Float dispatchservicefee) {
        this.dispatchservicefee = dispatchservicefee;
    }

    public Float getAllcarriage() {
        return allcarriage;
    }

    public void setAllcarriage(Float allcarriage) {
        this.allcarriage = allcarriage;
    }

    public Float getInsurance() {
        return insurance;
    }

    public void setInsurance(Float insurance) {
        this.insurance = insurance;
    }

    public String getAceptstation() {
        return aceptstation;
    }

    public void setAceptstation(String aceptstation) {
        this.aceptstation = aceptstation;
    }

    public String getCarriagemode() {
        return carriagemode;
    }

    public void setCarriagemode(String carriagemode) {
        this.carriagemode = carriagemode;
    }

    public String getExecute() {
        return execute;
    }

    public void setExecute(String execute) {
        this.execute = execute;
    }

    public String getStartcarrytime() {
        return startcarrytime;
    }

    public void setStartcarrytime(String startcarrytime) {
        this.startcarrytime = startcarrytime;
    }

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime;
    }

    @Override
    public String toString() {
        return "Waybills_ReceiptEntity{" +
                "waybills_receipt_id=" + waybills_receipt_id +
                ", loadstation='" + loadstation + '\'' +
                ", startcarrytime=" + startcarrytime +
                ", receivegoodslinkman='" + receivegoodslinkman + '\'' +
                ", linkmanphone='" + linkmanphone + '\'' +

                ", linkmanmobile='" + linkmanmobile + '\'' +
                ", receivegoodsdetailaddr='" + receivegoodsdetailaddr + '\'' +
                ", carriagebanlancemode='" + carriagebanlancemode + '\'' +
                ", remark='" + remark + '\'' +
                ", driver_id=" + driver_id +
                ", ifbalance='" + ifbalance + '\'' +
                ", backbillstate='" + backbillstate + '\'' +
                ", startadvance=" + startadvance +
                ", carrygoodsbilldeposit=" + carrygoodsbilldeposit +
                ", carrygoodsInsurance=" + carrygoodsInsurance +
                ", dispatchservicefee=" + dispatchservicefee +
                ", allcarriage=" + allcarriage +
                ", insurance=" + insurance +
                ", signtime=" + signtime +
                ", aceptstation='" + aceptstation + '\'' +
                ", carriagemode='" + carriagemode + '\'' +
                ", execute='" + execute + '\'' +
                '}';
    }



    public Waybills_ReceiptEntity(Integer waybills_receipt_id, String loadstation, String startcarrytime, String receivegoodslinkman, String linkmanphone, String linkmanmobile, String receivegoodsdetailaddr, String carriagebanlancemode, String remark, Integer driver_id, String ifbalance, String backbillstate, Float startadvance, Float carrygoodsbilldeposit, Float carrygoodsInsurance, Float dispatchservicefee, Float allcarriage, Float insurance, String signtime, String aceptstation, String carriagemode, String execute) {
        this.waybills_receipt_id = waybills_receipt_id;
        this.loadstation = loadstation;
        this.startcarrytime = startcarrytime;
        this.receivegoodslinkman = receivegoodslinkman;
        this.linkmanphone = linkmanphone;
        this.linkmanmobile = linkmanmobile;
        this.receivegoodsdetailaddr = receivegoodsdetailaddr;
        this.carriagebanlancemode = carriagebanlancemode;
        this.remark = remark;
        this.driver_id = driver_id;
        this.ifbalance = ifbalance;
        this.backbillstate = backbillstate;
        this.startadvance = startadvance;
        this.carrygoodsbilldeposit = carrygoodsbilldeposit;
        this.carrygoodsInsurance = carrygoodsInsurance;
        this.dispatchservicefee = dispatchservicefee;
        this.allcarriage = allcarriage;
        this.insurance = insurance;
        this.signtime = signtime;
        this.aceptstation = aceptstation;
        this.carriagemode = carriagemode;
        this.execute = execute;
    }

    public Waybills_ReceiptEntity() {

    }
}
