package com.distribuida.web.servicios;

import java.util.List;

import com.distribuida.web.dto.GeoDto;

public interface ServicioGeo {
	
	List<GeoDto> listar();

	GeoDto buscarPorId(Integer id);

}
