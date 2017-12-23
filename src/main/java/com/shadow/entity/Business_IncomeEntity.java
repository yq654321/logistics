package com.shadow.entity;

//营业外收入
public class Business_IncomeEntity {
    private Integer business_Income_id;//营业外ID

    private String name;//名称

    private Float money;//金额

    private String incomemonth;//收入月份

    private String writedate;//填写日期

    public Integer getBusiness_Income_id() {
        return business_Income_id;
    }

    public void setBusiness_Income_id(Integer business_Income_id) {
        this.business_Income_id = business_Income_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getIncomemonth() {
        return incomemonth;
    }

    public void setIncomemonth(String incomemonth) {
        this.incomemonth = incomemonth;
    }

    public String getWritedate() {
        return writedate;
    }

    public void setWritedate(String writedate) {
        this.writedate = writedate;
    }

    @Override
    public String toString() {
        return "Business_IncomeEntity{" +
                "business_Income_id=" + business_Income_id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", incomemonth='" + incomemonth + '\'' +
                ", writedate='" + writedate + '\'' +
                '}';
    }

    public Business_IncomeEntity() {
    }

    public Business_IncomeEntity(Integer business_Income_id, String name, Float money, String incomemonth, String writedate) {

        this.business_Income_id = business_Income_id;
        this.name = name;
        this.money = money;
        this.incomemonth = incomemonth;
        this.writedate = writedate;
    }
}
