package com.shadow.entity;

//货运单事件
public class Waybills_IncidentEntity {

    private Integer waybills_incident_id;//货运单事件ID

    private Integer waybills_id;//货运单ID

    private String eventname;//事件名称

    private String remark;//备注

    private String occurtime;//发生时间

    public Waybills_IncidentEntity() {
    }

    public Waybills_IncidentEntity(Integer waybills_incident_id, Integer waybills_id, String eventname, String remark, String occurtime) {

        this.waybills_incident_id = waybills_incident_id;
        this.waybills_id = waybills_id;
        this.eventname = eventname;
        this.remark = remark;
        this.occurtime = occurtime;
    }

    public Integer getWaybills_incident_id() {
        return waybills_incident_id;
    }

    public void setWaybills_incident_id(Integer waybills_incident_id) {
        this.waybills_incident_id = waybills_incident_id;
    }

    public Integer getWaybills_id() {
        return waybills_id;
    }

    public void setWaybills_id(Integer waybills_id) {
        this.waybills_id = waybills_id;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOccurtime() {
        return occurtime;
    }

    public void setOccurtime(String occurtime) {
        this.occurtime = occurtime;
    }

    @Override
    public String toString() {
        return "Waybills_IncidentEntity{" +
                "waybills_incident_id=" + waybills_incident_id +
                ", waybills_id=" + waybills_id +
                ", eventname='" + eventname + '\'' +
                ", remark='" + remark + '\'' +
                ", occurtime='" + occurtime + '\'' +
                '}';
    }
}
