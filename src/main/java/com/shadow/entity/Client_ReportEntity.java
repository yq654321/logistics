package com.shadow.entity;

//客户回告
public class Client_ReportEntity {
    private Integer client_report_id;//客户回告ID

    private Integer waybills_id;//货运单ID

    private String ifcallback;//是否回告

    public Integer getClient_report_id() {
        return client_report_id;
    }

    public void setClient_report_id(Integer client_report_id) {
        this.client_report_id = client_report_id;
    }

    public Integer getWaybills_id() {
        return waybills_id;
    }

    public void setWaybills_id(Integer waybills_id) {
        this.waybills_id = waybills_id;
    }

    public String getIfcallback() {
        return ifcallback;
    }

    public void setIfcallback(String ifcallback) {
        this.ifcallback = ifcallback;
    }

    @Override
    public String toString() {
        return "Client_ReportEntity{" +
                "client_report_id=" + client_report_id +
                ", waybills_id=" + waybills_id +
                ", ifcallback='" + ifcallback + '\'' +
                '}';
    }

    public Client_ReportEntity() {
    }

    public Client_ReportEntity(Integer client_report_id, Integer waybills_id, String ifcallback) {

        this.client_report_id = client_report_id;
        this.waybills_id = waybills_id;
        this.ifcallback = ifcallback;
    }
}
