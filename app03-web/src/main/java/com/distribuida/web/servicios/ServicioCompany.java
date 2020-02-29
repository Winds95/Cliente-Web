package com.distribuida.web.servicios;

import java.util.List;

import com.distribuida.web.dto.CompanyDto;

public interface ServicioCompany {
	
	List<CompanyDto> listar();

	CompanyDto buscarPorId(Integer id);

}
