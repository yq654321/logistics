package com.shadow.entity;

//线路信息:
public class CircuitEntity {

    private Integer circuit_id;//线路ID

    private String startstation;//起点

    private String endstation;//终点

    private String distance;//里程

    private String fetchtime;//抵运时间

    public Integer getCircuit_id() {
        return circuit_id;
    }

    public void setCircuit_id(Integer circuit_id) {
        this.circuit_id = circuit_id;
    }

    public String getStartstation() {
        return startstation;
    }

    public void setStartstation(String startstation) {
        this.startstation = startstation;
    }

    public String getEndstation() {
        return endstation;
    }

    public void setEndstation(String endstation) {
        this.endstation = endstation;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getFetchtime() {
        return fetchtime;
    }

    public void setFetchtime(String fetchtime) {
        this.fetchtime = fetchtime;
    }

    @Override
    public String toString() {
        return "CircuitEntity{" +
                "circuit_id=" + circuit_id +
                ", startstation='" + startstation + '\'' +
                ", endstation='" + endstation + '\'' +
                ", distance='" + distance + '\'' +
                ", fetchtime='" + fetchtime + '\'' +
                '}';
    }

    public CircuitEntity() {
    }

    public CircuitEntity(Integer circuit_id, String startstation, String endstation, String distance, String fetchtime) {

        this.circuit_id = circuit_id;
        this.startstation = startstation;
        this.endstation = endstation;
        this.distance = distance;
        this.fetchtime = fetchtime;
    }
}

