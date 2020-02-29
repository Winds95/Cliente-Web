package com.distribuida.web.actions;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.distribuida.web.dto.GeoDto;
import com.distribuida.web.servicios.ServicioGeo;

import lombok.Getter;

@SessionScoped
@Named("geoAction")
public class GeoAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ServicioGeo servicio;

	@Getter
	private List<GeoDto> geos;
	@Getter
	private GeoDto geoSeleccionado;

	public String iniciar() {
		geos = servicio.listar();
		return "geos";
	}

	public String detalle(GeoDto dto) {
		geoSeleccionado = servicio.buscarPorId(dto.getId_geo());
		return "geo-detalle";
	}
	

}
