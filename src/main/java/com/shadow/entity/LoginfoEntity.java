package com.shadow.entity;

//操作日志表
public class LoginfoEntity {
    private int logid;//日志ID
    private String opertype;//  操作类型
    private String content;//    操作内容
    private int userid;// 操作人
    private String opertime;//    操作时间

    public LoginfoEntity() {
    }

    public LoginfoEntity(int logid, String opertype, String content, int userid, String opertime) {
        this.logid = logid;
        this.opertype = opertype;
        this.content = content;
        this.userid = userid;
        this.opertime = opertime;
    }

    @Override
    public String toString() {
        return "loginfo{" +
                "logid=" + logid +
                ", opertype='" + opertype + '\'' +
                ", content='" + content + '\'' +
                ", userid=" + userid +
                ", opertime='" + opertime + '\'' +
                '}';
    }

    public int getLogid() {
        return logid;
    }

    public void setLogid(int logid) {
        this.logid = logid;
    }

    public String getOpertype() {
        return opertype;
    }

    public void setOpertype(String opertype) {
        this.opertype = opertype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getOpertime() {
        return opertime;
    }

    public void setOpertime(String opertime) {
        this.opertime = opertime;
    }
}