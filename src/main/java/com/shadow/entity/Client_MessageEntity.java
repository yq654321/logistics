package com.shadow.entity;

//回告信息
public class Client_MessageEntity {
    private Integer report_message_id;//回告ID

    private String dialnO;//拨出号码

    private String type;//类别

    private String content;//内容

    private String writetime;//填写时间

    private String writer;//填写人

    private String finallydialtime;//最后拨出时间

    private Integer success;//成功

    private Integer locked;//锁定

    private Integer billcode_id;//单据号

    private String billtype;//单据类型

    public Integer getReport_message_id() {
        return report_message_id;
    }

    public void setReport_message_id(Integer report_message_id) {
        this.report_message_id = report_message_id;
    }

    public String getDialnO() {
        return dialnO;
    }

    public void setDialnO(String dialnO) {
        this.dialnO = dialnO;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWritetime() {
        return writetime;
    }

    public void setWritetime(String writetime) {
        this.writetime = writetime;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getFinallydialtime() {
        return finallydialtime;
    }

    public void setFinallydialtime(String finallydialtime) {
        this.finallydialtime = finallydialtime;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Integer getBillcode_id() {
        return billcode_id;
    }

    public void setBillcode_id(Integer billcode_id) {
        this.billcode_id = billcode_id;
    }

    public String getBilltype() {
        return billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    @Override
    public String toString() {
        return "Client_MessageEntity{" +
                "report_message_id=" + report_message_id +
                ", dialnO='" + dialnO + '\'' +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", writetime='" + writetime + '\'' +
                ", writer='" + writer + '\'' +
                ", finallydialtime='" + finallydialtime + '\'' +
                ", success=" + success +
                ", locked=" + locked +
                ", billcode_id=" + billcode_id +
                ", billtype='" + billtype + '\'' +
                '}';
    }

    public Client_MessageEntity() {
    }

    public Client_MessageEntity(Integer report_message_id, String dialnO, String type, String content, String writetime, String writer, String finallydialtime, Integer success, Integer locked, Integer billcode_id, String billtype) {

        this.report_message_id = report_message_id;
        this.dialnO = dialnO;
        this.type = type;
        this.content = content;
        this.writetime = writetime;
        this.writer = writer;
        this.finallydialtime = finallydialtime;
        this.success = success;
        this.locked = locked;
        this.billcode_id = billcode_id;
        this.billtype = billtype;
    }
}
