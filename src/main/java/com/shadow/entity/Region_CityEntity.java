package com.shadow.entity;

//地区城市表:
public class Region_CityEntity {

    private Integer region_city_id;//地区城市ID

    private String city;//城市

    public Integer getRegion_city_id() {
        return region_city_id;
    }

    public void setRegion_city_id(Integer region_city_id) {
        this.region_city_id = region_city_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Region_CityEntity{" +
                "region_city_id=" + region_city_id +
                ", city='" + city + '\'' +
                '}';
    }

    public Region_CityEntity() {
    }

    public Region_CityEntity(Integer region_city_id, String city) {

        this.region_city_id = region_city_id;
        this.city = city;
    }
}
