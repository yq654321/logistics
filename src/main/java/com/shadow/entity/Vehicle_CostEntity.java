package com.shadow.entity;

//车辆成本:
public class Vehicle_CostEntity {
    private String drivername;//司机名

    private String carno;//车号

    private String cartype;//车型

    private String allowcarryweight;//准载重量

    private String carwidth;//车厢宽度

    private String goodsheight;//载物高度

    private Float carryfeetotal;//承运费总计

    private Float addcarriagetotal;//加运费总计

    private Float factcarriagetotal;//实际总运费

    private String loadstation;//装货地点

    private String dealgoodsstation;//交货地点

    private String backbillcode;//回执单编号

    private String balancetime;//结算时间

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getAllowcarryweight() {
        return allowcarryweight;
    }

    public void setAllowcarryweight(String allowcarryweight) {
        this.allowcarryweight = allowcarryweight;
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

    public Float getFactcarriagetotal() {
        return factcarriagetotal;
    }

    public void setFactcarriagetotal(Float factcarriagetotal) {
        this.factcarriagetotal = factcarriagetotal;
    }

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

    public String getBackbillcode() {
        return backbillcode;
    }

    public void setBackbillcode(String backbillcode) {
        this.backbillcode = backbillcode;
    }

    public String getBalancetime() {
        return balancetime;
    }

    public void setBalancetime(String balancetime) {
        this.balancetime = balancetime;
    }

    @Override
    public String toString() {
        return "Vehicle_CostEntity{" +
                "drivername='" + drivername + '\'' +
                ", carno='" + carno + '\'' +
                ", cartype='" + cartype + '\'' +
                ", allowcarryweight='" + allowcarryweight + '\'' +
                ", carwidth='" + carwidth + '\'' +
                ", goodsheight='" + goodsheight + '\'' +
                ", carryfeetotal=" + carryfeetotal +
                ", addcarriagetotal=" + addcarriagetotal +
                ", factcarriagetotal=" + factcarriagetotal +
                ", loadstation='" + loadstation + '\'' +
                ", dealgoodsstation='" + dealgoodsstation + '\'' +
                ", backbillcode='" + backbillcode + '\'' +
                ", balancetime='" + balancetime + '\'' +
                '}';
    }

    public Vehicle_CostEntity() {
    }

    public Vehicle_CostEntity(String drivername, String carno, String cartype, String allowcarryweight, String carwidth, String goodsheight, Float carryfeetotal, Float addcarriagetotal, Float factcarriagetotal, String loadstation, String dealgoodsstation, String backbillcode, String balancetime) {

        this.drivername = drivername;
        this.carno = carno;
        this.cartype = cartype;
        this.allowcarryweight = allowcarryweight;
        this.carwidth = carwidth;
        this.goodsheight = goodsheight;
        this.carryfeetotal = carryfeetotal;
        this.addcarriagetotal = addcarriagetotal;
        this.factcarriagetotal = factcarriagetotal;
        this.loadstation = loadstation;
        this.dealgoodsstation = dealgoodsstation;
        this.backbillcode = backbillcode;
        this.balancetime = balancetime;
    }
}
