package com.tzl.entity;

public class City {
    private Integer cityId;

    private String province;

    private String cityName;

    private Integer userId;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", province=" + province
				+ ", cityName=" + cityName + ", userId=" + userId + "]";
	}
    
    
}