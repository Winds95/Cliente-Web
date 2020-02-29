package com.distribuida.web.servicios;

import java.util.List;

import com.distribuida.web.dto.DireccionDto;

public interface ServicioDireccion {
	
	List<DireccionDto> listar();

	DireccionDto buscarPorId(Integer id);

}
