package com.distribuida.web.dto;

import java.io.Serializable;

public class CompanyDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id_company;
	private String name;
	private String catchPhrase;
	private String bs;

	public Integer getId_company() {
		return id_company;
	}

	public void setId_company(Integer id_company) {
		this.id_company = id_company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

}
