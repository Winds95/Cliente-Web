package com.distribuida.web.servicios;

import java.util.List;

import com.distribuida.web.dto.UsuarioDto;

public interface ServicioUsuarios {

	List<UsuarioDto> listar();

	UsuarioDto buscar(Integer id);

}
