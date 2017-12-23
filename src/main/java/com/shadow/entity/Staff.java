package com.shadow.entity;

//职员信息:
public class Staff {
    private Integer staff_id;//职员编号

    private String staff_name;//职员姓名

    private String position;//职位

    private String gender;//性别

    private String birthday;//生日

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    @Override
    public String toString() {
        return "Staff{" +
                "staff_id=" + staff_id +
                ", staff_name='" + staff_name + '\'' +
                ", position='" + position + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public Staff() {
    }

    public Staff(Integer staff_id, String staff_name, String position, String gender, String birthday) {

        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.position = position;
        this.gender = gender;
        this.birthday = birthday;
    }
}
