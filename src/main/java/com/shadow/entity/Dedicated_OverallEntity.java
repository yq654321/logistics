package com.shadow.entity;

//2专线整体
public class Dedicated_OverallEntity {
    private String loadstation;//装货地点

    private String dealgoodsstation;//交货地点

    private Float allcarriagetotal;//总运费总计

    private Float insurancetotal;//保险费

    private Integer times;//次数

    public String getLoadstation() {
        return loadstation;
    }

    public void setLoadstation(String loadstation) {
        this.loadstation = loadstation;
    }

    public String getDealgoodsstation() {
        return dealgoodsstation;
    }

    public void setDealgoodsstation(String dealgoodsstation) {
        this.dealgoodsstation = dealgoodsstation;
    }

    public Float getAllcarriagetotal() {
        return allcarriagetotal;
    }

    public void setAllcarriagetotal(Float allcarriagetotal) {
        this.allcarriagetotal = allcarriagetotal;
    }

    public Float getInsurancetotal() {
        return insurancetotal;
    }

    public void setInsurancetotal(Float insurancetotal) {
        this.insurancetotal = insurancetotal;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "Dedicated_OverallEntity{" +
                "loadstation='" + loadstation + '\'' +
                ", dealgoodsstation='" + dealgoodsstation + '\'' +
                ", allcarriagetotal=" + allcarriagetotal +
                ", insurancetotal=" + insurancetotal +
                ", times=" + times +
                '}';
    }

    public Dedicated_OverallEntity() {
    }

    public Dedicated_OverallEntity(String loadstation, String dealgoodsstation, Float allcarriagetotal, Float insurancetotal, Integer times) {

        this.loadstation = loadstation;
        this.dealgoodsstation = dealgoodsstation;
        this.allcarriagetotal = allcarriagetotal;
        this.insurancetotal = insurancetotal;
        this.times = times;
    }
}
