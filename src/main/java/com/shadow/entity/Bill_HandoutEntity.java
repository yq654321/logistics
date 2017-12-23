package com.shadow.entity;

//单据表
public class Bill_HandoutEntity {
    private Integer billcode_id;//单据id
    private String bulltype;//单据类型
    private String bullstartcode;//单据开始编号
    private String bullendcode;//单据结束编号
    private String receivebillperson;//领票人
    private String acceptstation;//接货点
    private String receivebilltime;//领票时间
    private String releaseperson;//分发人
    private String writedate;//填写日期
    private String billstate;//单据状态

    public Integer getBillcode_id() {
        return billcode_id;
    }

    public void setBillcode_id(Integer billcode_id) {
        this.billcode_id = billcode_id;
    }

    public String getBulltype() {
        return bulltype;
    }

    public void setBulltype(String bulltype) {
        this.bulltype = bulltype;
    }

    public String getBullstartcode() {
        return bullstartcode;
    }

    public void setBullstartcode(String bullstartcode) {
        this.bullstartcode = bullstartcode;
    }

    public String getBullendcode() {
        return bullendcode;
    }

    public void setBullendcode(String bullendcode) {
        this.bullendcode = bullendcode;
    }

    public String getReceivebillperson() {
        return receivebillperson;
    }

    public void setReceivebillperson(String receivebillperson) {
        this.receivebillperson = receivebillperson;
    }

    public String getAcceptstation() {
        return acceptstation;
    }

    public void setAcceptstation(String acceptstation) {
        this.acceptstation = acceptstation;
    }

    public String getReceivebilltime() {
        return receivebilltime;
    }

    public void setReceivebilltime(String receivebilltime) {
        this.receivebilltime = receivebilltime;
    }

    public String getReleaseperson() {
        return releaseperson;
    }

    public void setReleaseperson(String releaseperson) {
        this.releaseperson = releaseperson;
    }

    public String getWritedate() {
        return writedate;
    }

    public void setWritedate(String writedate) {
        this.writedate = writedate;
    }

    public String getBillstate() {
        return billstate;
    }

    public void setBillstate(String billstate) {
        this.billstate = billstate;
    }

    @Override
    public String toString() {
        return "Bill_handoutEntity{" +
                "billcode_id=" + billcode_id +
                ", bulltype='" + bulltype + '\'' +
                ", bullstartcode='" + bullstartcode + '\'' +
                ", bullendcode='" + bullendcode + '\'' +
                ", receivebillperson='" + receivebillperson + '\'' +
                ", acceptstation='" + acceptstation + '\'' +
                ", receivebilltime='" + receivebilltime + '\'' +
                ", releaseperson='" + releaseperson + '\'' +
                ", writedate='" + writedate + '\'' +
                ", billstate='" + billstate + '\'' +
                '}';
    }

    public Bill_HandoutEntity() {
    }

    public Bill_HandoutEntity(Integer billcode_id, String bulltype, String bullstartcode, String bullendcode, String receivebillperson, String acceptstation, String receivebilltime, String releaseperson, String writedate, String billstate) {

        this.billcode_id = billcode_id;
        this.bulltype = bulltype;
        this.bullstartcode = bullstartcode;
        this.bullendcode = bullendcode;
        this.receivebillperson = receivebillperson;
        this.acceptstation = acceptstation;
        this.receivebilltime = receivebilltime;
        this.releaseperson = releaseperson;
        this.writedate = writedate;
        this.billstate = billstate;
    }
}
