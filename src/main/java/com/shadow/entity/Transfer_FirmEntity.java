package com.shadow.entity;

//中转公司信息表
public class Transfer_FirmEntity {

    private Integer transfer_firm_id;//中转公司id

    private String city;//城市

    private String companyname;//公司名称

    private String linkphone;//联系电话

    private String detailaddress;//详细地址

    @Override
    public String toString() {
        return "Transfer_FirmEntity{" +
                "transfer_firm_id=" + transfer_firm_id +
                ", city='" + city + '\'' +
                ", companyname='" + companyname + '\'' +
                ", linkphone='" + linkphone + '\'' +
                ", detailaddress='" + detailaddress + '\'' +
                '}';
    }

    public Transfer_FirmEntity() {
    }

    public Transfer_FirmEntity(Integer transfer_firm_id, String city, String companyname, String linkphone, String detailaddress) {

        this.transfer_firm_id = transfer_firm_id;
        this.city = city;
        this.companyname = companyname;
        this.linkphone = linkphone;
        this.detailaddress = detailaddress;
    }

    public Integer getTransfer_firm_id() {
        return transfer_firm_id;
    }

    public void setTransfer_firm_id(Integer transfer_firm_id) {
        this.transfer_firm_id = transfer_firm_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone;
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress;
    }
}