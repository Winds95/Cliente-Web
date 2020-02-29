package com.distribuida.web.servicios;

import java.util.List;

import com.distribuida.web.dto.ToDoDto;

public interface ServicioToDo {

	List<ToDoDto> listar();

	ToDoDto buscar(Integer id);

}
