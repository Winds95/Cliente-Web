package com.distribuida.web.dto;

import java.io.Serializable;

public class GeoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id_geo;
	private String latitude;
	private String longitude;

	public Integer getId_geo() {
		return id_geo;
	}

	public void setId_geo(Integer id_geo) {
		this.id_geo = id_geo;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
