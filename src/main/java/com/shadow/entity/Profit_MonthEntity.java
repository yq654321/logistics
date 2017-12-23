package com.shadow.entity;

//损益月报表:
public class Profit_MonthEntity {

    private Integer profit_month_id;//损益月报表ID

    private String category;//大类

    private String midcategory;//中类

    private String subtype;//小类

    private String money;//金额

    private String statstartdate;//统计起始日期

    private String statenddate;//统计结束日期

    private String balancedate;//结算日期

    public Integer getProfit_month_id() {
        return profit_month_id;
    }

    public void setProfit_month_id(Integer profit_month_id) {
        this.profit_month_id = profit_month_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMidcategory() {
        return midcategory;
    }

    public void setMidcategory(String midcategory) {
        this.midcategory = midcategory;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getStatstartdate() {
        return statstartdate;
    }

    public void setStatstartdate(String statstartdate) {
        this.statstartdate = statstartdate;
    }

    public String getStatenddate() {
        return statenddate;
    }

    public void setStatenddate(String statenddate) {
        this.statenddate = statenddate;
    }

    public String getBalancedate() {
        return balancedate;
    }

    public void setBalancedate(String balancedate) {
        this.balancedate = balancedate;
    }

    @Override
    public String toString() {
        return "Profit_MonthEntity{" +
                "profit_month_id=" + profit_month_id +
                ", category='" + category + '\'' +
                ", midcategory='" + midcategory + '\'' +
                ", subtype='" + subtype + '\'' +
                ", money='" + money + '\'' +
                ", statstartdate='" + statstartdate + '\'' +
                ", statenddate='" + statenddate + '\'' +
                ", balancedate='" + balancedate + '\'' +
                '}';
    }

    public Profit_MonthEntity() {
    }

    public Profit_MonthEntity(Integer profit_month_id, String category, String midcategory, String subtype, String money, String statstartdate, String statenddate, String balancedate) {

        this.profit_month_id = profit_month_id;
        this.category = category;
        this.midcategory = midcategory;
        this.subtype = subtype;
        this.money = money;
        this.statstartdate = statstartdate;
        this.statenddate = statenddate;
        this.balancedate = balancedate;
    }
}
