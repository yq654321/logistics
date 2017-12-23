package com.shadow.entity;

//客户基本信息:
public class ClientEntity {
    private Integer client_id;//客户编号

    private String customer;//客户名称

    private String phone;//电话

    private String fax;//传真

    private String address;//地址

    private String postcode;//邮编

    private String linkman;//联系人

    private String linkmanmobile;//联系人手机

    private String customertype;//客户类型

    private String enterpriseproperty;//企业性质

    private String enterprisesize;//企业规模

    private String email;//电子邮件

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkmanmobile() {
        return linkmanmobile;
    }

    public void setLinkmanmobile(String linkmanmobile) {
        this.linkmanmobile = linkmanmobile;
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    public String getEnterpriseproperty() {
        return enterpriseproperty;
    }

    public void setEnterpriseproperty(String enterpriseproperty) {
        this.enterpriseproperty = enterpriseproperty;
    }

    public String getEnterprisesize() {
        return enterprisesize;
    }

    public void setEnterprisesize(String enterprisesize) {
        this.enterprisesize = enterprisesize;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ClientEntity{" +
                "client_id=" + client_id +
                ", customer='" + customer + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", linkman='" + linkman + '\'' +
                ", linkmanmobile='" + linkmanmobile + '\'' +
                ", customertype='" + customertype + '\'' +
                ", enterpriseproperty='" + enterpriseproperty + '\'' +
                ", enterprisesize='" + enterprisesize + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public ClientEntity() {
    }

    public ClientEntity(Integer client_id, String customer, String phone, String fax, String address, String postcode, String linkman, String linkmanmobile, String customertype, String enterpriseproperty, String enterprisesize, String email) {

        this.client_id = client_id;
        this.customer = customer;
        this.phone = phone;
        this.fax = fax;
        this.address = address;
        this.postcode = postcode;
        this.linkman = linkman;
        this.linkmanmobile = linkmanmobile;
        this.customertype = customertype;
        this.enterpriseproperty = enterpriseproperty;
        this.enterprisesize = enterprisesize;
        this.email = email;
    }
}
