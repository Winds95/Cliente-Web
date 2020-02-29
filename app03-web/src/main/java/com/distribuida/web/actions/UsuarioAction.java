package com.distribuida.web.actions;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.distribuida.web.dto.UsuarioDto;
import com.distribuida.web.servicios.ServicioUsuarios;

import lombok.Getter;

@SessionScoped
@Named("usuarioAction")
public class UsuarioAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ServicioUsuarios servicio;

	@Getter
	private List<UsuarioDto> usuarios;
	@Getter
	private UsuarioDto usuarioSeleccionado;

	public String iniciar() {
		usuarios = servicio.listar();
		return "usuarios";
	}

	public String detalle(UsuarioDto dto) {
		usuarioSeleccionado = servicio.buscar(dto.getId());
		return "usuario-detalle";
	}

}
