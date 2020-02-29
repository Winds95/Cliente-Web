package com.distribuida.web.actions;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.distribuida.web.dto.DireccionDto;
import com.distribuida.web.servicios.ServicioDireccion;

import lombok.Getter;

@SessionScoped
@Named("direccionAction")
public class DireccionAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ServicioDireccion servicio;

	@Getter
	private List<DireccionDto> direcciones;
	@Getter
	private DireccionDto direccionSeleccionado;

	public String iniciar() {
		direcciones = servicio.listar();
		return "direcciones";
	}

	public String detalle(DireccionDto dto) {
		direccionSeleccionado = servicio.buscarPorId(dto.getId_direccion());
		return "direccion-detalle";
	}
	

}
