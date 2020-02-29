package com.distribuida.web.actions;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.distribuida.web.dto.ToDoDto;
import com.distribuida.web.servicios.ServicioToDo;

import lombok.Getter;

@SessionScoped
@Named("todoAction")
public class ToDoAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ServicioToDo servicio;

	@Getter
	private List<ToDoDto> todos;
	@Getter
	private ToDoDto todoSeleccionado;

	public String iniciar() {
		todos = servicio.listar();
		return "todos";
	}

	public String detalle(ToDoDto dto) {
		todoSeleccionado = servicio.buscar(dto.getId());
		return "todo-detalle";
	}

}
