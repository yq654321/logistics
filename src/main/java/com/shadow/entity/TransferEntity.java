package com.shadow.entity;

import java.sql.Date;

//中转信息表
public class TransferEntity {
    private Integer Transfer_id;//中转ID

    private Integer waybills_id;//货运单ID

    private String transferstation;//中转地

    private String transfercheck;//中转验收人

    private String checktime;//验收时间

    private String description;//描述

    private String transfercompany;//中转公司名

    private String transferaddr;//中转地址

    private Integer transferstation_id;//中转地电话

    private String transferfee;//中转费

    private String aftertransferbill;//中转后单号



    public Integer getWaybills_id() {
        return waybills_id;
    }

    public void setWaybills_id(Integer waybills_id) {
        this.waybills_id = waybills_id;
    }

    public String getTransferstation() {
        return transferstation;
    }

    public void setTransferstation(String transferstation) {
        this.transferstation = transferstation;
    }

    public String getTransfercheck() {
        return transfercheck;
    }

    public void setTransfercheck(String transfercheck) {
        this.transfercheck = transfercheck;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTransfercompany() {
        return transfercompany;
    }

    public void setTransfercompany(String transfercompany) {
        this.transfercompany = transfercompany;
    }

    public String getTransferaddr() {
        return transferaddr;
    }

    public void setTransferaddr(String transferaddr) {
        this.transferaddr = transferaddr;
    }

    public Integer getTransferstation_id() {
        return transferstation_id;
    }

    public void setTransferstation_id(Integer transferstation_id) {
        this.transferstation_id = transferstation_id;
    }

    public String getTransferfee() {
        return transferfee;
    }

    public void setTransferfee(String transferfee) {
        this.transferfee = transferfee;
    }

    public String getAftertransferbill() {
        return aftertransferbill;
    }

    public void setAftertransferbill(String aftertransferbill) {
        this.aftertransferbill = aftertransferbill;
    }

    @Override
    public String toString() {
        return "TransferEntity{" +
                "Transfer_id='" + Transfer_id + '\'' +
                ", waybills_id=" + waybills_id +
                ", transferstation='" + transferstation + '\'' +
                ", transfercheck='" + transfercheck + '\'' +
                ", checktime='" + checktime + '\'' +
                ", description='" + description + '\'' +
                ", transfercompany='" + transfercompany + '\'' +
                ", transferaddr='" + transferaddr + '\'' +
                ", transferstation_id=" + transferstation_id +
                ", transferfee='" + transferfee + '\'' +
                ", aftertransferbill='" + aftertransferbill + '\'' +
                '}';
    }

    public TransferEntity() {
    }

    public Integer getTransfer_id() {
        return Transfer_id;
    }

    public void setTransfer_id(Integer transfer_id) {
        Transfer_id = transfer_id;
    }

    public TransferEntity(Integer transfer_id, Integer waybills_id, String transferstation, String transfercheck, String checktime, String description, String transfercompany, String transferaddr, Integer transferstation_id, String transferfee, String aftertransferbill) {

        Transfer_id = transfer_id;
        this.waybills_id = waybills_id;
        this.transferstation = transferstation;
        this.transfercheck = transfercheck;
        this.checktime = checktime;
        this.description = description;
        this.transfercompany = transfercompany;
        this.transferaddr = transferaddr;
        this.transferstation_id = transferstation_id;
        this.transferfee = transferfee;
        this.aftertransferbill = aftertransferbill;
    }
}
