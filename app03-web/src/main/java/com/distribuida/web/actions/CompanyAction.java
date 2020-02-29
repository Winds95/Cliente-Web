package com.distribuida.web.actions;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.distribuida.web.dto.CompanyDto;
import com.distribuida.web.servicios.ServicioCompany;

import lombok.Getter;

@SessionScoped
@Named("companyAction")
public class CompanyAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ServicioCompany servicio;

	@Getter
	private List<CompanyDto> companies;
	@Getter
	private CompanyDto companySeleccionado;

	public String iniciar() {
		companies = servicio.listar();
		return "companies";
	}

	public String detalle(CompanyDto dto) {
		companySeleccionado = servicio.buscarPorId(dto.getId_company());
		return "company-detalle";
	}	
	

}
