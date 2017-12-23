package com.shadow.entity;

//管理费用
public class ManageEntity {

    private Integer manage_id;//管理ID

    private Float officefee;//办公费

    private Float houserent;//房租费

    private Float waterelecfee;//水电费

    private Float phonefee;//电话费

    private Float otherpayout;//其他支出

    private String payoutmonth;//支出月份

    private String writedate;//填写日期

    public Integer getManage_id() {
        return manage_id;
    }

    public void setManage_id(Integer manage_id) {
        this.manage_id = manage_id;
    }

    public Float getOfficefee() {
        return officefee;
    }

    public void setOfficefee(Float officefee) {
        this.officefee = officefee;
    }

    public Float getHouserent() {
        return houserent;
    }

    public void setHouserent(Float houserent) {
        this.houserent = houserent;
    }

    public Float getWaterelecfee() {
        return waterelecfee;
    }

    public void setWaterelecfee(Float waterelecfee) {
        this.waterelecfee = waterelecfee;
    }

    public Float getPhonefee() {
        return phonefee;
    }

    public void setPhonefee(Float phonefee) {
        this.phonefee = phonefee;
    }

    public Float getOtherpayout() {
        return otherpayout;
    }

    public void setOtherpayout(Float otherpayout) {
        this.otherpayout = otherpayout;
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
        return "ManageEntity{" +
                "manage_id=" + manage_id +
                ", officefee=" + officefee +
                ", houserent=" + houserent +
                ", waterelecfee=" + waterelecfee +
                ", phonefee=" + phonefee +
                ", otherpayout=" + otherpayout +
                ", payoutmonth='" + payoutmonth + '\'' +
                ", writedate='" + writedate + '\'' +
                '}';
    }

    public ManageEntity() {
    }

    public ManageEntity(Integer manage_id, Float officefee, Float houserent, Float waterelecfee, Float phonefee, Float otherpayout, String payoutmonth, String writedate) {

        this.manage_id = manage_id;
        this.officefee = officefee;
        this.houserent = houserent;
        this.waterelecfee = waterelecfee;
        this.phonefee = phonefee;
        this.otherpayout = otherpayout;
        this.payoutmonth = payoutmonth;
        this.writedate = writedate;
    }
}
