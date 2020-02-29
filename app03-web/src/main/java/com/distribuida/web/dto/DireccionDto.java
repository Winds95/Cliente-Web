package com.distribuida.web.dto;

import java.io.Serializable;

public class DireccionDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id_direccion;
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	
	private Integer id_geo;

	public Integer getId_direccion() {
		return id_direccion;
	}

	public void setId_direccion(Integer id_direccion) {
		this.id_direccion = id_direccion;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getId_geo() {
		return id_geo;
	}

	public void setId_geo(Integer id_geo) {
		this.id_geo = id_geo;
	}

}
