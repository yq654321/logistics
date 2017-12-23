package com.shadow.entity;

//员工工资
public class Staff_SalaryEntity {

    private Integer staff_salary_id;//员工工资ID

    private Integer staff_id;//职员编号

    private Float basicwage;//基本工资

    private Float stationwage;//岗位工资

    private Float allowance;//津贴

    private String date;//日期

    private String employee;//职员姓名

    public Integer getStaff_salary_id() {
        return staff_salary_id;
    }

    public void setStaff_salary_id(Integer staff_salary_id) {
        this.staff_salary_id = staff_salary_id;
    }

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public Float getBasicwage() {
        return basicwage;
    }

    public void setBasicwage(Float basicwage) {
        this.basicwage = basicwage;
    }

    public Float getStationwage() {
        return stationwage;
    }

    public void setStationwage(Float stationwage) {
        this.stationwage = stationwage;
    }

    public Float getAllowance() {
        return allowance;
    }

    public void setAllowance(Float allowance) {
        this.allowance = allowance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Staff_SalaryEntity{" +
                "staff_salary_id=" + staff_salary_id +
                ", staff_id=" + staff_id +
                ", basicwage=" + basicwage +
                ", stationwage=" + stationwage +
                ", allowance=" + allowance +
                ", date='" + date + '\'' +
                ", employee='" + employee + '\'' +
                '}';
    }

    public Staff_SalaryEntity() {
    }

    public Staff_SalaryEntity(Integer staff_salary_id, Integer staff_id, Float basicwage, Float stationwage, Float allowance, String date, String employee) {

        this.staff_salary_id = staff_salary_id;
        this.staff_id = staff_id;
        this.basicwage = basicwage;
        this.stationwage = stationwage;
        this.allowance = allowance;
        this.date = date;
        this.employee = employee;
    }
}
