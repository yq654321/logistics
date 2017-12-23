package com.shadow.entity;

//杂费结算表
public class IncidentalsEntity {
    private Integer incidentals_id;//杂费ID

    private String subjectname;//科目名称

    private Float balancemoney;//结算金额

    private String remark;//备注

    private String balancedate;//结算日期

    private String balancetype;//结算类型

    public Integer getIncidentals_id() {
        return incidentals_id;
    }

    public void setIncidentals_id(Integer incidentals_id) {
        this.incidentals_id = incidentals_id;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public Float getBalancemoney() {
        return balancemoney;
    }

    public void setBalancemoney(Float balancemoney) {
        this.balancemoney = balancemoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBalancedate() {
        return balancedate;
    }

    public void setBalancedate(String balancedate) {
        this.balancedate = balancedate;
    }

    public String getBalancetype() {
        return balancetype;
    }

    public void setBalancetype(String balancetype) {
        this.balancetype = balancetype;
    }

    @Override
    public String toString() {
        return "IncidentalsEntity{" +
                "incidentals_id=" + incidentals_id +
                ", subjectname='" + subjectname + '\'' +
                ", balancemoney=" + balancemoney +
                ", remark='" + remark + '\'' +
                ", balancedate='" + balancedate + '\'' +
                ", balancetype='" + balancetype + '\'' +
                '}';
    }

    public IncidentalsEntity(Integer incidentals_id, String subjectname, Float balancemoney, String remark, String balancedate, String balancetype) {
        this.incidentals_id = incidentals_id;
        this.subjectname = subjectname;
        this.balancemoney = balancemoney;
        this.remark = remark;
        this.balancedate = balancedate;
        this.balancetype = balancetype;
    }

    public IncidentalsEntity() {

    }
}
