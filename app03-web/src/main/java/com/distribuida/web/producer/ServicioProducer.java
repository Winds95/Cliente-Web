package com.distribuida.web.producer;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.distribuida.web.dto.ToDoDto;
import com.distribuida.web.dto.UsuarioDto;
import com.distribuida.web.servicios.HttpExaUtils;
import com.distribuida.web.servicios.ServicioToDo;
import com.distribuida.web.servicios.ServicioUsuarios;

@ApplicationScoped
public class ServicioProducer {

	public static final String URL = "http://localhost:7000/app03-gateway";
	
	@Produces
	@ApplicationScoped
	public ServicioUsuarios servicioUsuarios() {

		return new ServicioUsuarios() {

			@Override
			public List<UsuarioDto> listar() {

				UsuarioDto[] dtos = HttpExaUtils.invoke(URL + "/usuarios", UsuarioDto[].class);

				return Arrays.asList(dtos);
			}

			@Override
			public UsuarioDto buscar(Integer id) {
				return HttpExaUtils.invoke(URL + "/usuarios/" + id, UsuarioDto.class);
			}
		};
	}

	@Produces
	@ApplicationScoped
	public ServicioToDo servicioToDo() {

		return new ServicioToDo() {

			@Override
			public List<ToDoDto> listar() {

				ToDoDto[] dtos = HttpExaUtils.invoke(URL + "/todos", ToDoDto[].class);

				return Arrays.asList(dtos);
			}

			@Override
			public ToDoDto buscar(Integer id) {
				return HttpExaUtils.invoke(URL + "/todos/" + id, ToDoDto.class);
			}
		};
	}

}
