package com.shadow.entity;

//司机信息:
public class DriverEntity {
    private Integer driver_id;//司机ID

    private String drivername;//司机名称

    private String idcard;//身份证号

    private String phone;//电话

    private String mobile;//手机

    private String gender;//性别

    private String birthday;//出生日期

    private String state;//状态

    private String carno;//车号

    private String allowcarryvolume;//准载体积

    private String allowcarryweight;//准载重量

    private String address;//住址

    private String cartype;//车型

    private String carlength;//车厢长度

    private String cardept;//车属单位

    private String cardepttel;//车属单位电话

    private String drivelicence;//驾驶证

    private String runlicence;//行驶证

    private String bizlicence;//营运证

    private String insurancecard;//保险证

    private String carwidth;//车厢宽度

    private String goodsheight;//载物高度

    private String carframenO;//车架号

    private String engineno;//发动机号

    private String remark;//备注

    private Integer companycar;//公司车

    public Integer getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Integer driver_id) {
        this.driver_id = driver_id;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getAllowcarryvolume() {
        return allowcarryvolume;
    }

    public void setAllowcarryvolume(String allowcarryvolume) {
        this.allowcarryvolume = allowcarryvolume;
    }

    public String getAllowcarryweight() {
        return allowcarryweight;
    }

    public void setAllowcarryweight(String allowcarryweight) {
        this.allowcarryweight = allowcarryweight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getCarlength() {
        return carlength;
    }

    public void setCarlength(String carlength) {
        this.carlength = carlength;
    }

    public String getCardept() {
        return cardept;
    }

    public void setCardept(String cardept) {
        this.cardept = cardept;
    }

    public String getCardepttel() {
        return cardepttel;
    }

    public void setCardepttel(String cardepttel) {
        this.cardepttel = cardepttel;
    }

    public String getDrivelicence() {
        return drivelicence;
    }

    public void setDrivelicence(String drivelicence) {
        this.drivelicence = drivelicence;
    }

    public String getRunlicence() {
        return runlicence;
    }

    public void setRunlicence(String runlicence) {
        this.runlicence = runlicence;
    }

    public String getBizlicence() {
        return bizlicence;
    }

    public void setBizlicence(String bizlicence) {
        this.bizlicence = bizlicence;
    }

    public String getInsurancecard() {
        return insurancecard;
    }

    public void setInsurancecard(String insurancecard) {
        this.insurancecard = insurancecard;
    }

    public String getCarwidth() {
        return carwidth;
    }

    public void setCarwidth(String carwidth) {
        this.carwidth = carwidth;
    }

    public String getGoodsheight() {
        return goodsheight;
    }

    public void setGoodsheight(String goodsheight) {
        this.goodsheight = goodsheight;
    }

    public String getCarframenO() {
        return carframenO;
    }

    public void setCarframenO(String carframenO) {
        this.carframenO = carframenO;
    }

    public String getEngineno() {
        return engineno;
    }

    public void setEngineno(String engineno) {
        this.engineno = engineno;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCompanycar() {
        return companycar;
    }

    public void setCompanycar(Integer companycar) {
        this.companycar = companycar;
    }

    @Override
    public String toString() {
        return "DriverEntity{" +
                "driver_id=" + driver_id +
                ", drivername='" + drivername + '\'' +
                ", idcard='" + idcard + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", state='" + state + '\'' +
                ", carno='" + carno + '\'' +
                ", allowcarryvolume='" + allowcarryvolume + '\'' +
                ", allowcarryweight='" + allowcarryweight + '\'' +
                ", address='" + address + '\'' +
                ", cartype='" + cartype + '\'' +
                ", carlength='" + carlength + '\'' +
                ", cardept='" + cardept + '\'' +
                ", cardepttel='" + cardepttel + '\'' +
                ", drivelicence='" + drivelicence + '\'' +
                ", runlicence='" + runlicence + '\'' +
                ", bizlicence='" + bizlicence + '\'' +
                ", insurancecard='" + insurancecard + '\'' +
                ", carwidth='" + carwidth + '\'' +
                ", goodsheight='" + goodsheight + '\'' +
                ", carframenO='" + carframenO + '\'' +
                ", engineno='" + engineno + '\'' +
                ", remark='" + remark + '\'' +
                ", companycar=" + companycar +
                '}';
    }

    public DriverEntity() {
    }

    public DriverEntity(Integer driver_id, String drivername, String idcard, String phone, String mobile, String gender, String birthday, String state, String carno, String allowcarryvolume, String allowcarryweight, String address, String cartype, String carlength, String cardept, String cardepttel, String drivelicence, String runlicence, String bizlicence, String insurancecard, String carwidth, String goodsheight, String carframenO, String engineno, String remark, Integer companycar) {

        this.driver_id = driver_id;
        this.drivername = drivername;
        this.idcard = idcard;
        this.phone = phone;
        this.mobile = mobile;
        this.gender = gender;
        this.birthday = birthday;
        this.state = state;
        this.carno = carno;
        this.allowcarryvolume = allowcarryvolume;
        this.allowcarryweight = allowcarryweight;
        this.address = address;
        this.cartype = cartype;
        this.carlength = carlength;
        this.cardept = cardept;
        this.cardepttel = cardepttel;
        this.drivelicence = drivelicence;
        this.runlicence = runlicence;
        this.bizlicence = bizlicence;
        this.insurancecard = insurancecard;
        this.carwidth = carwidth;
        this.goodsheight = goodsheight;
        this.carframenO = carframenO;
        this.engineno = engineno;
        this.remark = remark;
        this.companycar = companycar;
    }
}
