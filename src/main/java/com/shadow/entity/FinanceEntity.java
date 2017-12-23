package com.shadow.entity;

//财务费用
public class FinanceEntity {
    private Integer finance_id;//财务ID

    private Float financefee;//财务费用

    private String payoutmonth;//支出月份

    private String writedate;//填写日期

    public Integer getFinance_id() {
        return finance_id;
    }

    public void setFinance_id(Integer finance_id) {
        this.finance_id = finance_id;
    }

    public Float getFinancefee() {
        return financefee;
    }

    public void setFinancefee(Float financefee) {
        this.financefee = financefee;
    }

    public String getPayoutmonth() {
        return payoutmonth;
    }

    public void setPayoutmonth(String payoutmonth) {
        this.payoutmonth = payoutmonth;
    }

    public String getWritedate() {
        return writedate;
    }

    public void setWritedate(String writedate) {
        this.writedate = writedate;
    }

    @Override
    public String toString() {
        return "FinanceEntity{" +
                "finance_id=" + finance_id +
                ", financefee=" + financefee +
                ", payoutmonth='" + payoutmonth + '\'' +
                ", writedate='" + writedate + '\'' +
                '}';
    }

    public FinanceEntity() {
    }

    public FinanceEntity(Integer finance_id, Float financefee, String payoutmonth, String writedate) {

        this.finance_id = finance_id;
        this.financefee = financefee;
        this.payoutmonth = payoutmonth;
        this.writedate = writedate;
    }
}
