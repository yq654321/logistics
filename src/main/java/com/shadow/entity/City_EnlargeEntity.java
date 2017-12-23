package com.shadow.entity;

//城市扩充表
public class City_EnlargeEntity {
    private Integer city_enlarge_id;//城市扩充ID

    private Integer region_city_id;//地区城市PKID

    private String rangecity;//范围城市

    public Integer getCity_enlarge_id() {
        return city_enlarge_id;
    }

    public void setCity_enlarge_id(Integer city_enlarge_id) {
        this.city_enlarge_id = city_enlarge_id;
    }

    public Integer getRegion_city_id() {
        return region_city_id;
    }

    public void setRegion_city_id(Integer region_city_id) {
        this.region_city_id = region_city_id;
    }

    public String getRangecity() {
        return rangecity;
    }

    public void setRangecity(String rangecity) {
        this.rangecity = rangecity;
    }

    @Override
    public String toString() {
        return "City_EnlargeEntity{" +
                "city_enlarge_id=" + city_enlarge_id +
                ", region_city_id=" + region_city_id +
                ", rangecity='" + rangecity + '\'' +
                '}';
    }

    public City_EnlargeEntity() {
    }

    public City_EnlargeEntity(Integer city_enlarge_id, Integer region_city_id, String rangecity) {

        this.city_enlarge_id = city_enlarge_id;
        this.region_city_id = region_city_id;
        this.rangecity = rangecity;
    }
}
