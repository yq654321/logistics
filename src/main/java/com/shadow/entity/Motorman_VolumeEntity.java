package com.shadow.entity;

//司机运量:
public class Motorman_VolumeEntity {
    private String carno;//车号

    private Float carryfeetotal;//承运费总计

    private Float addcarriagetotal;//加运费总计

    private Float total;//总计

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public Float getCarryfeetotal() {
        return carryfeetotal;
    }

    public void setCarryfeetotal(Float carryfeetotal) {
        this.carryfeetotal = carryfeetotal;
    }

    public Float getAddcarriagetotal() {
        return addcarriagetotal;
    }

    public void setAddcarriagetotal(Float addcarriagetotal) {
        this.addcarriagetotal = addcarriagetotal;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Motorman_VolumeEntity{" +
                "carno='" + carno + '\'' +
                ", carryfeetotal=" + carryfeetotal +
                ", addcarriagetotal=" + addcarriagetotal +
                ", total=" + total +
                '}';
    }

    public Motorman_VolumeEntity() {
    }

    public Motorman_VolumeEntity(String carno, Float carryfeetotal, Float addcarriagetotal, Float total) {

        this.carno = carno;
        this.carryfeetotal = carryfeetotal;
        this.addcarriagetotal = addcarriagetotal;
        this.total = total;
    }
}
